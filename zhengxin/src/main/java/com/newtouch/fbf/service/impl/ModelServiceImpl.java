package com.newtouch.fbf.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newtouch.fbf.dao.DrivingLicenseCheckMapper;
import com.newtouch.fbf.dao.EducationInfoCheckMapper;
import com.newtouch.fbf.dao.FlightInfoCheckMapper;
import com.newtouch.fbf.dao.IllegalInfoCheckMapper;
import com.newtouch.fbf.dao.LegalPersonCheckMapper;
import com.newtouch.fbf.dao.LoanInfoCheckMapper;
import com.newtouch.fbf.dao.TUserBaseinfoMapper;
import com.newtouch.fbf.dao.TUserModuleMapper;
import com.newtouch.fbf.dao.TUserReportCountMapper;
import com.newtouch.fbf.dao.TUserReportDetailMapper;
import com.newtouch.fbf.dao.TUserReportMapper;
import com.newtouch.fbf.entity.DrivingLicenseCheck;
import com.newtouch.fbf.entity.DrivingLicenseCheckExample;
import com.newtouch.fbf.entity.EducationInfoCheck;
import com.newtouch.fbf.entity.EducationInfoCheckExample;
import com.newtouch.fbf.entity.FlightInfoCheck;
import com.newtouch.fbf.entity.FlightInfoCheckExample;
import com.newtouch.fbf.entity.IllegalInfoCheck;
import com.newtouch.fbf.entity.IllegalInfoCheckExample;
import com.newtouch.fbf.entity.LegalPersonCheck;
import com.newtouch.fbf.entity.LegalPersonCheckExample;
import com.newtouch.fbf.entity.LoanInfoCheck;
import com.newtouch.fbf.entity.LoanInfoCheckExample;
import com.newtouch.fbf.entity.LoanInfoCheckExample.Criteria;
import com.newtouch.fbf.entity.TUserBaseinfo;
import com.newtouch.fbf.entity.TUserBaseinfoExample;
import com.newtouch.fbf.entity.TUserModule;
import com.newtouch.fbf.entity.TUserModuleExample;
import com.newtouch.fbf.entity.TUserReport;
import com.newtouch.fbf.entity.TUserReportCount;
import com.newtouch.fbf.entity.TUserReportCountExample;
import com.newtouch.fbf.entity.TUserReportDetail;
import com.newtouch.fbf.entity.TUserReportDetailExample;
import com.newtouch.fbf.entity.TUserReportExample;
import com.newtouch.fbf.service.ImodelService;

/** * @author  wei * @date 创建时间：2016年10月27日 下午10:07:58 * @version 1.0 * @parameter  * @since  * @return  */
@Service
public class ModelServiceImpl implements ImodelService {
	@Autowired
	private LoanInfoCheckMapper loan;
	
	@Autowired
	private LegalPersonCheckMapper legal;
	
	@Autowired
	private TUserBaseinfoMapper tuserbaseinfo;

	@Autowired
	private TUserReportDetailMapper reportdetail;

	@Autowired
	private EducationInfoCheckMapper education;
	
	@Autowired
	private TUserReportCountMapper tuserreportcount;
	
	@Autowired
	private TUserReportMapper tuser;
	
	@Autowired
	private DrivingLicenseCheckMapper dCheckMapper;
	
	@Autowired
	private IllegalInfoCheckMapper illCheckMapper;
	
	@Autowired
	private FlightInfoCheckMapper flightMapper;
	
	@Autowired
	private TUserModuleMapper tUserModuleMapper;
	
	@Autowired
	private TUserReportDetailMapper tUserReportDetailMapper;
	
