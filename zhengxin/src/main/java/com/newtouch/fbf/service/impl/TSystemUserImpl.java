package com.newtouch.fbf.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newtouch.fbf.common.MySessionFactory;
import com.newtouch.fbf.dao.TSystemUserMapper;
import com.newtouch.fbf.entity.TSystemUser;
import com.newtouch.fbf.service.ITSystemUser;



/** * @author  wei * @date 创建时间：2016年10月21日 下午4:37:27 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class TSystemUserImpl implements ITSystemUser {
	@Autowired
	private TSystemUserMapper tUserMapper;
	
	public void insertUser() {
		TSystemUser tUser;
		tUser = new TSystemUser(); 
		tUser.setBusinessType("w");
		tUser.setId(UUID.randomUUID().toString());
		tUser.setLoginName("wei");
		tUser.setLoginPassword("weiweiwei");
	}
	
	@Override
	public void getTSUser(String id) {
		try {
			SqlSession session =MySessionFactory.openSessionFactory();
			

			TSystemUser tSystemUser=session.selectOne("com.newtouch.fbf.dao.TSystemUserMapper.selectByPrimaryKey",id);

			System.out.println(tSystemUser.getLoginName());
			session.commit();
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void insertTSUser() {
		TSystemUser tUser;
		tUser = new TSystemUser(); 
		tUser.setBusinessType("w");
		tUser.setId(UUID.randomUUID().toString());
		tUser.setLoginName("wei");
		tUser.setLoginPassword("weiweiwei");
		try {
			SqlSession session =MySessionFactory.openSessionFactory();
			
			session.insert("zhengxing.dao.TSystemUserMapper.insertSelective", tUser);
			session.commit();
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void deleteTSUser(String id) {
		try {
			SqlSession session =MySessionFactory.openSessionFactory();
			
			session.delete("zhengxing.dao.TSystemUserMapper.deleteByPrimaryKey",
					"a1aedd4e-6821-4a9f-b138-3f9e616ce901");
			session.commit();
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public List<TSystemUser> selectTSystemUserList() {
		SqlSession sqlSession = null;
		List<TSystemUser> tList=new ArrayList<>();
		try {
			sqlSession=MySessionFactory.openSessionFactory();
			tList=sqlSession.selectList("zhengxing.dao.TSystemUserMapper.selectTSystemUserList");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return tList;
	}

}
