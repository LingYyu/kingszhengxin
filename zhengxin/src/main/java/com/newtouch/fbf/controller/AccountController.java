package com.newtouch.fbf.controller;/** * @author  wei * @date 创建时间：2016年10月21日 下午5:03:35 * @version 1.0 * @parameter  * @since  * @return  */

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.newtouch.fbf.entity.TUserBillingInformation;
import com.newtouch.fbf.service.ExcelService;
import com.newtouch.fbf.service.ITUserBillingInformation;

/**
 * 
 * <p>Title: 账户 </p>
 * <p>Description:  </p>
 * @author
 * @date
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
public class AccountController {
	
	@Autowired
	private ITUserBillingInformation information;
	private HttpSession session=null;
	/**
	 * 显示所有账单信息
	 * @param accountAction
	 * @param request
	 * @param response
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/accountAction")
	public JSONPObject accountAction(String page,String accountAction,HttpServletRequest request,HttpServletResponse response){
		
		int num=information.findAllNum();
		if (num%2==0) {
			num=num/3;
		}else{
			num=num/3+1;
		}
		int page1=Integer.parseInt(page);
		if (page1>num) {
			page1=num;
		}
		
		List<TUserBillingInformation> list=information.getTUserBillingInformationList(page1);
		request.getSession().setAttribute("page", page1);
		list.get(0).setCarPrice(num);
		//System.out.println(list.get(0).getCarPrice());
		return  new JSONPObject(accountAction, list);
	}
	//上一页
	@ResponseBody
	@RequestMapping(value = "/accountShangYiYe")
	public JSONPObject accountShangYiYe(String accountAction,HttpServletRequest request,HttpServletResponse response){
		int  page=(int)request.getSession().getAttribute("page");
		int num=information.findAllNum();
		if (num%2==0) {
			num=num/3;
		}else{
			num=num/3+1;
		}
		int page1=page-1;
		if (page1<1) {
			page1=1;
		}
		List<TUserBillingInformation> list=information.getTUserBillingInformationList(page1);
		request.getSession().setAttribute("page", page1);
		
		list.get(0).setCarPrice(num);
		return  new JSONPObject(accountAction, list);
	}
	
	//下一页
	@ResponseBody
	@RequestMapping(value = "/accountXiaYiYe")
	public JSONPObject accountXiaYiYe(String accountAction,HttpServletRequest request,HttpServletResponse response){
		int page=(int) request.getSession().getAttribute("page");
		int num=information.findAllNum();
		if (num%2==0) {
			num=num/3;
		}else{
			num=num/3+1;
		}
		int page1=page+1;
		if (page1>num) {
			page1=num;
		}
		List<TUserBillingInformation> list=information.getTUserBillingInformationList(page1);
		System.out.println(list);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).toString());
		}
		request.getSession().setAttribute("page", page1);
		list.get(0).setCarPrice(num);
		return  new JSONPObject(accountAction, list);
	}
	
	
	/**
	 * 根据id查找账单信息
	 * @param accountAction
	 * @param request
	 * @param response
	 * @return
	 */
	@ResponseBody 
	@RequestMapping(value = "/accountInfoAction")
	public JSONPObject accountInfoAction(String id,String accountInfoAction,HttpServletRequest request,HttpServletResponse response){
		request.getSession().setAttribute("accountId", id);
		TUserBillingInformation tInformation=information.getTUserBillingInformation(id);
		return  new JSONPObject(accountInfoAction, tInformation);
	}
	
	/**
	 * 根据id查找下载账单信息下载成Excel格式
	 * @param request
	 * @param response
	 * @return
	 */
	@Autowired
	private ExcelService excel;
	@ResponseBody 
	@RequestMapping(value = "/uploadAccountExcel")
	public JSONPObject uploadAccountExcel(String uploadAccount,HttpServletRequest request,HttpServletResponse response){
		String accountId=(String)request.getSession().getAttribute("accountId");
		try {
			excel.Excel(accountId);
		} catch (Exception e) {
			e.printStackTrace();
			return  new JSONPObject(uploadAccount, 1);
		}
		return  new JSONPObject(uploadAccount, 0);
	}
	
}
