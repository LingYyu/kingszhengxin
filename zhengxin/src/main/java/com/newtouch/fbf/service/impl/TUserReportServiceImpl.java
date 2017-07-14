package com.newtouch.fbf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newtouch.fbf.dao.EducationInfoCheckMapper;
import com.newtouch.fbf.dao.LegalPersonCheckMapper;
import com.newtouch.fbf.dao.TUserReportMapper;
import com.newtouch.fbf.entity.EduInfoExample;
import com.newtouch.fbf.entity.EducationInfoCheck;
import com.newtouch.fbf.entity.EducationInfoCheckExample;
import com.newtouch.fbf.entity.LegalPersonCheck;
import com.newtouch.fbf.entity.LegalPersonCheckExample;
import com.newtouch.fbf.entity.LoanInfoCheck;
import com.newtouch.fbf.entity.TUserReport;
import com.newtouch.fbf.entity.TUserReportExample;
import com.newtouch.fbf.service.ImodelService;
import com.newtouch.fbf.service.TUserReportService;
@Service
public class TUserReportServiceImpl implements TUserReportService {
   @Autowired
   private TUserReportMapper tuserreport;
   
   @Autowired
   private EducationInfoCheckMapper edu;
 
   @Autowired
   private LegalPersonCheckMapper legalcheck;
   @Autowired
   private ModelServiceImpl imodelService;
   //通过code得到报告详情中的基本信息
   @Override
   public TUserReport geTUserReport(String code) {
		TUserReportExample example = new TUserReportExample();
		com.newtouch.fbf.entity.TUserReportExample.Criteria criteria = example.createCriteria();
		criteria.andReportCodeEqualTo(code);
		List<TUserReport> list = tuserreport.selectByExample(example);
		return list.get(0);
	}

//获取学历信息
@Override
public EducationInfoCheck getcollegelevel(String code) {
	EducationInfoCheckExample example = new EducationInfoCheckExample();
	com.newtouch.fbf.entity.EducationInfoCheckExample.Criteria criteria = example.createCriteria();
    criteria.andReportCodeEqualTo(code);
    List<EducationInfoCheck> list = edu.selectByExample(example);
	return list.get(0);
}

//获取个人工商信息
@Override
public LegalPersonCheck getLegalPersonCheck(String code) {
    LegalPersonCheckExample example = new LegalPersonCheckExample();
    com.newtouch.fbf.entity.LegalPersonCheckExample.Criteria criteria = example.createCriteria();
    criteria.andReportCodeEqualTo(code);
    List<LegalPersonCheck> list = legalcheck.selectByExample(example);
	return list.get(0);
}

}
