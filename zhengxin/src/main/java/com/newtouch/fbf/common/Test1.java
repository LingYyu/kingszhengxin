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

public class Test1 {
	private TUserBaseinfo tUserBaseinfo;
	private TUserReport tuser;
	private EducationInfoCheck edu;
	private LegalPersonCheck legal;
	private LoanInfoCheck loan;
	private DrivingLicenseCheck drivinglicense;
	private IllegalInfoCheck illegal;
	private FlightInfoCheck flight;
	private TUserModule tUserModule;
	
	

	public TUserBaseinfo gettUserBaseinfo() {
		return tUserBaseinfo;
	}

	public void settUserBaseinfo(TUserBaseinfo tUserBaseinfo) {
		this.tUserBaseinfo = tUserBaseinfo;
	}

	public TUserModule gettUserModule() {
		return tUserModule;
	}

	public void settUserModule(TUserModule tUserModule) {
		this.tUserModule = tUserModule;
	}

	public TUserReport getTuser() {
		return tuser;
	}

	public void setTuser(TUserReport tuser) {
		this.tuser = tuser;
	}
	public EducationInfoCheck getEdu() {
		return edu;
	}

	public void setEdu(EducationInfoCheck edu) {
		this.edu = edu;
	}

	public LegalPersonCheck getLegal() {
		return legal;
	}

	public void setLegal(LegalPersonCheck legal) {
		this.legal = legal;
	}

	public LoanInfoCheck getLoan() {
		return loan;
	}

	public void setLoan(LoanInfoCheck loan) {
		this.loan = loan;
	}

	public DrivingLicenseCheck getDrivinglicense() {
		return drivinglicense;
	}

	public void setDrivinglicense(DrivingLicenseCheck drivinglicense) {
		this.drivinglicense = drivinglicense;
	}

	public IllegalInfoCheck getIllegal() {
		return illegal;
	}

	public void setIllegal(IllegalInfoCheck illegal) {
		this.illegal = illegal;
	}

	public FlightInfoCheck getFlight() {
		return flight;
	}

	public void setFlight(FlightInfoCheck flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "Test1 [tuser=" + tuser + ", edu=" + edu + ", legal=" + legal + ", loan=" + loan + ", drivinglicense="
				+ drivinglicense + ", illegal=" + illegal + ", flight=" + flight + "]";
	}


}
