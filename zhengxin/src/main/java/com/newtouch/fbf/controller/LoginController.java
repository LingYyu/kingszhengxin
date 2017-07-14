package com.newtouch.fbf.controller;/** * @author  wei * @date 创建时间：2016年10月21日 下午5:01:30 * @version 1.0 * @parameter  * @since  * @return  */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.newtouch.fbf.entity.TSystemUser;
import com.newtouch.fbf.service.LoginService;
import com.newtouch.fbf.service.impl.LoginServiceImpl;

/**
 * 登录
 */
@RestController
public class LoginController {
	@ResponseBody
	@RequestMapping(value = "/login")
	public JSONPObject login(String checkbutton,String inputEmail, String inputPassword, HttpServletRequest request) {
		HttpSession session = request.getSession();
		inputEmail = request.getParameter("inputEmail");
		inputPassword = request.getParameter("inputPassword");
		/*session.setAttribute("inputEmail", inputEmail);
		session.setAttribute("inputPassword", inputPassword);*/
		session.setAttribute("loginName", inputEmail);
		System.out.println(inputEmail+"   "+inputPassword);
		String message=null;
		try {
			LoginService login = new LoginServiceImpl();
			message = login.getLogin(inputEmail, inputPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new JSONPObject(checkbutton, message);	
	}
	
	@ResponseBody
	@RequestMapping(value="/siginout")
	public void siginout(String checkbutton,String inputEmail, String inputPassword, HttpServletRequest request){
	     HttpSession session = request.getSession();
	     session.removeAttribute(inputEmail);
	     session.removeAttribute(inputPassword);
	}
	
}
