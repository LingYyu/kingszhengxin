package com.newtouch.fbf.service;

import com.newtouch.fbf.entity.TUserBaseinfo;

/** * @author  wei * @date 创建时间：2016年10月25日 上午9:10:04 * @version 1.0 * @parameter  * @since  * @return  */
public interface ITUserService {
	
	public TUserBaseinfo findTUserBaseinfo(String idCard);
	public void updateTobaseInfo(TUserBaseinfo tUser);

}
