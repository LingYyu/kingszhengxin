package com.newtouch.fbf.common;

import com.newtouch.fbf.entity.DrivingLicenseCheck;
import com.newtouch.fbf.entity.EducationInfoCheck;
import com.newtouch.fbf.entity.FlightInfoCheck;
import com.newtouch.fbf.entity.IllegalInfoCheck;
import com.newtouch.fbf.entity.LegalPersonCheck;
import com.newtouch.fbf.entity.LoanInfoCheck;
import com.newtouch.fbf.entity.TUserBaseinfo;
import com.newtouch.fbf.entity.TUserModule;
import com.newtouch.fbf.entity.TUserReport;
import com.newtouch.fbf.entity.TUserReportDetail;

/** * @author  wei * @date 创建时间：2016年11月4日 上午10:57:46 * @version 1.0 * @parameter  * @since  * @return  */
public class Modules {
	private TUserReport tUserReport;
	private TUserReportDetail  tUserReportDetail;
	private TUserBaseinfo tUserBaseinfo;
	private EducationInfoCheck educationInfoCheck;
	private LegalPersonCheck lagalPersonCheck;
	private LoanInfoCheck loanInfoCheck;
	private DrivingLicenseCheck drivingLicenseCheck;
	private IllegalInfoCheck illegalInfoCheck;
	private FlightInfoCheck flightInfoCheck;
	private TUserModule tUserModule;
	
	public TUserModule gettUserModule() {
		return tUserModule;
	}

	public void settUserModule(TUserModule tUserModule) {
		this.tUserModule = tUserModule;
	}

	public TUserReport gettUserReport() {
		return tUserReport;
	}
	
	public void settUserReport(TUserReport tUserReport) {
		this.tUserReport = tUserReport;
	}
	public TUserReportDetail gettUserReportDetail() {
		return tUserReportDetail;
	}
	public void settUserReportDetail(TUserReportDetail tUserReportDetail) {
		this.tUserReportDetail = tUserReportDetail;
	}
	public TUserBaseinfo gettUserBaseinfo() {
		return tUserBaseinfo;
	}
	public void settUserBaseinfo(TUserBaseinfo tUserBaseinfo) {
		this.tUserBaseinfo = tUserBaseinfo;
	}
	public EducationInfoCheck getEducationInfoCheck() {
		return educationInfoCheck;
	}
	public void setEducationInfoCheck(EducationInfoCheck educationInfoCheck) {
		this.educationInfoCheck = educationInfoCheck;
	}
	public LegalPersonCheck getLagalPersonCheck() {
		return lagalPersonCheck;
	}
	public void setLagalPersonCheck(LegalPersonCheck lagalPersonCheck) {
		this.lagalPersonCheck = lagalPersonCheck;
	}
	public LoanInfoCheck getLoanInfoCheck() {
		return loanInfoCheck;
	}
	public void setLoanInfoCheck(LoanInfoCheck loanInfoCheck) {
		this.loanInfoCheck = loanInfoCheck;
	}
	public DrivingLicenseCheck getDrivingLicenseCheck() {
		return drivingLicenseCheck;
	}
	public void setDrivingLicenseCheck(DrivingLicenseCheck drivingLicenseCheck) {
		this.drivingLicenseCheck = drivingLicenseCheck;
	}
	public IllegalInfoCheck getIllegalInfoCheck() {
		return illegalInfoCheck;
	}
	public void setIllegalInfoCheck(IllegalInfoCheck illegalInfoCheck) {
		this.illegalInfoCheck = illegalInfoCheck;
	}
	public FlightInfoCheck getFlightInfoCheck() {
		return flightInfoCheck;
	}
	public void setFlightInfoCheck(FlightInfoCheck flightInfoCheck) {
		this.flightInfoCheck = flightInfoCheck;
	}

	@Override
	public String toString() {
		return "Modules [tUserReport=" + tUserReport + ", tUserReportDetail=" + tUserReportDetail + ", tUserBaseinfo="
				+ tUserBaseinfo + ", educationInfoCheck=" + educationInfoCheck + ", lagalPersonCheck="
				+ lagalPersonCheck + ", loanInfoCheck=" + loanInfoCheck + ", drivingLicenseCheck=" + drivingLicenseCheck
				+ ", illegalInfoCheck=" + illegalInfoCheck + ", flightInfoCheck=" + flightInfoCheck + ", tUserModule="
				+ tUserModule + "]";
	}
	

	
}
