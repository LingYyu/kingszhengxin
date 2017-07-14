package com.newtouch.fbf.invo;

import javax.validation.constraints.NotNull;

/**@Title: InLoginVo.java
 * @Package com.newtouch.fbf.invo
 * @Description: 登陆用户入参类
 * @author 夏庆超
 * @date 2016年10月24日 下午2:29:48
 * @version V2.0
 */
public class InLoginVo {
	/**登录名*/
	@NotNull
	private String loginName;
	/**密码*/
	@NotNull
	private String password;
	
	/**商户类型*/
	@NotNull
	private String businessType;
	
	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
