package com.newtouch.fbf.service;

import com.newtouch.fbf.entity.TSystemUser;
import com.newtouch.fbf.entity.TUserBaseinfo;

/** * @author  wei * @date 创建时间：2016年10月22日 上午9:35:45 * @version 1.0 * @parameter  * @since  * @return  */

public interface TSystemUserServiceI {
	
	/**
	 * 核验身份
	 */
	public String isExist(String name,String idCard);

	/**
	 * 录入基本信息
	 */
	public void insertTobaseInfoTable(TUserBaseinfo tUser);
	
	/**
	 * 查找指定用户信息
	 * @return
	 */
	public TUserBaseinfo findOneTSystemUser(String id_card);

}
