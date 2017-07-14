package com.newtouch.fbf.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.newtouch.fbf.common.Test1;
import com.newtouch.fbf.entity.DrivingLicenseCheck;
import com.newtouch.fbf.entity.EducationInfoCheck;
import com.newtouch.fbf.entity.FlightInfoCheck;
import com.newtouch.fbf.entity.IllegalInfoCheck;
import com.newtouch.fbf.entity.LegalPersonCheck;
import com.newtouch.fbf.entity.LoanInfoCheck;
import com.newtouch.fbf.entity.TUserBaseinfo;
import com.newtouch.fbf.entity.TUserModule;
import com.newtouch.fbf.entity.TUserReport;
import com.newtouch.fbf.service.ITUserService;
import com.newtouch.fbf.service.ImodelService;
import com.newtouch.fbf.service.TUserReportService;
import com.fasterxml.jackson.databind.util.JSONPObject;

@Controller
public class TUserReportController {
	@Autowired
	private TUserReportService tuserreportservice;
	@Autowired
	private ImodelService imodel;
	@Autowired
	private ITUserService iTuser;
	// 在模块选择勾选后,显示勾选模块的信息
	@ResponseBody
	@RequestMapping(value = "/getTUserModel")
	public JSONPObject getTUserModel(String code, String report_details, HttpServletRequest request,
			HttpServletResponse response) {
		String idcard=code.substring(0, 18);
		System.out.println(idcard);
		TUserBaseinfo user=iTuser.findTUserBaseinfo(idcard); 
		System.out.println("code:"+code);
		TUserModule tUserModule = imodel.getTuserModel(code);

		Test1 test1 = new Test1();
		if (tUserModule.getDrivingChoose() == true) {
			test1.setDrivinglicense(imodel.getDrivingLicenseCheck(code));
		}
		if (tUserModule.getFlyChoose() == true) {
			test1.setFlight(imodel.getFlightInfoCheck(code));
		}
		if (tUserModule.getBusinessChoose() == true) {
			test1.setLegal(imodel.getLegalPersonCheck(code));
		}
		if (tUserModule.getLoanChoose() == true) {
			test1.setLoan(imodel.getLoanInfo(code));
		}
		if (tUserModule.getDrivingChoose() == true) {
			test1.setDrivinglicense(imodel.getDrivingLicenseCheck(code));
		}
		if (tUserModule.getFlyChoose() == true) {
			test1.setFlight(imodel.getFlightInfoCheck(code));
		}
		if (tUserModule.getIllegalChoose() == true) {
			test1.setIllegal(imodel.getIllegalInfoCheck(code));
		}
		test1.settUserBaseinfo(user);
		test1.settUserModule(tUserModule);
		test1.setEdu(imodel.getInfo(code));
		test1.setTuser(imodel.getTUserReport(code));
		System.out.println(test1);
		return new JSONPObject(report_details, test1);
	}

	// 获取基本信息
	@ResponseBody
	@RequestMapping(value = "/getreport")
	public JSONPObject geTUserReport(String report_details, String code, HttpServletRequest request,
			HttpServletResponse response,String idcard) {
		TUserReport t = tuserreportservice.geTUserReport(code);
		//t.setPublishTime(new Date());
		return new JSONPObject(report_details, t);
	}

	// 获取学历信息
	@ResponseBody
	@RequestMapping(value = "/getcollegelevel")
	public JSONPObject getcollegelevel(String report_details, String code, HttpServletRequest request,
			HttpServletResponse response) {
		EducationInfoCheck e = tuserreportservice.getcollegelevel(code);
		return new JSONPObject(report_details, e);
	}

	// 获取个人工商信息
	@ResponseBody
	@RequestMapping(value = "/getlpcheck")
	public JSONPObject getLegalPersonCheck(String report_details, String code, HttpServletRequest request,
			HttpServletResponse response) {
		LegalPersonCheck le = tuserreportservice.getLegalPersonCheck(code);
		return new JSONPObject(report_details, le);
	}

	// 获取贷款信息
	@ResponseBody
	@RequestMapping(value = "/loanInfo")
	public JSONPObject getLoanInfo(String report_details, String code, HttpServletRequest request,
			HttpServletResponse response) {
		LoanInfoCheck loanInfoCheck = imodel.getLoanInfo(code);
		return new JSONPObject(report_details, loanInfoCheck);
	}

	// 获取行驶证信息
	@ResponseBody
	@RequestMapping(value = "/getlicense")
	public JSONPObject getDrivingLicenseCheck(String report_details, String code, HttpServletRequest request,
			HttpServletResponse response) {
		DrivingLicenseCheck dCheck = imodel.getDrivingLicenseCheck(code);
		return new JSONPObject(report_details, dCheck);
	}

	// 获取违章信息
	@ResponseBody
	@RequestMapping(value = "/getillegalinfo")
	public JSONPObject getIllegalInfoCheck(HttpServletRequest request, HttpServletResponse response, String code,
			String report_details) {
		IllegalInfoCheck iCheck = imodel.getIllegalInfoCheck(code);
		return new JSONPObject(report_details, iCheck);
	}

	// 获取飞行信息
	@ResponseBody
	@RequestMapping(value = "/getflightinfo")
	public JSONPObject getFlightInfoCheck(String report_details, String code, HttpServletRequest request,
			HttpServletResponse response) {
		FlightInfoCheck fCheck = imodel.getFlightInfoCheck(code);
		return new JSONPObject(report_details, fCheck);
	}
   
	
}
