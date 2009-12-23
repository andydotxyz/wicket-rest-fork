package org.innobuilt.wicket.rest.jsonrpc;

import java.io.Serializable;

public class Error implements Serializable{
	public Error(Integer code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	private Integer code;
	private String message;
	private Object data;

	public void setData(Object data) {
		this.data = data;
	}
	public Object getData() {
		return data;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public Integer getCode() {
		return code;
	}
}
