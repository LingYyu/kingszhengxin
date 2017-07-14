package com.newtouch.fbf.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.newtouch.fbf.common.MySessionFactory;
import com.newtouch.fbf.entity.TUserReport;
import com.newtouch.fbf.service.CheckHistoryService;
@Service
public class CheckHistoryServiceImpl implements CheckHistoryService {

	@Override
	public List<TUserReport> selectAllList(int pageNum,int pageSize) {
		
		List<TUserReport> TuserReports=null;
		List<TUserReport> list1=new ArrayList<TUserReport>();
		 
		try {
			SqlSession sqlSession = MySessionFactory.openSessionFactory();
			PageHelper.startPage(pageNum, pageSize);
			TuserReports=sqlSession.selectList("com.newtouch.fbf.dao.TUserReportMapper.selectAllListwei");
			
			for(TUserReport list:TuserReports)
			{
				if(list.getReportCode().length()>0)
				{										
					list.setName(list.getName());
					list.setReportCode(list.getReportCode());
					list.setIdCard(list.getIdCard());
					list.setLoanPhase(list.getLoanPhase());
					list.setProductName(list.getProductName());
					list.setCheckTime(list.getCheckTime());
					
					list1.add(list);					
				}							
			}
			
			
			sqlSession.commit();
			sqlSession.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list1;
		
		
	}

	@Override
	public List<TUserReport> selectByLoanphaseAndProductname(int pageNum,int pageSize,String loanPhase, String productName) {
		
		List<TUserReport> userReports=null;
		List list1=new ArrayList();
		
		TUserReport  tUserReport = new TUserReport();
		tUserReport.setLoanPhase(loanPhase);
		tUserReport.setProductName(productName);
		
		try {
			SqlSession sqlSession = MySessionFactory.openSessionFactory();
			PageHelper.startPage(pageNum, pageSize);
			userReports=sqlSession.selectList("com.newtouch.fbf.dao.TUserReportMapper.selectByLoanPhaseAndProductName",tUserReport);
			System.out.println(userReports);
			for(TUserReport list:userReports)
			{							
				if(list.getReportCode().length()>0)
				{										
					list.setName(list.getName());
					list.setReportCode(list.getReportCode());
					list.setIdCard(list.getIdCard());
					list.setLoanPhase(list.getLoanPhase());
					list.setProductName(list.getProductName());
					list.setCheckTime(list.getCheckTime());
					list1.add(list);	
				}							
			}
			System.out.println("查出来了"+userReports.size());
					
			sqlSession.commit();
			sqlSession.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list1;
		
	}

	@Override
	public int reportNum() {
		List<TUserReport> tUserReportsList=null;
	
		try {
			SqlSession sqlSession = MySessionFactory.openSessionFactory();
			tUserReportsList=sqlSession.selectList("com.newtouch.fbf.dao.TUserReportMapper.selectAllListwei");
			sqlSession.commit();
			sqlSession.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(tUserReportsList.size());
		return tUserReportsList.size();
	}

	@Override
	public int reportByNameNum(String loanPhase, String productName) {
		List<TUserReport> userReports=null;
		
		TUserReport  tUserReport = new TUserReport();
		tUserReport.setLoanPhase(loanPhase);
		tUserReport.setProductName(productName);
		try {
			SqlSession sqlSession = MySessionFactory.openSessionFactory();
			userReports=sqlSession.selectList("com.newtouch.fbf.dao.TUserReportMapper.selectByLoanPhaseAndProductName",tUserReport);
			
			sqlSession.commit();
			sqlSession.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userReports.size();
	}

}
