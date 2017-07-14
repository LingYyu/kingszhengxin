package com.newtouch.fbf.controller;/** * @author  wei * @date 创建时间：2016年10月27日 下午4:49:53 * @version 1.0 * @parameter  * @since  * @return  */

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.newtouch.fbf.common.Modules;
import com.newtouch.fbf.common.UploadReportPDF;
import com.newtouch.fbf.common.utility.IdCardByNameAgeSex;
import com.newtouch.fbf.entity.DrivingLicenseCheck;
import com.newtouch.fbf.entity.EducationInfoCheck;
import com.newtouch.fbf.entity.FlightInfoCheck;
import com.newtouch.fbf.entity.IllegalInfoCheck;
import com.newtouch.fbf.entity.LegalPersonCheck;
import com.newtouch.fbf.entity.LoanInfoCheck;
import com.newtouch.fbf.entity.TUserBaseinfo;
import com.newtouch.fbf.entity.TUserModule;
import com.newtouch.fbf.entity.TUserReport;
import com.newtouch.fbf.entity.TUserReportCount;
import com.newtouch.fbf.entity.TUserReportDetail;
import com.newtouch.fbf.service.ExcelService;
import com.newtouch.fbf.service.ITUserService;
import com.newtouch.fbf.service.ImodelService;


/**
 * <p>
 * Title: 模块
 * </p>
 * <p>
 * Description:模块列表相关的控制层
 * </p>
 * 
 * @author
 * @date
 */

@Controller
public class ModelController {
	@Autowired
	private ImodelService iModelService;
	@Autowired
	private ITUserService iTuser;

