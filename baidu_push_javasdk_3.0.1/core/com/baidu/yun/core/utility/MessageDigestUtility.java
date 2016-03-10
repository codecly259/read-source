package com.baidu.yun.core.utility;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 消息加密工具类，使用MD5加密
 * 主要就是字符串使用utf-8编码,然后再使用MD5加密及其16进制
 * @author maxinchun
 *
 */
public class MessageDigestUtility {
	/**
	 * 给url路径使用utf-8编码
	 * @param url 需要编码的url字符串
	 * @return 返回编码后的字符串
	 */
	@SuppressWarnings("finally")
	public static String urlEncode(String url) {
		String strValue = null;
		try {
			strValue = URLEncoder.encode(url, "UTF-8"); //把url使用utf-8编码
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} finally {
			return strValue;
		}
	}
	
	public static byte[] toMD5(String datas, String charset) throws UnsupportedEncodingException {
		return toMD5(datas.getBytes(charset));
	}
	
	public static String toMD5Hex(String datas) {
		String result = null;
		try {
			result = toMD5Hex(datas, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} 
		return result;
	}
	
	public static String toMD5Hex(String datas, String charset) throws UnsupportedEncodingException {
		return toMD5Hex(datas.getBytes(charset));
	}
	
	public static byte[] toMD5(byte[] datas) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("md5");
			return md.digest(datas);
		} catch (NoSuchAlgorithmException e) {
//			throw new BCMSException();
			return null;
		}
	}
	
	public static String toMD5Hex(byte[] datas) {
		return StringUtility.toHexString(toMD5(datas));
	}
	
}
