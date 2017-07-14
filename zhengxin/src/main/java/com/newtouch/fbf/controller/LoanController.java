package com.newtouch.fbf.controller;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.newtouch.fbf.entity.LoanInfoCheck;
import com.newtouch.fbf.entity.TSystemUser;
import com.newtouch.fbf.entity.TUserBaseinfo;
import com.newtouch.fbf.entity.TUserLoanInfo;
import com.newtouch.fbf.entity.TUserReport;
import com.newtouch.fbf.entity.TUserReportCount;
import com.newtouch.fbf.service.CheckHistoryService;
import com.newtouch.fbf.service.ImodelService;
import com.newtouch.fbf.service.TUserLoanInfoService;

/** * @author  wei * @date 创建时间：2016年10月21日 下午5:02:18 * @version 1.0 * @parameter  * @since  * @return  */
/**
 * 
 * <p>Title: 贷款 </p>
 * <p>Description:  </p>
 * @author
 * @date
 */
@RestController
public class LoanController {
    @Autowired
    private ImodelService imo;
	@Autowired
	private TUserLoanInfoService LoanInfo;
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	/**
	 * 显示贷款信息列表
	 * @param page
	 * @param loan
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/SubmitterAndCreateTime")
	public JSONPObject selectSubmitterAndCreateTime(String page,String loan,HttpServletRequest request){
		TUserBaseinfo user=(TUserBaseinfo) request.getSession().getAttribute("user");
		int page1=Integer.parseInt(page);
		List<TUserLoanInfo> infolist = (List<TUserLoanInfo>) LoanInfo.selectSubmitterAndCreateTimeByIdCard(page1,user.getIdCard());
		return new JSONPObject(loan, infolist);
	}
	
	@ResponseBody
	@RequestMapping(value="/selectloanNum")
	public JSONPObject selectloanNum(String callback,HttpServletRequest request){
		TUserBaseinfo user=(TUserBaseinfo) request.getSession().getAttribute("user");
		int num = LoanInfo.selectLoanInfoByIdCardNum(user.getIdCard());
		return new JSONPObject(callback, num);
	}
	
	
	@ResponseBody
	@RequestMapping(value="/LoanlistByCreatetime")
	public JSONPObject selectLoanListByCreatTime(String callbackparam,HttpServletRequest request,String createTime)
	{
		List<TUserLoanInfo> listBT=LoanInfo.selectSubmitterAndCreateTimeByIdCard(1,createTime);
		
		System.out.println(listBT.size());
		
		return new JSONPObject(callbackparam,listBT);
		
	}
	
	@ResponseBody
	@RequestMapping(value="/insertInfo1")
	public JSONPObject insertLoanInfo(/*TUserLoanInfo tUserLoanInfo,*/HttpServletRequest request,String firm)
	{
		TUserBaseinfo user=(TUserBaseinfo) request.getSession().getAttribute("user");
	//	TSystemUser tUser = (TSystemUser) request.getSession().getAttribute("tUser");
		String submitter = (String) request.getSession().getAttribute("loginName");
		if (submitter==null||"".equals(submitter)) {
			submitter="1@qq.com";
		}
		String borrowDate = request.getParameter("borrowDate");
		Date date=null;
		try {
			date = simpleDateFormat.parse(borrowDate);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String borrow_contractno = request.getParameter("borrow_contractno");
		System.out.println(date);
		String period = request.getParameter("period");
		String amount = request.getParameter("amount");
		String purpose = request.getParameter("purpose");
		String phone = request.getParameter("phone");
		String borrow_type = request.getParameter("borrow_type");
		String contact_address = request.getParameter("contact_address");
		String borrow_status = request.getParameter("borrow_status");
		String contactless = request.getParameter("contactless");
		String instalment_again = request.getParameter("instalment_again");
		String instalment_amount = request.getParameter("instalment_amount");
		String monthly_repay = request.getParameter("monthly_repay");
		String salary = request.getParameter("salary");
		String company_address = request.getParameter("company_address");
		String company_type = request.getParameter("company_type");
		String primary_reject = request.getParameter("primary_reject");
		//String csjj = request.getParameter("csjj");
		String chect = request.getParameter("chect");
		String reject_time = request.getParameter("reject_time");
		Date d = null;
		try {
			d = simpleDateFormat.parse(reject_time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String reject_amount = request.getParameter("reject_amount");
		String extension = request.getParameter("extension");
		String capital_debt = request.getParameter("capital_debt");
		String longterm_arrear = request.getParameter("longterm_arrear");
		String overdue = request.getParameter("overdue");
		String overdue_days = request.getParameter("overdue_days");
		String other_infos = request.getParameter("other_infos");
		//String idCard = (String) request.getSession().getAttribute("id_card");
		TUserLoanInfo tUserLoanInfo = new TUserLoanInfo();
		tUserLoanInfo.setId(UUID.randomUUID().toString());
		tUserLoanInfo.setIdCard(user.getIdCard());
		tUserLoanInfo.setSubmitter(submitter);
		tUserLoanInfo.setCreateTime(new Date());
		tUserLoanInfo.setBusinessType("A");
		tUserLoanInfo.setBorrowDate(date);
		tUserLoanInfo.setBorrowContractno(borrow_contractno);
		tUserLoanInfo.setPeriod(Integer.valueOf(period));
		tUserLoanInfo.setAmount(new BigDecimal(amount));
		tUserLoanInfo.setPhone(phone);
		request.getSession().setAttribute("phone", phone);
		System.out.println(phone);
		tUserLoanInfo.setPurpose(purpose);
		tUserLoanInfo.setBorrowType(borrow_type);
		tUserLoanInfo.setContactAddress(contact_address);
		if ("是".equals(borrow_status)) {
			tUserLoanInfo.setBorrowStatus(true);
		}else{
			tUserLoanInfo.setBorrowStatus(false);
		}
		//tUserLoanInfo.setBorrowStatus(Boolean.valueOf(borrow_status));
		if ("是".equals(contactless)) {
			tUserLoanInfo.setContactless(true);
		}else{
			tUserLoanInfo.setContactless(false);
		}
		//tUserLoanInfo.setContactless(Boolean.valueOf(contactless));
		if ("是".equals(instalment_again)) {
			tUserLoanInfo.setInstalmentAgain(true);
		}else{
			tUserLoanInfo.setInstalmentAgain(false);
		}
		//tUserLoanInfo.setInstalmentAgain(Boolean.valueOf(instalment_again));
		tUserLoanInfo.setInstalmentAmount(new BigDecimal(instalment_amount));
		tUserLoanInfo.setMonthlyRepay(new BigDecimal(monthly_repay));
		tUserLoanInfo.setSalary(new BigDecimal(salary));
		tUserLoanInfo.setCompanyAddress(company_address);
		tUserLoanInfo.setCompanyType(company_type);
		if ("是".equals(primary_reject)) {
			tUserLoanInfo.setPrimaryReject(true);
		}else{
			tUserLoanInfo.setPrimaryReject(false);
		}
		//tUserLoanInfo.setPrimaryReject(Boolean.valueOf(primary_reject));
		if ("是".equals(chect)) {
			tUserLoanInfo.setChect(true);
		}else{
			tUserLoanInfo.setChect(false);
		}
		//tUserLoanInfo.setChect(Boolean.valueOf(chect));
		tUserLoanInfo.setRejectTime(d);
		tUserLoanInfo.setRejectAmount(new BigDecimal(reject_amount));
		System.out.println("extension"+extension);
		if ("是".equals(extension)) {
			tUserLoanInfo.setExtension(true);
		}else{
			tUserLoanInfo.setExtension(false);
		}
		//tUserLoanInfo.setExtension(Boolean.valueOf(extension));
		System.out.println("capital_debt"+capital_debt);
		if ("是".equals(capital_debt)) {
			tUserLoanInfo.setCapitalDebt(true);
		}else{
			tUserLoanInfo.setCapitalDebt(false);
		}
		//tUserLoanInfo.setCapitalDebt(Boolean.valueOf(capital_debt));
		tUserLoanInfo.setLongtermArrear(Integer.valueOf(longterm_arrear));
		tUserLoanInfo.setOverdue(Integer.valueOf(overdue));
		tUserLoanInfo.setOverdueDays(overdue_days);
		tUserLoanInfo.setOtherInfos(other_infos);
		
		LoanInfo.insertLoanListInfo(tUserLoanInfo);
		return new JSONPObject(firm, tUserLoanInfo);
	}


	@Autowired
	private CheckHistoryService UserReport;
	
	@ResponseBody
	@RequestMapping(value="/CheckHistoryAlllist")
	public JSONPObject SelectHistory(String currentPage,String history,HttpServletRequest request)
	{
		int num=Integer.parseInt(currentPage);
		List<TUserReport> w=UserReport.selectAllList(num,10);
		//int reportNum=UserReport.reportNum();
		//w.get(0).setAge(reportNum);
		System.out.println(w.size());
		return new JSONPObject(history,w);
	}
	
	@RequestMapping(value="/CheckHistoryAlllistNum")
	public JSONPObject SelectHistoryNum(String callback,HttpServletRequest request)
	{
		int reportNum=UserReport.reportNum();
		return new JSONPObject(callback,reportNum);
	}
	
	
	
	
	
	@RequestMapping(value="/CheckHistoryAlllistNum1")
	public JSONPObject SelectHistoryNum1(String callback,String loanPhase,String productName,HttpServletRequest request)
	{
		int reportNum=UserReport.reportByNameNum(loanPhase, productName);
		return new JSONPObject(callback,reportNum);
	}
	
	@ResponseBody
	@RequestMapping(value="/CheckHistorylist")
	public JSONPObject selectByLoanphaseAndProductname(String currentPage,String callback,String loanPhase,String productName,HttpServletRequest request,HttpServletResponse response)
	{	
		List<TUserReport> q=null;
		TUserReport tReport=new TUserReport();
		try {
			int num=Integer.parseInt(currentPage);
			q = UserReport.selectByLoanphaseAndProductname(num,10,loanPhase, productName);
			int reportNum=UserReport.reportByNameNum(loanPhase, productName);
		/*	if (reportNum==0) {
				tReport.setAge(reportNum);
				q.add(0, tReport);
				
			}else{
				q.get(0).setAge(reportNum);
			}*/
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new JSONPObject(callback,q);
		
	}
	
	//获取通过idCard贷款信息
	@ResponseBody
	@RequestMapping(value="/getloanInfo")
	public TUserLoanInfo getloanInfo(String idCard){
		TUserLoanInfo tInfo = LoanInfo.getloanInfo(idCard);
		return tInfo;	
	}
	
	//通过报告编码获取用户名
	@ResponseBody
	@RequestMapping(value="/getname")
	public JSONPObject getLoanInfo(String code,String username,HttpServletRequest request){
		TUserBaseinfo user=(TUserBaseinfo) request.getSession().getAttribute("user");
		//LoanInfoCheck loanInfoCheck = imo.getLoanInfo(code);
		System.out.println(user.toString());
		return new JSONPObject(username, user);
		
	}
	
	
	@ResponseBody
	@RequestMapping(value="/SelectByCreatetime")
	public JSONPObject selectByCreatTime(String firm,HttpServletRequest request,String id)
	{
		System.out.println(firm+"   "+id);
		List<TUserLoanInfo> listBT=LoanInfo.selectAllByCreateTime(id);
		
		System.out.println(listBT.size());
		
		return new JSONPObject(firm,listBT.get(0));
		
	}
	
	
	
	@ResponseBody
	@RequestMapping(value="/updateRopertAndCount")
	public JSONPObject updateRopertAndCount(String updateReport,HttpServletRequest request,String reportCode)
	{
		System.out.println(updateReport+"  "+reportCode);
		String idcard=reportCode.substring(0, 18);
	    System.out.println(idcard);
		TUserReportCount count = imo.getTUserReportCount(idcard);
		count.setLastTime(new Date());
		imo.updateTUserReportCount(count);
		
		TUserReport t = imo.getTUserReport(reportCode);
		t.setUpdateTime(new Date());
		imo.updateTUserReport(t);
		
		
		return new JSONPObject(updateReport,1999);
		
	}
}
