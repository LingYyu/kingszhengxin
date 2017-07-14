package com.newtouch.fbf.service;

import java.util.List;

import com.newtouch.fbf.entity.TUserReport;

/**
 * @author zouli
 *
 */
public interface UserListService {
	
    //获取所有生成报告信息条数
    public int getAllNum();
    
    //获取用户报告
    public List<TUserReport> getReportlist(int pageNum,int pageSize);
    
    /**
     * 通过idCard获取用户报告信息(分页)
     * @param idcard
     * @return
     */
	public List<TUserReport> getinfo(int page,String idcard);
	
    /**
     * 通过idCard获取用户报告信息数量
     * @param idcard
     * @return
     */
	public int getinfoNum(String idcard);
}
