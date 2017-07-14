/**   
* @Title: TestOutvo.java 
* @Package com.newtouch.fbf.outvo 
* @Description: TODO(用一句话描述该文件做什么) 
* @author qingchao
* @date 2016年10月25日 下午2:40:56 
* @version V2.0   
*/
package com.newtouch.fbf.outvo;

/**
 * 用户登陆返回参数
 * 
 * @author 夏庆超
 * @date 2016年10月25日 下午2:40:56
 * @version V2.0
 */
public class LoginOutvo {

	/**用户ID*/
	private String id;
	/**登陆名称*/
	private String loginName;
	/**密码*/
	private String loginPassword;
	/**用户类型*/
	private String businessType;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getLoginName() {
		return loginName;
	}
	
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	public String getLoginPassword() {
		return loginPassword;
	}
	
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	
	public String getBusinessType() {
		return businessType;
	}
	
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	
	
	

}
