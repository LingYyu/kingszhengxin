package com.newtouch.fbf.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.newtouch.fbf.common.MySessionFactory;
import com.newtouch.fbf.entity.TSystemUser;
import com.newtouch.fbf.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public String getLogin(String login_name, String login_password) {
		SqlSession session = null;
		try{
			session = MySessionFactory.openSessionFactory();
			//使用Mapper.xml中的namespace和id执行sql语句,格式为namespace.id
			TSystemUser le = session.selectOne("com.newtouch.fbf.dao.TSystemUserMapper.selectByLoginName", login_name);
			if(le == null){
				return "用户不存在";
			}else{
				if(le.getLoginPassword().equals(login_password)) {
					return "登陆成功";
				}else {
					return "密码错误";
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
			return "用户不存在";
		}finally {
			session.close();
		}
	}
}
