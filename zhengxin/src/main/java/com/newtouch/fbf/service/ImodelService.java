package com.newtouch.fbf.service;/** * @author  wei * @date 创建时间：2016年10月27日 下午10:05:02 * @version 1.0 * @parameter  * @since  * @return  */

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

/**
 * <p>Title: 选择查询模块service接口 </p>
 * <p>Description:  </p>
 * @author
 * @date
 */
public interface ImodelService {
	/**
	 * 根据用户的id_card查询用户的报告数
	 * @param id_card
	 * @return
	 */
	public int getUserReportNum(String id_card);
	/**
	 * 插入飞行信息
	 */
	public void insertFlightInfoCheck(FlightInfoCheck flightInfoCheck);
	
	/**
	 * 更新飞行信息
	 */
	public void updateFlightInfoCheck(FlightInfoCheck flightInfoCheck);
	
	/**
	 * 根据code获取飞行信息
	 */
	public FlightInfoCheck getFlightInfoCheck(String code);
	
	
	/**
	 * 插入贷款信息
	 */
	public void insertLoanInfo(LoanInfoCheck loanInfoCheck);
	
	/**
	 * 更新贷款信息
	 */
	public void updateLoanInfo(LoanInfoCheck loanInfoCheck);
	
	/**
	 * 根据code获取贷款信息
	 */
	public LoanInfoCheck getLoanInfo(String code);
	
	
	/**
	 * 插入个人工商信息
	 */
	public void insertLegalPersonCheck(LegalPersonCheck legalPersonCheck);
	
	/**
	 * 根据code更新个人工商信息
	 */
	public void updateLegalPersonCheck(LegalPersonCheck legalPersonCheck);
	
	/**
	 * 根据code获取个人工商信息
	 */
	public LegalPersonCheck getLegalPersonCheck(String code);
	
	
	/**
	 * 插入行驶证信息
	 */
	public void insertDrivingLicenseCheck(DrivingLicenseCheck dCheck);
	
	/**
	 * 根据code更新行驶证信息
	 */
	public void updateDrivingLicenseCheck(DrivingLicenseCheck dCheck);
	
	/**
	 * 根据code获取行驶证信息
	 */
	public DrivingLicenseCheck getDrivingLicenseCheck(String code);
	
	

	/**
	 * 插入违章查询信息
	 */
	public void insertIllegalInfoCheck(IllegalInfoCheck iCheck);
	
	/**
	 * 根据code更新违章查询信息
	 */
	public void updateIllegalInfoCheck(IllegalInfoCheck iCheck);
	
	/**
	 * 根据code获取违章查询信息
	 */
	public IllegalInfoCheck getIllegalInfoCheck(String code);
	/**
	 * 插入所选择模块信息
	 * @param tUserModule
	 */
	public void insertTuserModel(TUserModule tUserModule);
	/**
	 * 更新所选模块信息
	 * @param tUserModule
	 */
	public void updateTuserModel(TUserModule tUserModule);
	/**
	 * 查询所选择模块的信息
	 * @return
	 */
	public TUserModule getTuserModel(String code);
	
	
	/**
	 * 插入用户报告信息
	 * @param tUserModule
	 */
	public void insertTUserReport(TUserReport tUserReport);
	/**
	 * 更新用户报告信息
	 * @param tUserModule
	 */
	public void updateTUserReport(TUserReport TUserReport);
	/**
	 * 查询用户报告信息
	 * @return
	 */
	public TUserReport getTUserReport(String code);
	
	
	/**
	 * 插入用户报告详情信息
	 * @param tUserModule
	 */
	public void insertTUserReportDetail(TUserReportDetail tUserReportDetail);
	/**
	 * 更新用户报告详情信息
	 * @param tUserModule
	 */
	public void updateTUserReportDetail(TUserReportDetail tUserReportDetail);
	/**
	 * 查询用户报告详情信息
	 * @return
	 */
	public TUserReportDetail getTUserReportDetail(String code);
	
	
	/**
	 * 插入用户报告数量信息
	 * @param tUserModule
	 */
	public void insertTUserReportCount(TUserReportCount tUserReportCount);
	/**
	 * 更新用户报告数量信息
	 * @param tUserModule
	 */
	public void updateTUserReportCount(TUserReportCount tUserReportCount);
	/**
	 * 查询用户报告数量信息
	 * @return
	 */
	public TUserReportCount getTUserReportCount(String code);
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * 插入电话号码
	 */
	public void insertMobile(TUserBaseinfo baseinfo);
	
	/*
	 * 根据idCard通过TUserBaseinfo表获取电话号码
	 */
	public TUserBaseinfo getMobile(String idCard);
		
	/*
	 * 根据idCard通过TUserBaseinfo表更新电话号码
	 */
	public void updateMobile(TUserBaseinfo tubinfo); 
	
	/*
	 * 插入银行卡号
	 */
    public void insertbankcard(TUserReportDetail detail);
	
	/*
	 * 根据code通过TUserReportDetail表得到银行卡号
	 */
	public TUserReportDetail getbankcard(String code);
	
	/*
	 * 根据code通过TUserReportDetail表更新银行卡号
	 */
	public void updatebankcard(TUserReportDetail tu);
	
	/*
	 * 获取学历信息
	 */
	public EducationInfoCheck getInfo(String code);
	
	/*
	 * 插入学历信息
	 */
	public void insertinfo(EducationInfoCheck educheck);
	
    /*
     * 更新学历信息
     */
	public void updateInfo(EducationInfoCheck eInfoCheck);
	
	/*
	 * 查询tuserreportcount表中的count
	 */
	public TUserReportCount getcount(String id);
}
