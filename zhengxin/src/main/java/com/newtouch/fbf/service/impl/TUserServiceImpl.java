package com.newtouch.fbf.service.impl;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.newtouch.fbf.common.MySessionFactory;
import com.newtouch.fbf.entity.TUserBaseinfo;
import com.newtouch.fbf.service.ITUserService;

/** * @author  wei * @date 创建时间：2016年10月25日 上午9:19:58 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class TUserServiceImpl implements ITUserService{

	@Override
	public TUserBaseinfo findTUserBaseinfo(String idCard) {
		TUserBaseinfo user=null;
		try {
			SqlSession session = MySessionFactory.openSessionFactory();
			user=session.selectOne("com.newtouch.fbf.dao.TUserBaseinfoMapper.selectByIdCard", idCard);
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(user.toString());
		return user;
	}
	@Override
	public void updateTobaseInfo(TUserBaseinfo tUser) {
		try {
			SqlSession session = MySessionFactory.openSessionFactory();
			TUserBaseinfo user=null;
			user=session.selectOne("com.newtouch.fbf.dao.TUserBaseinfoMapper.selectByIdCard", tUser.getIdCard());
			if (user==null) {
				session.insert("com.newtouch.fbf.dao.TUserBaseinfoMapper.insertSelective", tUser);
				session.commit();
			}else{
				tUser.setId(user.getId());
				session.update("com.newtouch.fbf.dao.TUserBaseinfoMapper.updateByPrimaryKeySelective", tUser);
				session.commit();
			}
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
