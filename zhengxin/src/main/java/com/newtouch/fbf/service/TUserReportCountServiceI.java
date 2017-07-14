package com.newtouch.fbf.service;

import java.util.List;

import com.newtouch.fbf.entity.TUserCheck;
import com.newtouch.fbf.entity.TUserReportCount;

public interface TUserReportCountServiceI {
	
	/**
	 * 查询所有的用户信息(分页)
	 * @return
	 */
	public List<TUserReportCount> findAllPage(int page);//
	
	/**
	 * 查询所有的用户信息
	 * @return
	 */
	public List<TUserReportCount> findAll();
	
	/**
	 * 根据身份证查询用户名
	 * @param id_card
	 * @return
	 */
	public TUserCheck getUsernameByidCard(String id_card);
	
	/**
	 * 根据身份证号模糊查询该用户列表
	 * */
	public List<TUserReportCount> selectcountByidcard(String idcard);
	
	/**
	 * 根据姓名模糊查询该用户列表
	 * */
	public List<TUserReportCount> selectcountByName(String name);
	
	
	/**
	 * 根据身份证号查询该用户生成的报告数
	 * @param turc
	 */
	public void updatecountByidcard(TUserReportCount turc);
	/**
	 * 插入数据
	 * @param turc
	 */
	public void insert(TUserReportCount turc);
	

}
