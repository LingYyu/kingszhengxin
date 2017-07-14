package com.newtouch.fbf.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.newtouch.fbf.common.MySessionFactory;
import com.newtouch.fbf.dao.TUserReportCountMapper;
import com.newtouch.fbf.entity.TUserCheck;
import com.newtouch.fbf.entity.TUserReportCount;
import com.newtouch.fbf.service.TUserReportCountServiceI;

@Service
public class TUserReportCountServiceImpl implements TUserReportCountServiceI {
	@Autowired
	private TUserReportCountMapper tMapper;

	// 查询用户列表信息
	@Override
	public List<TUserReportCount> findAllPage(int page) {
		List<TUserReportCount> tUserReportCountList = new ArrayList<TUserReportCount>();
		SqlSession sqlSession = null;
		try {
			/*int offset = 5;
			int limit = 2;
			RowBounds rowBounds = new RowBounds(offset, limit);*/
			sqlSession = MySessionFactory.openSessionFactory();
			PageHelper.startPage(page, 5);
			tUserReportCountList = sqlSession.selectList("com.newtouch.fbf.dao.TUserReportCountMapper.findAll");

			for (int i = 0; i < tUserReportCountList.size(); i++) {
				TUserCheck tUserCheck = sqlSession.selectOne("com.newtouch.fbf.dao.TUserCheckMapper.selectByPrimaryKey",
						tUserReportCountList.get(i).getIdCard());
				tUserReportCountList.get(i).setUsername(tUserCheck.getUserName());
			}
			sqlSession.commit();
			sqlSession.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(tUserReportCountList.size()+"  "+tUserReportCountList);
		return tUserReportCountList;
	}
	
	// 查询用户列表信息
		@Override
		public List<TUserReportCount> findAll( ) {
			List<TUserReportCount> tUserReportCountList = new ArrayList<TUserReportCount>();
			SqlSession sqlSession = null;
			try {
				/*int offset = 5;
				int limit = 2;
				RowBounds rowBounds = new RowBounds(offset, limit);*/
				sqlSession = MySessionFactory.openSessionFactory();
				tUserReportCountList = sqlSession.selectList("com.newtouch.fbf.dao.TUserReportCountMapper.findAll");

				for (int i = 0; i < tUserReportCountList.size(); i++) {
					TUserCheck tUserCheck = sqlSession.selectOne("com.newtouch.fbf.dao.TUserCheckMapper.selectByPrimaryKey",
							tUserReportCountList.get(i).getIdCard());
					tUserReportCountList.get(i).setUsername(tUserCheck.getUserName());
				}
				sqlSession.commit();
				sqlSession.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return tUserReportCountList;
		}

	@Override
	public TUserCheck getUsernameByidCard(String id_card) {
		TUserCheck tusercheck = new TUserCheck();
		try {
			SqlSession sqlSession = MySessionFactory.openSessionFactory();
			tusercheck = sqlSession.selectOne("com.newtouch.fbf.dao.TUserCheckMapper.selectByPrimaryKey", id_card);
			System.out.println(tusercheck);
			sqlSession.commit();
			sqlSession.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("抛出异常");
			e.printStackTrace();
		}
		return tusercheck;
	}

	/* 根据身份证号模糊查询该用户生成的报告数 */
	@Override
	public List<TUserReportCount> selectcountByidcard(String idcard) {
		// TODO Auto-generated method stub
		SqlSession sqlsession = null;
		List<TUserReportCount> turc = new ArrayList<TUserReportCount>();
		try {
			sqlsession = MySessionFactory.openSessionFactory();
			turc = sqlsession.selectList("com.newtouch.fbf.dao.TUserReportCountMapper.selectByIdCardLike", idcard);
			for (int i = 0; i < turc.size(); i++) {
				TUserCheck tUserCheck = sqlsession.selectOne("com.newtouch.fbf.dao.TUserCheckMapper.selectByPrimaryKey",
						turc.get(i).getIdCard());
				turc.get(i).setUsername(tUserCheck.getUserName());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sqlsession.close();
		}
		return turc;
	}

	@Override
	public void updatecountByidcard(TUserReportCount turc) {
		// TODO Auto-generated method stub
		SqlSession sqlsession = null;
		try {
			sqlsession = MySessionFactory.openSessionFactory();
			sqlsession.update("com.newtouch.fbf.dao.TUserReportCountMapper.updateByIdCard", turc);
			sqlsession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sqlsession.close();
		}
	}

	@Override
	public void insert(TUserReportCount turc) {
		// TODO Auto-generated method stub
		SqlSession sqlsession = null;
		try {
			sqlsession = MySessionFactory.openSessionFactory();
			sqlsession.update("com.newtouch.fbf.dao.TUserReportCountMapper.insert", turc);
			sqlsession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sqlsession.close();
		}
	}

	@Override
	public List<TUserReportCount> selectcountByName(String name) {
		SqlSession sqlsession = null;
		List<TUserReportCount> turc = new ArrayList<TUserReportCount>();
		try {
			sqlsession = MySessionFactory.openSessionFactory();
			List<TUserCheck> list1=sqlsession.selectList("com.newtouch.fbf.dao.TUserCheckMapper.selectByNameLike", name);
			for(int i=0;i<list1.size();i++){
				TUserReportCount tUserReportCount=sqlsession.selectOne(
						"com.newtouch.fbf.dao.TUserReportCountMapper.selectByIdCard", list1.get(i).getIdCard());
				if (tUserReportCount!=null) {
					tUserReportCount.setUsername(list1.get(i).getUserName());
					turc.add(tUserReportCount);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlsession.close();
		}
		return turc;
	}

}
