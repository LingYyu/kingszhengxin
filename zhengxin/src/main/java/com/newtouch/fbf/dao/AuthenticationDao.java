/**   
* @Title: authenticationService.java 
* @Package com.newtouch.fbf.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author qingchao
* @date 2016年10月24日 上午11:10:07 
* @version V2.0   
*/
package com.newtouch.fbf.dao;

import org.springframework.stereotype.Repository;

/**
 * 登陆注册实现层接口
 * @author 夏庆超
 * @date 2016年10月24日 上午11:09:40
 * @version V2.0 
 */
@Repository
public interface AuthenticationDao {

	public String getUserinfo();
}
