package com.baidu.yun.push.exception;

/**
 * 推送服务端异常类,用户推送服务错误时的定位
 * 1. requestId   请求ID
 * 2. errorCode   错误状态码
 * 3. errorMsg    错误信息
 * @author maxinchun
 *
 */
public class PushServerException extends Exception {

	private static final long serialVersionUID = 216042651216631503L;

	private long requestId;
	
	private int errorCode;
	
	private String errorMsg = null;

	public PushServerException() {
		
	}

	public PushServerException(long requestId, int errorCode, String errorMsg) {
		this.requestId = requestId;
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public long getRequestId() {
		return requestId;
	}

	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
}
