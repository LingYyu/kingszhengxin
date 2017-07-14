package com.newtouch.fbf.common.bean;
/**
 * 编辑方法执行结果
 * 
 */
public class ResultMessage<T> {

	/**
	 * 方法执行毫秒数
	 */
	private long millis;
	/**
	 * 结果状态码
	 */
	private String code;
	/**
	 * 结果信息
	 */
	private String message;

	private T entity;

	public ResultMessage() {
	}

	public ResultMessage(String code, long millis, String message) {
		this.code = code;
		this.millis = System.currentTimeMillis() - millis;
		this.message = message;
	}

	public ResultMessage(String code, long millis, String message,
			T entity) {
		this.code = code;
		this.millis = System.currentTimeMillis() - millis;
		this.message = message;
		this.entity = entity;
	}
	
	public long getMillis() {
		return millis;
	}

	public void setMillis(long millis) {
		this.millis = millis;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getEntity() {
		return entity;
	}

	public void setEntity(T entity) {
		this.entity = entity;
	}

	

}
