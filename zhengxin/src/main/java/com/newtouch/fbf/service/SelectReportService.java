package com.newtouch.fbf.service;

import java.util.List;

/**
 * @author zouli
 *征信报告统计查询
 */
public interface SelectReportService {
//	  根据用户身份证号码查询该用户生成报告的数量
     public List<SelectReportService> getcount(String idcard);
}
