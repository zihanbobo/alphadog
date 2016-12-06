package com.moseeker.common.exception;

/**
 * @author ltf
 * redis 连接异常
 * 2016年11月7日
 */
public class RedisClientException extends RuntimeException {
	/**
	 * 版本号
	 */
	private static final long serialVersionUID = -7464081885655993673L;
	/**
	 * 异常描述 & 事件描述event_details
	 */
	private String message;
	/**
	 * 项目appid
	 */
	private int appid;
	/**
	 * 出错位置(this.getClass().getName())
	 */
	private String location;
	/**
	 * 事件类型 
	 */
	private String eventKey;
	
	/**
	 * @param message 异常描述 & 事件描述event_details
	 * @param appid 项目appid
	 * @param location 出错位置(this.getClass().getName())
	 * @param eventKey 事件类型
	 */
	public RedisClientException(String message, int appid, String location, String eventKey){
		super(message);
		this.message = message;
		this.appid = appid;
		this.location = location;
		this.eventKey = eventKey;
	}
	
	public RedisClientException(){}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getAppid() {
		return appid;
	}

	public void setAppid(int appid) {
		this.appid = appid;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEventKey() {
		return eventKey;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}
}
