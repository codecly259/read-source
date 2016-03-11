package com.baidu.yun.push.auth;

/**
 * 推送应用秘钥和验证秘钥对
 * @author maxinchun
 *
 */
public class PushKeyPair {

	private String apiKey;

	private String secretKey;

	public PushKeyPair(String apiKey, String secretKey) {
		this.apiKey = apiKey;
		this.secretKey = secretKey;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

}
