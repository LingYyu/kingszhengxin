package com.newtouch.fbf.controller;/** * @author  wei * @date 创建时间：2016年10月21日 下午4:59:34 * @version 1.0 * @parameter  * @since  * @return  */

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.newtouch.fbf.base.BaseController;
import com.newtouch.fbf.common.UploadUtils;
import com.newtouch.fbf.common.utility.IdCardByNameAgeSex;
import com.newtouch.fbf.entity.EducationInfoCheck;
import com.newtouch.fbf.entity.TUserBaseinfo;
import com.newtouch.fbf.entity.TUserBillingInformation;
import com.newtouch.fbf.entity.TUserModule;
import com.newtouch.fbf.entity.TUserReport;
import com.newtouch.fbf.entity.TUserReportCount;
import com.newtouch.fbf.entity.TUserReportDetail;
import com.newtouch.fbf.service.ITUserBillingInformation;
import com.newtouch.fbf.service.ITUserService;
import com.newtouch.fbf.service.ImodelService;
//import com.newtouch.fbf.service.TSystemUserServiceI;
import com.newtouch.fbf.service.TSystemUserServiceI;
import com.newtouch.fbf.service.TUserReportCountServiceI;

/**
 * 用户
 * <p>Title:  </p>
 * <p>Description:  </p>
 * @author
 * @date
 */
