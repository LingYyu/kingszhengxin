package com.newtouch.fbf.service;

import java.util.List;

import com.newtouch.fbf.entity.TUserBillingInformation;

/** * @author  wei * @date 创建时间：2016年10月25日 下午5:19:55 * @version 1.0 * @parameter  * @since  * @return  */
public interface ITUserBillingInformation {
	
	/**
	 * 查询所有的用户信息条数
	 * @return
	 */
	public int findAllNum();
	/**
	 * 获取所有账单
	 * @return
	 */
	public List<TUserBillingInformation> getTUserBillingInformationList(int page);
	/**
	 * 根据账单编号获取账单
	 * @param id
	 * @return
	 */
	public TUserBillingInformation getTUserBillingInformation(String id);
	
	/**
	 * 根据账单编号获取账单
	 * @param id
	 * @return
	 */
	public TUserBillingInformation getTest(String id);
}
