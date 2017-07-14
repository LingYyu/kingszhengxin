package com.newtouch.fbf.service.impl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.newtouch.fbf.common.MySessionFactory;
import com.newtouch.fbf.entity.TUserBaseinfo;
import com.newtouch.fbf.entity.TUserCheck;
import com.newtouch.fbf.entity.TUserReport;
import com.newtouch.fbf.service.TSystemUserServiceI;

/** * @author  wei * @date 创建时间：2016年10月22日 上午10:30:05 * @version 1.0 * @parameter  * @since  * @return  */
@Service(value = "TSystemUserServiceI")
public class TSystemUserServiceImpl implements TSystemUserServiceI {

	@Override
	public String isExist(String name,String idCard) {
		SqlSession session = null;
		try {
			session =MySessionFactory.openSessionFactory();
			TUserCheck user=session.selectOne("com.newtouch.fbf.dao.TUserCheckMapper.selectByPrimaryKey", idCard);
			
			if (user==null) {
				return "notExist";
			}else if(user.getUserName().equals(name)){
				List<TUserReport> list=null;
				list=session.selectList("com.newtouch.fbf.dao.TUserReportMapper.selectByIdCard", idCard);
				if (list.size()!=0) {
					return "notNewUser";
				}else{
					return "isNewUser";
				}
			}else {
				return "notExist";
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}

	@Override
	public void insertTobaseInfoTable(TUserBaseinfo tUser) {
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

	@Override
	public TUserBaseinfo findOneTSystemUser(String idCard) {
		SqlSession session = null;
		try {
			session =MySessionFactory.openSessionFactory();
			TUserBaseinfo user=session.selectOne("com.newtouch.fbf.dao.TUserBaseinfoMapper.selectByPrimaryKey", idCard);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}

}
