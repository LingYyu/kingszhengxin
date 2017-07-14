package com.newtouch.fbf.service.impl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.newtouch.fbf.common.MySessionFactory;
import com.newtouch.fbf.dao.TUserLoanInfoMapper;
import com.newtouch.fbf.entity.TUserLoanInfo;
import com.newtouch.fbf.entity.TUserLoanInfoExample;
import com.newtouch.fbf.service.TUserLoanInfoService;

@Service
public class TUserLoanInfoServiceImpl implements TUserLoanInfoService {
	@Autowired
	private TUserLoanInfoMapper t;

	@Override
	public List<TUserLoanInfo> selectSubmitterAndCreateTimeByIdCard(int page, String idCard) {

		List<TUserLoanInfo> list = null;

		try {
			SqlSession sqlSession = MySessionFactory.openSessionFactory();
			PageHelper.startPage(page, 5);
			list = sqlSession.selectList(
					"com.newtouch.fbf.dao.TUserLoanInfoMapper.selectSubmitterAndCreateTimeByIdCard", idCard);

			sqlSession.commit();
			sqlSession.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(list.size() + "  " + list);
		return list;

	}

	@Override
	public int selectLoanInfoByIdCardNum(String idCard) {
		List<TUserLoanInfo> list = null;
		try {
			SqlSession sqlSession = MySessionFactory.openSessionFactory();
			list = sqlSession.selectList(
					"com.newtouch.fbf.dao.TUserLoanInfoMapper.selectSubmitterAndCreateTimeByIdCard", idCard);

			sqlSession.commit();
			sqlSession.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return list.size();
	}

	@Override
	public List<TUserLoanInfo> selectAllByCreateTime(String id) {

		List<TUserLoanInfo> list = null;

		try {
			SqlSession sqlSession = MySessionFactory.openSessionFactory();

			list = sqlSession.selectList("com.newtouch.fbf.dao.TUserLoanInfoMapper.selectAllByCreateTime", id);

			sqlSession.commit();
			sqlSession.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list);
		return list;

	}

	@Override
	public void insertLoanListInfo(TUserLoanInfo loanInfo) {

		try {
			SqlSession sqlSession = MySessionFactory.openSessionFactory();

			sqlSession.insert("com.newtouch.fbf.dao.TUserLoanInfoMapper.insertSelective", loanInfo);

			sqlSession.commit();

			sqlSession.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 根据idCard获取贷款信息
	@Override
	public TUserLoanInfo getloanInfo(String idCard) {
		TUserLoanInfoExample example = new TUserLoanInfoExample();
		com.newtouch.fbf.entity.TUserLoanInfoExample.Criteria criteria = example.createCriteria();
		criteria.andIdCardEqualTo(idCard);
		List<TUserLoanInfo> list = t.selectByExample(example);
		return list.get(0);
	}

}