	@Autowired
	private TUserReportCountMapper tUserReportCountMapper;
	
	
//根据用户的id_card查询用户的报告数	
	@Override
	public int getUserReportNum(String id_card) {
		List<TUserReport> list=null;
		try {
			TUserReportExample example= new TUserReportExample();
			com.newtouch.fbf.entity.TUserReportExample.Criteria criteria=example.createCriteria();
			criteria.andIdCardEqualTo(id_card);
			list = tuser.selectByExample(example);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		return list.size();
	}
	//插入飞行情况记录
		@Override
		public void insertFlightInfoCheck(FlightInfoCheck flightInfoCheck) {
			// TODO Auto-generated method stub
			flightMapper.insert(flightInfoCheck);
		}
	//更新飞行情况信息
		@Override
		public void updateFlightInfoCheck(FlightInfoCheck flightInfoCheck) {
			FlightInfoCheckExample example=new FlightInfoCheckExample();
			com.newtouch.fbf.entity.FlightInfoCheckExample.Criteria criteria=example.createCriteria();
			//数据库中的reportCord==loanInfoCheck.getReportCode()的数据
			criteria.andReportCodeEqualTo(flightInfoCheck.getReportCode());
			
			flightMapper.updateByExampleSelective(flightInfoCheck, example);
			
		}
	//根据code获取飞行情况信息
		@Override
		public FlightInfoCheck getFlightInfoCheck(String code) {
			FlightInfoCheckExample example=new FlightInfoCheckExample();
			com.newtouch.fbf.entity.FlightInfoCheckExample.Criteria criteria=example.createCriteria();
			
			criteria.andReportCodeEqualTo(code);
			List<FlightInfoCheck> legalPersonCheck=new ArrayList<FlightInfoCheck>();
			legalPersonCheck=flightMapper.selectByExample(example);
			if (legalPersonCheck.size()==0) {
				return null;
			}
			return legalPersonCheck.get(0);
		}

//插入贷款信息	
	@Override
	public void insertLoanInfo(LoanInfoCheck loanInfoCheck) {
		// TODO Auto-generated method stub
		loan.insert(loanInfoCheck);
	}
//更新贷款信息
	@Override
	public void updateLoanInfo(LoanInfoCheck loanInfoCheck) {
		LoanInfoCheckExample example=new LoanInfoCheckExample();
		Criteria criteria=example.createCriteria();
		//数据库中的reportCord==loanInfoCheck.getReportCode()的数据
		criteria.andReportCodeEqualTo(loanInfoCheck.getReportCode());
		
		loan.updateByExampleSelective(loanInfoCheck, example);
		
		/*LoanInfoCheck lInfoCheck1=loan.selectBycode(loanInfoCheck.getReportCode());
		System.out.println(lInfoCheck1.toString());*/
		
	}
//根据code获取贷款信息
	@Override
	public LoanInfoCheck getLoanInfo(String code) {
		// TODO Auto-generated method stub
		LoanInfoCheck lInfoCheck=loan.selectBycode(code);
		return lInfoCheck;
	}
//插入个人工商信息
	@Override
	public void insertLegalPersonCheck(LegalPersonCheck legalPersonCheck) {
		// TODO Auto-generated method stub
		legal.insert(legalPersonCheck);
	}
//根据code更新个人工商信息
	@Override
	public void updateLegalPersonCheck(LegalPersonCheck legalPersonCheck) {
		LegalPersonCheckExample example=new LegalPersonCheckExample();
		com.newtouch.fbf.entity.LegalPersonCheckExample.Criteria criteria=example.createCriteria();
		//数据库中的reportCord==loanInfoCheck.getReportCode()的数据
		criteria.andReportCodeEqualTo(legalPersonCheck.getReportCode());	
		legal.updateByExampleSelective(legalPersonCheck, example);	
	}
//根据code获取个人工商信息
	@Override
	public LegalPersonCheck getLegalPersonCheck(String code) {
		LegalPersonCheckExample example=new LegalPersonCheckExample();
		com.newtouch.fbf.entity.LegalPersonCheckExample.Criteria criteria=example.createCriteria();
		
		criteria.andReportCodeEqualTo(code);
		List<LegalPersonCheck> legalPersonCheck=new ArrayList<LegalPersonCheck>();
		legalPersonCheck=legal.selectByExample(example);
		if (legalPersonCheck.size()==0) {
			return null;
		}
		return legalPersonCheck.get(0);
	}
	
	
	
//插入行驶证信息
	@Override
	public void insertDrivingLicenseCheck(DrivingLicenseCheck dCheck) {

		dCheckMapper.insert(dCheck);
	}
//	根据code更新行驶证信息
	@Override
	public void updateDrivingLicenseCheck(DrivingLicenseCheck dCheck) {
		DrivingLicenseCheckExample example=new DrivingLicenseCheckExample();
		com.newtouch.fbf.entity.DrivingLicenseCheckExample.Criteria criteria=example.createCriteria();
		
		criteria.andReportCodeEqualTo(dCheck.getReportCode());	
		dCheckMapper.updateByExampleSelective(dCheck, example);	
		
	}
//根据code获取行驶证信息
	@Override
	public DrivingLicenseCheck getDrivingLicenseCheck(String code) {
		DrivingLicenseCheckExample example=new DrivingLicenseCheckExample();
		com.newtouch.fbf.entity.DrivingLicenseCheckExample.Criteria criteria=example.createCriteria();
		
		criteria.andReportCodeEqualTo(code);
		List<DrivingLicenseCheck> dChecks=new ArrayList<DrivingLicenseCheck>();
		dChecks=dCheckMapper.selectByExample(example);
		if (dChecks.size()==0) {
			return null;
		}
		return dChecks.get(0);
	}
	
	//插入违章查询信息
	@Override
	public void insertIllegalInfoCheck(IllegalInfoCheck iCheck) {
		illCheckMapper.insert(iCheck);
	}
	//根据code更新违章查询信息
	@Override
	public void updateIllegalInfoCheck(IllegalInfoCheck iCheck) {
		
		IllegalInfoCheckExample example=new IllegalInfoCheckExample();
		com.newtouch.fbf.entity.IllegalInfoCheckExample.Criteria criteria=example.createCriteria();
		
		criteria.andReportCodeEqualTo(iCheck.getReportCode());	
		illCheckMapper.updateByExampleSelective(iCheck, example);
		
	}
	//根据code更新违章查询信息
	@Override
	public IllegalInfoCheck getIllegalInfoCheck(String code) {
		IllegalInfoCheckExample example=new IllegalInfoCheckExample();
		com.newtouch.fbf.entity.IllegalInfoCheckExample.Criteria criteria=example.createCriteria();
		
		criteria.andReportCodeEqualTo(code);
		List<IllegalInfoCheck> list=new ArrayList<IllegalInfoCheck>();
		list = illCheckMapper.selectByExample(example);
		if (list.size()==0) {
			return null;
		}
		return list.get(0);
	}
	//插入所选择模块信息
	@Override
	public void insertTuserModel(TUserModule tUserModule) {
		tUserModuleMapper.insert(tUserModule);
	}
	//更新所选模块信息
	@Override
	public void updateTuserModel(TUserModule tUserModule) {
		TUserModuleExample example = new TUserModuleExample();
		com.newtouch.fbf.entity.TUserModuleExample.Criteria criteria=example.createCriteria();
		criteria.andReportCodeEqualTo(tUserModule.getReportCode());
		tUserModuleMapper.updateByExample(tUserModule, example);
	}
	//查询所选择模块的信息
	@Override
	public TUserModule getTuserModel(String code) {
		TUserModuleExample example = new TUserModuleExample();
		com.newtouch.fbf.entity.TUserModuleExample.Criteria criteria=example.createCriteria();
		criteria.andReportCodeEqualTo(code);
		List<TUserModule> list = new ArrayList<TUserModule>();
		list = tUserModuleMapper.selectByExample(example);
		if (list.size()==0) {
			System.out.println("null");
			return null;
		}
		return list.get(0);
	}
	
	@Override
	public void insertTUserReport(TUserReport tUserReport) {
		tuser.insert(tUserReport);	
	}
	@Override
	public void updateTUserReport(TUserReport tUserReport) {
		TUserReportExample example=new TUserReportExample();
		com.newtouch.fbf.entity.TUserReportExample.Criteria criteria=example.createCriteria();
		criteria.andReportCodeEqualTo(tUserReport.getReportCode());
		tuser.updateByExampleSelective(tUserReport, example);
		
	}
	@Override
	public TUserReport getTUserReport(String code) {
		TUserReportExample example=new TUserReportExample();
		com.newtouch.fbf.entity.TUserReportExample.Criteria criteria=example.createCriteria();
		criteria.andReportCodeEqualTo(code);
		List<TUserReport> list=new ArrayList<TUserReport>();
		list=tuser.selectByExample(example);
		if (list.size()==0) {
			return null;
		}
		return list.get(0);
	}
	
	@Override
	public void insertTUserReportDetail(TUserReportDetail tUserReportDetail) {
		// TODO Auto-generated method stub
		tUserReportDetailMapper.insert(tUserReportDetail);
	}
	@Override
	public void updateTUserReportDetail(TUserReportDetail tUserReportDetail) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public TUserReportDetail getTUserReportDetail(String code) {
		TUserReportDetailExample example=new TUserReportDetailExample();
		com.newtouch.fbf.entity.TUserReportDetailExample.Criteria criteria=example.createCriteria();
		criteria.andReportCodeEqualTo(code);
		List<TUserReportDetail> list=new ArrayList<TUserReportDetail>();
		list=tUserReportDetailMapper.selectByExample(example);
		if (list.size()==0) {
			return null;
		}
		return list.get(0);
	}
	
	@Override
	public void insertTUserReportCount(TUserReportCount tUserReportCount) {
		// TODO Auto-generated method stub
		tUserReportCountMapper.insert(tUserReportCount);
	}
	@Override
	public void updateTUserReportCount(TUserReportCount tUserReportCount) {
		TUserReportCountExample example=new TUserReportCountExample();
		com.newtouch.fbf.entity.TUserReportCountExample.Criteria criteria=example.createCriteria();
		criteria.andIdCardEqualTo(tUserReportCount.getIdCard());
		tUserReportCountMapper.updateByExampleSelective(tUserReportCount, example);
		
	}
	@Override
	public TUserReportCount getTUserReportCount(String idCard) {
		TUserReportCountExample example=new TUserReportCountExample();
		com.newtouch.fbf.entity.TUserReportCountExample.Criteria criteria=example.createCriteria();
		criteria.andIdCardEqualTo(idCard);
		List<TUserReportCount> list=new ArrayList<TUserReportCount>();
		list=tUserReportCountMapper.selectByExample(example);
		if (list.size()==0) {
			return null;
		}
		return list.get(0);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    //插入电话号码
	@Override
	public void insertMobile(TUserBaseinfo baseinfo) {
		tuserbaseinfo.insert(baseinfo);
	}

	//根据idCard获取电话号码
	@Override
	public TUserBaseinfo getMobile(String idCard) {
		TUserBaseinfoExample example = new TUserBaseinfoExample();
		com.newtouch.fbf.entity.TUserBaseinfoExample.Criteria criteria = example.createCriteria();
		criteria.andIdCardEqualTo(idCard);
		List<TUserBaseinfo> t = tuserbaseinfo.selectByExample(example);
		return t.get(0);
	}

	//根据idCard更新电话号码
	@Override
	public void updateMobile(TUserBaseinfo tubinfo){	
		
		TUserBaseinfoExample example = new TUserBaseinfoExample();
		com.newtouch.fbf.entity.TUserBaseinfoExample.Criteria criteria = example.createCriteria();
		//数据库中的reportCode==tu.getReportCode()的数据
		criteria.andIdCardEqualTo(tubinfo.getIdCard());
		tuserbaseinfo.updateByExampleSelective(tubinfo, example);
		
	}

	//插入银行卡
	@Override
	public void insertbankcard(TUserReportDetail detail) {
		reportdetail.insert(detail);
	}

    //根据code获取银行卡
	@Override
	public TUserReportDetail getbankcard(String code) {
		TUserReportDetailExample example = new TUserReportDetailExample();
		com.newtouch.fbf.entity.TUserReportDetailExample.Criteria criteria = example.createCriteria();
		criteria.andReportCodeEqualTo(code);
		List<TUserReportDetail> tu = reportdetail.selectByExample(example);
		return tu.get(0);
	}

	//根据code更新银行卡
	@Override
	public void updatebankcard(TUserReportDetail tu) {
		TUserReportDetailExample example = new TUserReportDetailExample();
		com.newtouch.fbf.entity.TUserReportDetailExample.Criteria criteria = example.createCriteria();
		//数据库中的reportCode==tu.getReportCode()的数据
		criteria.andReportCodeEqualTo(tu.getReportCode());
		reportdetail.updateByExampleSelective(tu, example);
	}

	//根据code获取学历信息
	@Override
	public EducationInfoCheck getInfo(String code) {
		EducationInfoCheck check = education.selectByCode(code);
		return check;
	}

	//根据code更新学历信息
	@Override
	public void updateInfo(EducationInfoCheck eInfoCheck) {
		EducationInfoCheckExample example = new EducationInfoCheckExample();
		com.newtouch.fbf.entity.EducationInfoCheckExample.Criteria criteria = example.createCriteria();
		//数据库中的reportCode==tu.getReportCode()的数据
		criteria.andReportCodeEqualTo(eInfoCheck.getReportCode());
		education.updateByExampleSelective(eInfoCheck, example);
	}

	//插入学历信息
	@Override
	public void insertinfo(EducationInfoCheck educheck) {
		education.insert(educheck);
	}

	//根据idCard获取生成报告次数
	@Override
	public TUserReportCount getcount(String idCard) {
	    TUserReportCount reportCount = tuserreportcount.selectByIdCard(idCard);
		return reportCount;
	}
	

	
	
	
}
