package com.newtouch.fbf.service;

import com.newtouch.fbf.entity.EducationInfoCheck;
import com.newtouch.fbf.entity.LegalPersonCheck;
import com.newtouch.fbf.entity.TUserReport;


public interface TUserReportService {
	//通过报告编码得到报告详情
    public TUserReport geTUserReport(String code);

    //通过报告编码得到学历
   public EducationInfoCheck getcollegelevel(String code);
   
   //通过报告编码得到个人工商法人信息核查
   public LegalPersonCheck getLegalPersonCheck(String code);
}
