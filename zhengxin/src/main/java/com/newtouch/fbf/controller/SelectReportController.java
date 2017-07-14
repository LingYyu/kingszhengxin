package com.newtouch.fbf.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.newtouch.fbf.service.SelectReportService;
import com.newtouch.fbf.service.impl.SelectReportServiceImpl;

/**
 * @author zouli
 * 通过用户身份证号码查询出报告列表
 */
@RestController
public class SelectReportController {
	@Autowired
	private SelectReportServiceImpl srserviceimpl;
	
    @ResponseBody
    @RequestMapping("/count")
    public void getreportlist(String idcard,HttpServletRequest request) {
    	System.out.println("lilili");
    	List<SelectReportService> list = srserviceimpl.getcount("14031119910218091X");    	
        return;
//    	request.getSession().setAttribute("list", list);
//		return new JSONPObject("list", list);
    	
    }
    
}