	@ResponseBody
	@RequestMapping(value = "/insertTUserModel")
	public JSONPObject insertTUserModel(String infor, HttpServletRequest request, HttpServletResponse response) {
		TUserBaseinfo user=(TUserBaseinfo) request.getSession().getAttribute("user");

		TUserModule t=new TUserModule();
		String daiKjd = request.getParameter("daiKjd");
		String productName = request.getParameter("productName");
		request.getSession().setAttribute("daiKjd",daiKjd);
		request.getSession().setAttribute("productName",productName);
		String gRengInfo = request.getParameter("gRengInfo");
		String dKuanInfo = request.getParameter("dKuanInfo");
		String xinshiInfo = request.getParameter("xinshiInfo");
		String weizhangInfo = request.getParameter("weizhangInfo");
		String feixinInfo = request.getParameter("feixinInfo");
		String hulianInfo = request.getParameter("hulianInfo");
		
		t.setId(UUID.randomUUID().toString());
		t.setBusinessType("A");
		//判断是否选中工商信息核查
		if (gRengInfo.equals("1")) {
			t.setBusinessChoose(true);
		}else{
			t.setBusinessChoose(false);
		}
		//判断是否选中贷款信息核查
		if (dKuanInfo.equals("1")) {
			t.setLoanChoose(true);
		}else{
			t.setLoanChoose(false);
		}
		//判断是否选中行驶证信息核查
		if (xinshiInfo.equals("1")) {
			t.setDrivingChoose(true);
		}else{
			t.setDrivingChoose(false);
		}
		//判断是否选中违章信息核查
		if(weizhangInfo.equals("1")){
			t.setIllegalChoose(true);
		}else{
			t.setIllegalChoose(false);
		}
		//判断是否选中飞行信息核查
		if (feixinInfo.equals("1")) {
			t.setFlyChoose(true);
		}else{
			t.setFlyChoose(false);
		}
		//判断是否选中互联网信息核查
		if (hulianInfo.equals("1")) {
			t.setInternetChoose(true);
		}else{
			t.setInternetChoose(false);
		}
		t.setIdCard(user.getIdCard());
		int num = iModelService.getUserReportNum(user.getIdCard());
		String report_code = user.getIdCard() + "-" + String.format("%03d", num + 1);
		t.setReportCode(report_code);
		t.setReportId(report_code);
		t.setIsActive(false);
		
		try {
			TUserModule t1 = iModelService.getTuserModel(report_code);
			// 如果表中存在该用户的信息
			if (t1 != null) {
				iModelService.updateTuserModel(t);
			} else {
				iModelService.insertTuserModel(t);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new JSONPObject(infor, 666);
	}

	// 插入飞行信息
	/**
	 * @param request
	 * @param response
	 * @return
	 */
	public FlightInfoCheck insertFlightInfoCheck(TUserBaseinfo user) {
		//TUserBaseinfo user=(TUserBaseinfo) request.getSession().getAttribute("user");
		// 根据用户的id_card查询用户的报告数
		int num=0;
		try {
			num = iModelService.getUserReportNum(user.getIdCard());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		// 征信报告编码report_code
		String report_code = user.getIdCard() + "-" + String.format("%03d", num + 1);

		FlightInfoCheck l = new FlightInfoCheck();
		l.setId(UUID.randomUUID().toString());
		l.setReportCode(report_code);
		l.setBusinessType("B");
		l.setFlightName(user.getUserName());
		l.setFlightCard(user.getIdCard());
		l.setFirstClass("12次");
		l.setFlightTimes("22次");
		l.setFinallyArrived("北京");
		l.setYearFightTimes("6次");
		l.setEconomyClass("6次");
		l.setFrequentReachCity("上海");
		l.setAverageFare("1000");
		l.setTotalFlight("18000公里");
		l.setMemoryTime(new Date());
		l.setIsDelete("0");
		try {
			FlightInfoCheck loanInfo = iModelService.getFlightInfoCheck(report_code);
			
			// 如果表中存在该用户的信息
			if (loanInfo != null) {
				iModelService.updateFlightInfoCheck(l);
			} else {
				iModelService.insertFlightInfoCheck(l);
			}
		} catch (Exception e) {
			//iModelService.insertFlightInfoCheck(l);
			e.printStackTrace();
		}

		return l;
	}

	// 插入贷款信息
	public LoanInfoCheck insertLoanInfo(TUserBaseinfo user) {
		//TUserBaseinfo user=(TUserBaseinfo) request.getSession().getAttribute("user");
		// 根据用户的id_card查询用户的报告数
		int num=0;
		try {
			num = iModelService.getUserReportNum(user.getIdCard());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		// 征信报告编码report_code
		String report_code = user.getIdCard() + "-" + String.format("%03d", num + 1);

		LoanInfoCheck l = new LoanInfoCheck();
		l.setId(UUID.randomUUID().toString());
		l.setReportCode(report_code);
		l.setBusinessType("B");
		l.setName(user.getUserName());
		l.setIdCard(user.getIdCard());
		l.setOtherLoans("是");
		l.setLoanDate(new Date());
		l.setUsingLoan("买房");
		l.setMobile(user.getTelephone());
		l.setLoanType("信用贷款");
		l.setLoanAmount(new BigDecimal(14));
		l.setLoanDeadline("6个月");
		l.setAddress("江西吉安");
		l.setLoanBlacklist("否");
		l.setMemoryTime(new Date());
		l.setIsDelete("0");
		
		try {
			LoanInfoCheck loanInfo = iModelService.getLoanInfo(report_code);
			// 如果表中存在该用户的信息
			if (loanInfo != null) {
				iModelService.updateLoanInfo(l);
			} else {
				iModelService.insertLoanInfo(l);
			}
		} catch (Exception e) {
			//iModelService.insertLoanInfo(l);
			e.printStackTrace();
		}

		return l;
	}

	// 获取贷款信息
	@ResponseBody
	@RequestMapping(value = "/getLoanInfo")
	public LoanInfoCheck getLoanInfo(HttpServletRequest request, HttpServletResponse response, String code) {
		LoanInfoCheck l = iModelService.getLoanInfo(code);
		return l;
	}

	// 插入个人工商信息
	public  LegalPersonCheck insertLegalPersonCheck(TUserBaseinfo user) {
		//TUserBaseinfo user=(TUserBaseinfo) request.getSession().getAttribute("user");
		
		// 根据用户的id_card查询用户的报告数
		int num=0;
		try {
			num = iModelService.getUserReportNum(user.getIdCard());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		// 征信报告编码report_code
		String report_code = user.getIdCard() + "-" + String.format("%03d", num + 1);
		LegalPersonCheck l = new LegalPersonCheck();
		l.setId(UUID.randomUUID().toString());
		l.setBusinessType("B");
		l.setReportCode(report_code);
		l.setEnterpriseDishonesty("xx公司");
		l.setRegisteredCapital("100万");
		l.setOperatingPeriod("10年");
		l.setBusinessScope("外贸，批发 ");
		l.setBusinessStatus("正常运营");
		l.setShareholdersInfo(user.getUserName() + "出资50万 刘辉出资25万 王强出资25万 ");
		l.setEnterprisePosition(user.getUserName() + "/总裁   刘辉/副总裁   王强/总经理");
		l.setEnterpriseDishonesty("否");
		l.setEnterpriseName("俊雪公司");
		l.setExecutedName(user.getUserName());
		l.setGender(IdCardByNameAgeSex.Sex(user.getIdCard()));
		l.setIdCard(user.getIdCard());
		l.setFilingTime(new Date());
		l.setCourtExecution("XX法院");
		l.setLegalPerson(user.getUserName());
		l.setOpeningDate("1999/7/27");
		l.setEnterpriseType("股份有限公司");
		l.setRegistAuthority("上海市工商行政管理局");
		l.setRegistAddress("上海市");
		l.setDishonestyType("逾期还款");
		// 年龄
		l.setDishonestyAge(IdCardByNameAgeSex.Age(user.getIdCard()));
		l.setIdcardAddress("河南洛阳 ");
		l.setCaseStatus("执行中");
		l.setExecutiveSubject("36万");

		l.setMemoryTime(new Date());
		l.setIsDelete("0");
		// 如果表中存在该用户的信息
		try {
			LegalPersonCheck legalPersonCheck = iModelService.getLegalPersonCheck(report_code);
			if (legalPersonCheck != null) {
				iModelService.updateLegalPersonCheck(l);
			} else {
				iModelService.insertLegalPersonCheck(l);
			}
		} catch (Exception e) {
			
			//iModelService.insertLegalPersonCheck(l);
			e.printStackTrace();
		}

		return l;
	}

	// 根据code获取个人工商信息
	@ResponseBody
	@RequestMapping(value = "/getLegalPersonCheck")
	public LegalPersonCheck getLegalPersonCheck(HttpServletRequest request, HttpServletResponse response, String code) {
		LegalPersonCheck l = iModelService.getLegalPersonCheck(code);
		return l;
	}

	// 插入行驶证信息
	@ResponseBody
	@RequestMapping(value = "/insertDrivingLicenseCheck")
	public DrivingLicenseCheck insertDrivingLicenseCheck(String driver, String carNumber, String vehicleType,
			HttpServletRequest request, HttpServletResponse response) {
		request.getSession().setAttribute("carNumber", carNumber);
		request.getSession().setAttribute("vehicleType", vehicleType);
		TUserBaseinfo user=(TUserBaseinfo) request.getSession().getAttribute("user");
	
		// 根据用户的id_card查询用户的报告数
		int num=0;
		try {
			num = iModelService.getUserReportNum(user.getIdCard());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		// 征信报告编码report_code
		String report_code = user.getIdCard() + "-" + String.format("%03d", num + 1);

		DrivingLicenseCheck d = new DrivingLicenseCheck();
		
		d.setBusinessType("B");
		d.setReportCode(report_code);
		d.setDrivingCarNo(carNumber);
		d.setDrivingCarName(user.getUserName());
		d.setDrivingCarStatus("未违法");
		d.setDrivingCarColor("黑色");
		d.setDengineNo("C190C8008");
		d.setIssueDate(new Date("2012/12/12"));
		d.setDcarFrameNo("LSV235E789K056");
		d.setDrivingCarType("宝马");
		d.setIdCard(user.getIdCard());
		d.setUseProperty("私人");
		d.setMaturityDate(new Date("2017/12/12"));
		d.setAddress("江西吉安");
		d.setInitialRegistDate(new Date("2012/12/12"));
		d.setMemoryTime(new Date());
		d.setIsDelete("0");
		try {
			DrivingLicenseCheck DrivingLicenseCheck = iModelService.getDrivingLicenseCheck(report_code);
			
			// 如果表中存在该用户的信息
			if (DrivingLicenseCheck != null) {
				iModelService.updateDrivingLicenseCheck(d);
			} else {
				d.setId(UUID.randomUUID().toString());
				iModelService.insertDrivingLicenseCheck(d);
			}
		} catch (Exception e) {
			/*d.setId(UUID.randomUUID().toString());
			iModelService.insertDrivingLicenseCheck(d);*/
			e.printStackTrace();
		}
		return d;
	}

	// 根据code获取行驶证信息
	@ResponseBody
	@RequestMapping(value = "/getDrivingLicenseCheck")
	public DrivingLicenseCheck getDrivingLicenseCheck(HttpServletRequest request, HttpServletResponse response,
			String code) {
		DrivingLicenseCheck d = iModelService.getDrivingLicenseCheck(code);
		return d;
	}

	// 插入违章查询信息
	@ResponseBody
	@RequestMapping(value = "/insertIllegalInfoCheck")
	public IllegalInfoCheck insertIllegalInfoCheck(String violation, String vcarNumber, String vin3, String engine3,
			String vvehicleType, HttpServletRequest request, HttpServletResponse response) {
		
		TUserBaseinfo user=(TUserBaseinfo) request.getSession().getAttribute("user");
		// 根据用户的id_card查询用户的报告数
		int num = iModelService.getUserReportNum(user.getIdCard());
		// 征信报告编码report_code
		String report_code = user.getIdCard() + "-" + String.format("%03d", num + 1);
		IllegalInfoCheck d = new IllegalInfoCheck();
		d.setId(UUID.randomUUID().toString());
		d.setBusinessType("B");
		d.setReportCode(report_code);
		d.setDrivingCarName(user.getUserName());
		d.setIdCard(user.getIdCard());
		d.setViolationTime(new Date());
		d.setViolationReason(engine3);
		d.setViolationBills(new BigDecimal(600));
		d.setViolationAddress(vin3);
		d.setViolationPlace(vin3);
		d.setIllegalDeduction("6");
		d.setMobile(user.getTelephone());
		d.setExecutiveBranch("上海公安局 ");

		d.setMemoryTime(new Date());
		d.setIsDelete("0");
		try {
			IllegalInfoCheck IllegalInfoCheck = iModelService.getIllegalInfoCheck(report_code);
			// 如果表中存在该用户的信息
			if (IllegalInfoCheck != null) {
				iModelService.updateIllegalInfoCheck(d);
			} else {
				iModelService.insertIllegalInfoCheck(d);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return d;
	}

	// 根据code获取违章查询信息
	@ResponseBody
	@RequestMapping(value = "/getIllegalInfoCheck")
	public IllegalInfoCheck getIllegalInfoCheck(HttpServletRequest request, HttpServletResponse response, String code) {
		IllegalInfoCheck d = iModelService.getIllegalInfoCheck(code);
		return d;
	}

	// 通讯核查
	@ResponseBody
	@RequestMapping(value = "/insertTongxunInfo")
	public JSONPObject insertMobile(String phonechaxun, String phoneNumber, HttpServletRequest request,
			HttpServletResponse response) {
		
		TUserBaseinfo user=(TUserBaseinfo) request.getSession().getAttribute("user");
		TUserBaseinfo tUserBaseinfo = iTuser.findTUserBaseinfo(user.getIdCard());
		tUserBaseinfo.setTelephone(phoneNumber);
		request.getSession().setAttribute("telNum", phoneNumber);
		tUserBaseinfo.setCreateTime(new Date());
		tUserBaseinfo.setUpdateTime(new Date());
		
		iTuser.updateTobaseInfo(tUserBaseinfo);
		return null;
	}

	// 插入银行卡
	@ResponseBody
	@RequestMapping(value = "insertBankInfo")
	public void insertbankcard(String bankNumber, HttpServletRequest request, HttpServletResponse response) {
		
		request.getSession().setAttribute("bankCardNum", bankNumber);
	}

	// 根据code获取银行卡信息
	@ResponseBody
	@RequestMapping(value = "/getbankcard")
	public TUserReportDetail getbankcard(String code, HttpServletRequest request, HttpServletResponse response) {
		TUserReportDetail rd = iModelService.getbankcard(code);
		return rd;
	}

	// 根据code更新学历信息
	@ResponseBody
	@RequestMapping(value = "/updateduinfo")
	public String updateInfo(String code, HttpServletRequest request, HttpServletResponse response) {
		EducationInfoCheck educationInfoCheck = new EducationInfoCheck();
		educationInfoCheck.setReportCode("002");
		educationInfoCheck.setCollegeLevel("本科");
		educationInfoCheck.setStartTime(new Date());
		educationInfoCheck.setCollege("江西师范大学");
		educationInfoCheck.setSchoolNumber("2022312352");
		iModelService.updateInfo(educationInfoCheck);
		return "li";
	}

	// 插入学历信息
	@ResponseBody
	@RequestMapping(value = "/insertXueliInfo")
	public JSONPObject insertinfo(String xueweichaxun, HttpServletRequest request, HttpServletResponse response,
			String xueWei, String inSchoolTime, String xueXiao, String xueJHao) {
		java.text.SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM");
		TUserBaseinfo user=(TUserBaseinfo) request.getSession().getAttribute("user");
		// 根据用户的id_card查询用户的报告数
		int num = iModelService.getUserReportNum(user.getIdCard());
		// 征信报告编码report_code
		String report_code = user.getIdCard() + "-" + String.format("%03d", num + 1);
		EducationInfoCheck eCheck = new EducationInfoCheck();
		eCheck.setId(UUID.randomUUID().toString());
		eCheck.setBusinessType("B");
		eCheck.setIdCard(user.getIdCard());
		eCheck.setCollege(xueXiao);
		eCheck.setReportCode(report_code);
		eCheck.setCollegeLevel(xueWei);
		eCheck.setMajor("艺术");
		try {
			eCheck.setStartTime(formatter.parse(inSchoolTime));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		eCheck.setGraduationCon("11");
		eCheck.setDegreeCategory("222");
		eCheck.setStatus("333");
		eCheck.setSchoolNumber(xueJHao);
		eCheck.setDescription("卧栏夜听风吹雨");
		eCheck.setMemoryTime(new Date());
		eCheck.setIsDelete("0");
		request.getSession().setAttribute("xueli", eCheck);
		try {
			EducationInfoCheck edu = iModelService.getInfo(report_code);
			if (edu != null) {
				iModelService.updateInfo(eCheck);
			} else {
				iModelService.insertinfo(eCheck);
			}
		} catch (Exception e) {
			//iModelService.insertinfo(eCheck);
			e.printStackTrace();
		}
		return new JSONPObject(xueweichaxun, eCheck);
	}
	// 根据code获取学历信息
		@ResponseBody
		@RequestMapping(value = "/geteduinfo")
		public EducationInfoCheck getInfo(String code, HttpServletRequest request, HttpServletResponse response) {
			EducationInfoCheck eCheck = iModelService.getInfo("321322199108231259-002");
			return eCheck;
		}
		
		
		// 插入互联网信息
		@ResponseBody
		@RequestMapping(value = "insertInterenetInfo")
		public void insertInterenetInfo(String tphone,String taoBao, String taoPasd,String jingDong,String jPasd,HttpServletRequest request, HttpServletResponse response) {
			
			
			request.getSession().setAttribute("tphone", tphone);
			request.getSession().setAttribute("taoBao", taoBao);
			request.getSession().setAttribute("taoPasd", taoPasd);
			request.getSession().setAttribute("jingDong", jingDong);
			request.getSession().setAttribute("jPasd", jPasd);
		}
		
		
		//点击跳过按钮
		@ResponseBody
		@RequestMapping(value = "/tiaoguo")
		public JSONPObject tiaoguo(String tiaoguo, HttpServletRequest request, HttpServletResponse response) {
			TUserBaseinfo user=(TUserBaseinfo) request.getSession().getAttribute("user");
			int num = iModelService.getUserReportNum(user.getIdCard());
			String report_code = user.getIdCard() + "-" + String.format("%03d", num + 1);
			System.out.println(report_code);
			TUserModule tUserModule = iModelService.getTuserModel(report_code);
			if(tUserModule.getBusinessChoose()==true){
				//插入商户信息
				insertLegalPersonCheck(user);
			}
			if (tUserModule.getLoanChoose()==true) {
				
				insertLoanInfo(user);
			}
			if (tUserModule.getFlyChoose()==true) {
				
				insertFlightInfoCheck(user);
			}
			tUserModule.setIsActive(true);
			iModelService.updateTuserModel(tUserModule);
			
			//插入TUserReport表
			TUserReport tUserReport=new TUserReport();
			tUserReport.setId(UUID.randomUUID().toString());
			tUserReport.setBusinessType("A");
			tUserReport.setName(user.getUserName());
			tUserReport.setIdCard(user.getIdCard());
			tUserReport.setPublishTime(new Date());
			tUserReport.setReportCode(report_code);
			int mark=(int)(600+Math.random()*(1000-600+1));
			tUserReport.setMark(mark);
			String suggestion="E";
			if (mark<700) {
				suggestion="D";
			}
			if (mark<800&&mark>=700) {
				suggestion="C";
			}
			if (mark<900&&mark>=800) {
				suggestion="B";
			}
			if (mark<1000&&mark>=900) {
				suggestion="A";
			}
			tUserReport.setSuggestion(suggestion);
			String daiKjd=(String)request.getSession().getAttribute("daiKjd");
			String productName=(String)request.getSession().getAttribute("productName");
			tUserReport.setLoanPhase(daiKjd);
			tUserReport.setProductName(productName);
			tUserReport.setCheckTime(new Date());
			tUserReport.setUpdateTime(new Date());
			tUserReport.setAge(IdCardByNameAgeSex.Age(user.getIdCard()));
			tUserReport.setSex(IdCardByNameAgeSex.Sex(user.getIdCard()));
			tUserReport.setMobile(user.getTelephone());
			tUserReport.setBorrowType("信用借贷");
			tUserReport.setIsActive(true);
			iModelService.insertTUserReport(tUserReport);
			
			//插入报告详情表
			TUserReportDetail tDetail=new TUserReportDetail();
			tDetail.setId(UUID.randomUUID().toString());
			tDetail.setBusinessType("A");
			tDetail.setName(user.getUserName());
			tDetail.setIdCard(user.getIdCard());
			tDetail.setReportCode(report_code);
			tDetail.setBankCard((String)request.getSession().getAttribute("bankCardNum"));
			EducationInfoCheck eCheck=(EducationInfoCheck)request.getSession().getAttribute("xueli");
			tDetail.setSchoolDegree(eCheck.getCollegeLevel());
			tDetail.setSchoolStartime(eCheck.getStartTime());
			tDetail.setCollege(eCheck.getCollege());
			tDetail.setStudentNumber(eCheck.getSchoolNumber());
			tDetail.setCarNumber((String)request.getSession().getAttribute("carNumber"));
			tDetail.setCarType((String)request.getSession().getAttribute("vehicleType"));
			tDetail.setTaobaoNumber((String)request.getSession().getAttribute("taoBao"));
			tDetail.setTaobaoPwd((String)request.getSession().getAttribute("taoPasd"));
			tDetail.setJingdongNumber((String)request.getSession().getAttribute("jingDong"));
			tDetail.setJingdongPwd((String)request.getSession().getAttribute("jPasd"));
			tDetail.setIsActive(true);
			tDetail.setReportId(report_code);
			iModelService.insertTUserReportDetail(tDetail);
			//插入报告数表
			TUserReportCount tUserReportCount=new TUserReportCount();
			tUserReportCount.setId(UUID.randomUUID().toString());
			tUserReportCount.setIdCard(user.getIdCard());
			tUserReportCount.setCount(num+1);
			tUserReportCount.setLastTime(new Date());
			if (num==0) {
				iModelService.insertTUserReportCount(tUserReportCount);
			}else{
				iModelService.updateTUserReportCount(tUserReportCount);
			}	
			return new JSONPObject(tiaoguo, 9999);
		}
		

		// 跳转至模块选择页
		@ResponseBody
		@RequestMapping(value = "insetModelInfo")
		public JSONPObject toModule(String userModelInfo,String idCard,HttpServletRequest request, HttpServletResponse response) {
			TUserBaseinfo user=(TUserBaseinfo) request.getSession().getAttribute("user");			
			
			int num = iModelService.getUserReportNum(user.getIdCard());
			String report_code = user.getIdCard() + "-" + String.format("%03d", num);
			System.out.println(report_code);
			TUserModule tUserModule = iModelService.getTuserModel(report_code);
			Modules modules=new Modules();
			System.out.println(tUserModule.toString());
			if (tUserModule.getBusinessChoose()) {
				modules.setLagalPersonCheck(iModelService.getLegalPersonCheck(report_code));
			}
			if (tUserModule.getLoanChoose()) {
				modules.setLoanInfoCheck(iModelService.getLoanInfo(report_code));
			}
			
			if (tUserModule.getDrivingChoose()==true) {
				modules.setDrivingLicenseCheck(iModelService.getDrivingLicenseCheck(report_code));
			}
			if (tUserModule.getIllegalChoose()==true) {
				modules.setIllegalInfoCheck(iModelService.getIllegalInfoCheck(report_code));
			}
			if(tUserModule.getFlyChoose()){
				modules.setFlightInfoCheck(iModelService.getFlightInfoCheck(report_code));
			}
			if (tUserModule.getInternetChoose()) {
				modules.setFlightInfoCheck(iModelService.getFlightInfoCheck(report_code));
			}
			
			modules.settUserModule(tUserModule);
			modules.settUserReport(iModelService.getTUserReport(report_code));
			modules.setEducationInfoCheck(iModelService.getInfo(report_code));
			modules.settUserBaseinfo(user);
			modules.settUserReportDetail(iModelService.getTUserReportDetail(report_code));
			
			return new JSONPObject(userModelInfo, modules);
			
		}
		
		
		
		/**
		 * 根据id查找下载报告详情信息下载成PDF格式
		 * @param request
		 * @param response
		 * @return
		 */
	
		@ResponseBody 
		@RequestMapping(value = "/uploadReportPDF")
		public JSONPObject uploadReportPDF(String download,String reportCode,HttpServletRequest request,HttpServletResponse response){
			String idcard=reportCode.substring(0, 18);
			System.out.println(idcard);
			TUserBaseinfo user=iTuser.findTUserBaseinfo(idcard); 
		    String report_code=reportCode;
			TUserModule tUserModule = iModelService.getTuserModel(report_code);
		
			Modules modules=new Modules();
			
			if (tUserModule.getBusinessChoose()) {
				modules.setLagalPersonCheck(iModelService.getLegalPersonCheck(report_code));
			}
			if (tUserModule.getLoanChoose()) {
				modules.setLoanInfoCheck(iModelService.getLoanInfo(report_code));
			}
			
			if (tUserModule.getDrivingChoose()==true) {
				modules.setDrivingLicenseCheck(iModelService.getDrivingLicenseCheck(report_code));
			}
			if (tUserModule.getIllegalChoose()==true) {
				modules.setIllegalInfoCheck(iModelService.getIllegalInfoCheck(report_code));
			}
			if(tUserModule.getFlyChoose()){
				modules.setFlightInfoCheck(iModelService.getFlightInfoCheck(report_code));
			}
			if (tUserModule.getInternetChoose()) {
				modules.setFlightInfoCheck(iModelService.getFlightInfoCheck(report_code));
			}
			modules.settUserModule(tUserModule);
			modules.settUserReport(iModelService.getTUserReport(report_code));
			modules.setEducationInfoCheck(iModelService.getInfo(report_code));
			modules.settUserBaseinfo(user);
			modules.settUserReportDetail(iModelService.getTUserReportDetail(report_code));
			String name="E:\\"+user.getUserName()+"-"+report_code+".pdf";
			File file = new File(name);
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				new UploadReportPDF(file).generatePDF(modules);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return  new JSONPObject(download, 0);
		}
		
		
		@ResponseBody
		@RequestMapping(value = "shenchengCode")
		public JSONPObject shenchengCode(String shenchengCode,HttpServletRequest request, HttpServletResponse response) {
			TUserBaseinfo user=(TUserBaseinfo) request.getSession().getAttribute("user");			
			int num = iModelService.getTUserReportCount(user.getIdCard()).getCount();
			String report_code = user.getIdCard() + "-" + String.format("%03d", num);
			System.out.println("生成report_code:"+report_code);
			return  new JSONPObject(shenchengCode, report_code);
		}
		
		
		
	

}
