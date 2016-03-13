package com.baidu.yun.core.model;

/**
 * Rest请求的相应类
 * 一个状态码httpStatusCode,一个响应json字符串 jsonResponse
 * @author maxinchun
 *
 */
public class HttpRestResponse {
	
	private int httpStatusCode;

	private String jsonResponse;

	public int getHttpStatusCode() {
		return httpStatusCode;
	}

	public void setHttpStatusCode(int httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getJsonResponse() {
		return jsonResponse;
	}

	public void setJsonResponse(String jsonResponse) {
		this.jsonResponse = jsonResponse;
	}
	
}
