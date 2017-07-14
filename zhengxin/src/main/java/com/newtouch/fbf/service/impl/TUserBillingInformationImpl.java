package com.newtouch.fbf.service.impl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.newtouch.fbf.common.MySessionFactory;
import com.newtouch.fbf.dao.TUserBillingInformationMapper;
import com.newtouch.fbf.entity.TUserBillingInformation;
import com.newtouch.fbf.service.ITUserBillingInformation;

/** * @author  wei * @date 创建时间：2016年10月25日 下午5:37:36 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class TUserBillingInformationImpl implements ITUserBillingInformation {
	@Autowired
	private TUserBillingInformationMapper tub;
	
	@Override
	public int findAllNum() {
		List<TUserBillingInformation> u=null;
		try {
			SqlSession session = MySessionFactory.openSessionFactory();
			//RowBounds是用来做分页的. offset是当前页的第一条数据在所有数据中排第几条（从第0条开始），limit是当前页显示多少条数据
			
			u=session.selectList("com.newtouch.fbf.dao.TUserBillingInformationMapper.selectList");
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return u.size();
	}
	
	/**
	 * page为当前页数
	 */
	@Override
	public List<TUserBillingInformation> getTUserBillingInformationList(int page) {
		System.out.println("111111111");
		List<TUserBillingInformation> u=null;
		try {
			SqlSession session = MySessionFactory.openSessionFactory();
			/*int offset = (page-1)*3;
			int limit = 3;
			//RowBounds是用来做分页的. offset是当前页的第一条数据在所有数据中排第几条（从第0条开始），limit是当前页显示多少条数据
			RowBounds rowBounds = new RowBounds(offset, limit);*/
			PageHelper.startPage(page, 3);
			u=session.selectList("com.newtouch.fbf.dao.TUserBillingInformationMapper.selectList");
			/*u=session.selectList("com.newtouch.fbf.dao.TUserBillingInformationMapper.selectList",null,rowBounds);*/
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return u;
	}

	@Override
	public TUserBillingInformation getTUserBillingInformation(String id) {
		TUserBillingInformation u=null;
		try {
			SqlSession session = MySessionFactory.openSessionFactory();
			u=session.selectOne("com.newtouch.fbf.dao.TUserBillingInformationMapper.selectByPrimaryKey",id);
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(u.toString());
		return u;
	}

	@Override
	public TUserBillingInformation getTest(String id) {
		return tub.selectByPrimaryKey(id);
	}

	

}
