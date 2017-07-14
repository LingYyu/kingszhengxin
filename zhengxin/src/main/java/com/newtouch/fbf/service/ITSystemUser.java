package com.newtouch.fbf.service;

import java.util.List;

import com.newtouch.fbf.entity.TSystemUser;



public interface ITSystemUser {
	
	/**
	 * 查询一个用户
	 * @param id
	 */
	public void getTSUser(String id);
	
	/**
	 * 插入一个用户
	 */
	public void insertTSUser();
	
	/**
	 * 删除一个用户
	 * @param id
	 */
	public void deleteTSUser(String id);
	
	
	public List<TSystemUser> selectTSystemUserList();
}
