package com.cursojpa.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Long timeStamp;
	
	public StandardError(Integer status, String msg, Long timeStamp) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStamp = timeStamp;
	}
	public Integer getStatus() {
		return status;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public Long getTimeStamp() {
		return timeStamp;
	}
	
}
