package com.newtouch.fbf.service.impl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.newtouch.fbf.common.MySessionFactory;
import com.newtouch.fbf.service.SelectReportService;

@Service
public class SelectReportServiceImpl implements SelectReportService {

	@Override
	public List<SelectReportService> getcount(String idcard) {
		SqlSession session = null;
		List<SelectReportService> list = null;
		try {
			session = MySessionFactory.openSessionFactory();
		    list = session.selectList("com.newtouch.fbf.dao.TUserReportCountMapper.selectByIdCard",idcard);
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;

	}

}
