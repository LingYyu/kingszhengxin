package com.newtouch.fbf.service;

import java.util.List;

import com.newtouch.fbf.entity.TUserLoanInfo;

public interface TUserLoanInfoService {

    public List<TUserLoanInfo> selectSubmitterAndCreateTimeByIdCard(int page,String idCard);
	
    /**
     * 计算贷款信息列表条数
     * @param idCard
     * @return
     */
    public int selectLoanInfoByIdCardNum(String idCard);
	
	public List<TUserLoanInfo> selectAllByCreateTime(String id);
	
	public void insertLoanListInfo(TUserLoanInfo loanInfo);
	
	public TUserLoanInfo getloanInfo(String idCard);
}
