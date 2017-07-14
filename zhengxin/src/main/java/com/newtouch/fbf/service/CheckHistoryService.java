package com.newtouch.fbf.service;
import java.util.List;

import com.newtouch.fbf.entity.TUserReport;
public interface CheckHistoryService {

	
	/**
	 * 历史查询模块
	 * 
	 * 显示所有数据
	 */
	public List<TUserReport> selectAllList(int pageNum,int pageSize);
	/**
	 * 历史查询模块
	 * 通过 阶段、贷款类 查询
	 * @param loan_phase
	 * @param product_name
	 * @return
	 */
	public List<TUserReport> selectByLoanphaseAndProductname(int pageNum,int pageSize,String loanPhase,String productName);
	/**
	 * 计算记录条数
	 * @return
	 */
	public int reportNum();
	/**
	 * 计算查询的总数
	 * @param loanPhase
	 * @param productName
	 * @return
	 */
	public int reportByNameNum(String loanPhase, String productName);
}
