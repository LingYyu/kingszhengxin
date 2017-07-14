package com.newtouch.fbf.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.newtouch.fbf.common.MySessionFactory;
import com.newtouch.fbf.entity.TUserReport;
import com.newtouch.fbf.service.UserListService;

/**
 * @author zouli
 *
 */
@Service
public class UserListServiceImpl implements UserListService {

	@Override
	public int getAllNum() {
		List<TUserReport> list = null;
		try {
			SqlSession session = MySessionFactory.openSessionFactory();
			list = session.selectList("com.newtouch.fbf.dao.TUserReportMapper.selectAllList");
		    session.commit();
			session.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list.size();
	}

	@Override
	public List<TUserReport> getReportlist(int pageNum, int pageSize) {
		List<TUserReport> list = null;
		List list1 = new ArrayList();
		try {
			SqlSession session = MySessionFactory.openSessionFactory();
			PageHelper.startPage(pageNum, pageSize);
			list = session.selectList("com.newtouch.fbf.dao.TUserReportMapper.selectAllList");
		for(TUserReport tr:list){
			if (tr.getReportCode().length()>0) {
				tr.setReportCode(tr.getReportCode());
				tr.setLoanPhase(tr.getLoanPhase());
				tr.setProductName(tr.getProductName());
				tr.setCheckTime(tr.getCheckTime());
				list1.add(list);
				System.out.println(list.size());
			}
			session.commit();
			session.close();
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list1;
	}
	
	@Override
	public List<TUserReport> getinfo(int page,String idcard) {
		SqlSession session = null;
		List<TUserReport> turList = null;
		try {
			session = MySessionFactory.openSessionFactory();
			PageHelper.startPage(page, 5);
			turList = session.selectList("com.newtouch.fbf.dao.TUserReportMapper.selectByIdCard", idcard);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		System.out.println(turList.size()+" "+turList);
		return turList;
	}
	@Override
	public int getinfoNum(String idcard) {
		SqlSession session = null;
		List<TUserReport> turList = null;
		try {
			session = MySessionFactory.openSessionFactory();
			
			turList = session.selectList("com.newtouch.fbf.dao.TUserReportMapper.selectByIdCard", idcard);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return turList.size();
	}
}
