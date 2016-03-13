package com.baidu.yun.push.exception;

/**
 * 推送客户端异常类
 * 直接继承Exception类，只提供一个有参数的构造方法
 * @author maxinchun
 *
 */
public class PushClientException extends Exception {

	private static final long serialVersionUID = 4666593066875898324L;

	public PushClientException(String msg) {
		super(msg);
	}
	
}
