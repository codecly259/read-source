package com.baidu.yun.push.auth.signature;

import java.util.Map;

import com.baidu.yun.core.utility.MessageDigestUtility;

/**
 * 推送签名使用MD5加密字符串16进制格式
 * @author maxinchun
 *
 */
public class PushSignatureDigest {
	
	public static final String URL_KEY = "url";
	public static final String HTTP_METHOD_KEY = "http_method";
	public static final String CLIENT_SECRET_KEY = "client_secret";
	
	public String digest(String accessKey, String secretKey, Map<String, String> params) {
		return null;
	}
	
	public String digest(String method, String url, String clientSecret, Map<String, String> params) {
		StringBuilder sb = new StringBuilder();
		sb.append(method).append(url);
		for (Map.Entry<String, String> entry : params.entrySet()) {
			String key = entry.getKey();
			if ( URL_KEY.equals(key) || HTTP_METHOD_KEY.equals(key) ) {
				continue;
			} else {
				sb.append(entry.getKey()).append('=').append(entry.getValue());
			}
		}
		sb.append(clientSecret);
		String encodeString = MessageDigestUtility.urlEncode(sb.toString()); // 使用utf-8编码
		if ( encodeString != null ) {
			encodeString = encodeString.replaceAll("\\*", "%2A");
		}
 		return MessageDigestUtility.toMD5Hex(encodeString);
	}
	
	
	public boolean checkParams(Map<String, String> params) {
		return false;
	}
	
}