@RestController
public class UserController extends BaseController{
	@Autowired
	private TSystemUserServiceI tUserServiceI;
	@Autowired
	private ITUserService ts;
	@Autowired
	private TUserReportCountServiceI tCount;
	
	
	//@ResponseBody
	@RequestMapping(name = "/isInUserReport")
	public JSONPObject isInUserReport(String checkAll,String name,String id_card,String telNum,HttpServletRequest request,HttpServletResponse response){
		request.getSession().setAttribute("name", name);
		request.getSession().setAttribute("id_card", id_card);
		request.getSession().setAttribute("telNum", telNum);
		System.out.println(name+"  "+id_card+"  "+telNum);
		String info=tUserServiceI.isExist(name,id_card);
		System.out.println(info+"   "+checkAll);
		return  new JSONPObject(checkAll, info);
	}
	
	
	/**
	 * 录入基本信息信息
	 * @param telephone
	 * @param company_address
	 * @param company_phone
	 * @param user_email
	 * @param card_pic_url1
	 * @param card_pic_url2
	 * @param card_pic_url3
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/insertTobaseInfoTable")
	public JSONPObject insertTobaseInfoTable(String checkAll,HttpServletRequest request,HttpServletResponse response,
			@RequestParam(value = "P1", required = false) MultipartFile P1,
			@RequestParam(value = "P2", required = false) MultipartFile P2,
			@RequestParam(value = "P3", required = false) MultipartFile P3){
		String companyAddress = request.getParameter("companyAddress");
		String companyTel=request.getParameter("companyTel");
		String email=request.getParameter("email");
		System.out.println(P1.getOriginalFilename()+companyAddress+companyTel+email);
	
		String name=(String) request.getSession().getAttribute("name");
		
		String id_card=(String) request.getSession().getAttribute("id_card");
		String telNum=(String) request.getSession().getAttribute("telNum");
		TUserBaseinfo tUser=new TUserBaseinfo();
		tUser.setId(UUID.randomUUID().toString());
		tUser.setUserName(name);
		tUser.setIdCard(id_card);
		tUser.setTelephone(telNum);
		tUser.setCompanyAddress(companyAddress);
		tUser.setCompanyPhone(companyTel);
		tUser.setUserEmail(email);
		if (!P1.isEmpty()) {
			System.out.println("1111");
			tUser.setCardPicUrl1(UploadUtils.uploadFile(P1, request));
		}
		if (!P2.isEmpty()) {
			System.out.println("2222");
			tUser.setCardPicUrl2(UploadUtils.uploadFile(P2, request));
		}
		if (!P3.isEmpty()) {
			System.out.println("3333");
			tUser.setPersonPicUrl(UploadUtils.uploadFile(P3, request));
		}
		//假的
		tUser.setBusinessType("A");
		tUser.setFinanceInfoUrl("");
		tUser.setCreateUser("wei");
		tUser.setCreateTime(new Date());
		tUser.setUpdateUser("wei");
		tUser.setUpdateTime(new Date());
		request.getSession().setAttribute("user", tUser);
		tUserServiceI.insertTobaseInfoTable(tUser);
		return  new JSONPObject(checkAll, 200);
	}
	
	/**
	 * 上传补充资料
	 *
	 * @return
	 */
	@Autowired
	private ImodelService iModelService;
	@ResponseBody
	@RequestMapping(value = "/uploadAdditionalInformation")
	public JSONPObject uploadAdditionalInformation(String checkAll,String companyName,String zhiwei,String homeAddress,
			@RequestParam(value = "P1", required = false) MultipartFile P1,
			@RequestParam(value = "P2", required = false) MultipartFile P2,
			@RequestParam(value = "P3", required = false) MultipartFile P3,
			HttpServletRequest request,HttpServletResponse response){
		TUserBaseinfo user=(TUserBaseinfo) request.getSession().getAttribute("user");
		TUserBaseinfo tUser=ts.findTUserBaseinfo(user.getIdCard());
		System.out.println(checkAll+" "+companyName+" "+zhiwei+" "+homeAddress);
		tUser.setCompanyName(companyName);
		tUser.setPosition(zhiwei);
		tUser.setHomeAddress(homeAddress);
		if (!P1.isEmpty()) {
			tUser.setAddressInfoUrl(UploadUtils.uploadFile(P1, request));
		}
		if (!P2.isEmpty()) {
			tUser.setJobInfoUrl(UploadUtils.uploadFile(P2, request));
		}
		if (!P3.isEmpty()) {
			tUser.setFinanceInfoUrl(UploadUtils.uploadFile(P3, request));
		}
		//假的
		tUser.setBusinessType("A");
		tUser.setCreateUser("wei");
		tUser.setCreateTime(new Date());
		tUser.setUpdateUser("wei");
		tUser.setUpdateTime(new Date());
		ts.updateTobaseInfo(tUser);
		return  new JSONPObject(checkAll, 200);
		
	}
	
	
	/**
	 * 显示补充资料
	 *
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/showAdditionalInformation")
	public JSONPObject showAdditionalInformation(String checkAll,HttpServletRequest request,HttpServletResponse response){
		TUserBaseinfo tUser=(TUserBaseinfo) request.getSession().getAttribute("user");
		
		return  new JSONPObject(checkAll, tUser);
	}
	
	
	
	/**
	 * 编辑补充资料
	 *
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/editAdditionalInformation")
	public JSONPObject editAdditionalInformation(String checkAll,String inputaddress,String inputposition,String inputemail,
			@RequestParam(value = "P1", required = false) MultipartFile P1,
			@RequestParam(value = "P2", required = false) MultipartFile P2,
			@RequestParam(value = "P3", required = false) MultipartFile P3,
			HttpServletRequest request,HttpServletResponse response){
		System.out.println(checkAll+"  "+inputaddress+" "+inputemail+" "+inputposition);
		
		TUserBaseinfo tUser=(TUserBaseinfo) request.getSession().getAttribute("user");
		System.out.println(tUser.toString());
		tUser.setCompanyAddress(inputaddress);
		tUser.setPosition(inputposition);
		tUser.setUserEmail(inputemail);
		if (!P1.isEmpty()) {
			tUser.setAddressInfoUrl(UploadUtils.uploadFile(P1, request));
		}
		if (!P2.isEmpty()) {
			tUser.setJobInfoUrl(UploadUtils.uploadFile(P2, request));
		}
		if (!P3.isEmpty()) {
			tUser.setFinanceInfoUrl(UploadUtils.uploadFile(P3, request));
		}
		//假的
		tUser.setBusinessType("A");
		tUser.setCreateUser("wei");
		tUser.setCreateTime(new Date());
		tUser.setUpdateUser("wei");
		tUser.setUpdateTime(new Date());
		ts.updateTobaseInfo(tUser);
		return  new JSONPObject(checkAll, 200);
	}
	
	//分页显示用户列表
	@ResponseBody
	@RequestMapping(value = "/showAllUserReportNum")
	public JSONPObject showAllUserReportNum(String page,String callbackparam,HttpServletRequest request,HttpServletResponse response){
		System.out.println(callbackparam);
		int pageNum=Integer.parseInt(page);
		List<TUserReportCount> list=tCount.findAllPage(pageNum);		
		return  new JSONPObject(callbackparam, list);
	}
	//查询用户列表数量
	@ResponseBody
	@RequestMapping(value = "/selectUserNum")
	public JSONPObject selectUserNum(String callbackparam,HttpServletRequest request,HttpServletResponse response){
		System.out.println(callbackparam);
		List<TUserReportCount> list=tCount.findAll();
		System.out.println("数量"+list.size());
		return  new JSONPObject(callbackparam, list.size());
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/selectUser")
	public JSONPObject selectUser(String callbackparam,String name,String idCard,HttpServletRequest request,HttpServletResponse response){
		System.out.println(callbackparam+"   "+name+idCard);
		List<TUserReportCount> list=null;
		if ((name==null||name=="")&&(idCard==null||idCard=="")) {
			System.out.println("111");
			list=tCount.findAll();
		}else if((name==null||name=="")&&(idCard!=null||idCard!="")){
			System.out.println("222");
			list=tCount.selectcountByidcard(idCard);
		}else if ((name!=null||name!="")&&(idCard==null||idCard=="")) {
			System.out.println("333");
			list=tCount.selectcountByName(name);
		}else {
			System.out.println("444");
			list=tCount.selectcountByName(name);
		}	
		return  new JSONPObject(callbackparam, list);
	}
	
	
	
	
	//查询用户列表数量
	@ResponseBody
	@RequestMapping(value = "/insetPhoneNumber")
	public JSONPObject insetPhoneNumber(String PhoneInfo,HttpServletRequest request,HttpServletResponse response){
		System.out.println(PhoneInfo);
		TUserBaseinfo t = (TUserBaseinfo)request.getSession().getAttribute("user");
		System.out.println(t.getTelephone());
		return  new JSONPObject(PhoneInfo,t.getTelephone());
	}
	
}

