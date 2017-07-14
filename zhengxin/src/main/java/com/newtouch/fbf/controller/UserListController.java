package com.newtouch.fbf.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.newtouch.fbf.entity.TUserBaseinfo;
import com.newtouch.fbf.entity.TUserReport;
import com.newtouch.fbf.service.ITUserService;
import com.newtouch.fbf.service.UserListService;
import com.newtouch.fbf.service.impl.UserListServiceImpl;



/**
 * @author zouli
 * 指定用户列表模块
 *
 */

@RestController
public class UserListController {
   @Autowired
   private UserListService u;
   @Autowired
   private UserListServiceImpl ulist;
   @Autowired
   private ITUserService iTUserService;
	
  @ResponseBody
  @RequestMapping(value="/reportlist")
  public JSONPObject getReportList(String currentPage,String report,HttpServletRequest request){
	  int page = Integer.parseInt(currentPage);
	  List<TUserReport> list = u.getReportlist(page, 3);
	  int num = u.getAllNum();
	  System.out.println(num+"条数");
	  list.get(0).setAge(num);
	  System.out.println(list);
	  return new JSONPObject(report, list);
	  
  }
  //显示用户的征信报告列表
   @ResponseBody
   @RequestMapping(value="/report")
   public JSONPObject getinfolist(String page,String user_data,String idcard,HttpServletRequest request,HttpSession session){
	  
	   System.out.println(user_data+"  "+idcard);
	   TUserBaseinfo user=iTUserService.findTUserBaseinfo(idcard);
	   System.out.println(user.toString());
	   request.getSession().setAttribute("user", user);
	   int page1 = Integer.parseInt(page);
	   List<TUserReport> list = ulist.getinfo(page1,idcard);
	   System.out.println(list);
	   return new JSONPObject(user_data, list);
 
   }
   
 //查询用户的征信报告列表条数
   @ResponseBody
   @RequestMapping(value="/selectinfolistNum")
   public JSONPObject selectinfolistNum(String callbackparam,String idcard,HttpServletRequest request,HttpSession session){
	  
	   TUserBaseinfo user=iTUserService.findTUserBaseinfo(idcard);
	   System.out.println(user.toString());
	   request.getSession().setAttribute("user", user);
	   int num = ulist.getinfoNum(idcard);
	   System.out.println("总数量："+num);
	   return new JSONPObject(callbackparam, num);
 
   }
   
  
   /**
    * 查询所有用户征信报告列表
    * @param callback
    * @param session
    * @param request
    * @return
    */
   
/*   private TUserReportCountServiceI trc;
   @Autowired
   private UserListService  trsi;
   @Autowired
   private TUserReportCountServiceI tucs;	*/
   
   
/*   @RequestMapping(value = "/userlist")
   public JSONPObject selectUserList(String callback,HttpSession session,HttpServletRequest request){
   
	//TUserReportCountService trc=new TUserReportCountServiceImpl();
		
		 List<TUserReportCount> list=trc.findAll();
		 List tlist=new ArrayList<>();
		for(TUserReportCount tr:list){
			
			tr.setId(tr.getId());
			tr.setCount(tr.getCount());
			tr.setIdCard(tr.getIdCard());
			tr.setLastTime(tr.getLastTime());
			TUserCheck t=trc.getUsernameByidCard(tr.getIdCard());
			tr.setUsername(t.getUserName());
	        tlist.add(tr);
	        
	        
	        System.out.println(tr.getUsername());  
		}
		session.setAttribute("tlist", tlist);
		
		return new JSONPObject(callback, tlist);
	}*/


/*
//report数量	
	@RequestMapping(value = "/reportNumlist")
	public JSONPObject selectUserList1(String callback,HttpSession session,HttpServletRequest request,String id_card){
		
		System.out.println(id_card+"idcard");
		//TUserReportServiceImpl TUserReportServiceImpl =new TUserReportServiceImpl ();
		List<TUserReport> tUserReportList=trsi.getinfo(id_card);

		List list=new ArrayList();
		
		for(TUserReport tr:tUserReportList){
			
			if(tr.getReportCode().length()>0)
			{				
				tr.setReportCode(tr.getReportCode());
				tr.setLoanPhase(tr.getLoanPhase());
				tr.setProductName(tr.getProductName());
				tr.setCheckTime(tr.getCheckTime());
				list.add(tr);
				
			}
			
		}	
		System.out.println(id_card+"身份证号");
		
		return new JSONPObject(callback,list);
		
	}*/
	
}
