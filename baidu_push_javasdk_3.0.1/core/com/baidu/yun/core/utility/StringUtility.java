package com.baidu.yun.core.utility;

import java.util.List;
import java.util.Set;

/**
 * 字符串工具类
 * 1.主要是空字符串检验 : isNull; isNotNull
 * 2.字符串字符转为十六进制: toHexString
 * 3.字符串集合转化为json格式字符串: toJson(list); toJson(set);
 * @author maxinchun
 *
 */
public class StringUtility {
	
	public static boolean isNull(String value) {
		return value == null || value.length() == 0;
	}
	
	public static boolean isNotNull(String value) {
		return value != null && value.length() > 0;
	}
	
	public static String toHexString(byte[] datas) {
		StringBuilder sb = new StringBuilder();
		for ( int i = 0; i < datas.length; i++ ) {
			String hex = Integer.toHexString(datas[i] & 0xFF);
			if ( hex.length() <= 1 ) {
				sb.append('0');
			}
			sb.append(hex);
		}
		return sb.toString();
	}
	
	public static String toJson(List<?> list) {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for ( int i = 0; i < list.size(); i++ ) {
			if ( i != 0 ) {
				sb.append(',');
			}
			Object o = list.get(i);
			if ( o instanceof String ) {
				String os = (String)o;
				// " => \", however regex expression need double, so it become complex 
				os = os.replaceAll("\"", "\\\\\"");	
				sb.append('"').append(os).append('"');
			} else {
				sb.append(list.get(i));
			}
		}
		sb.append(']');
		return sb.toString();
	}
	
	public static String toJson(Set<String> set) {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		if ( !set.isEmpty() ) {
			for ( String key : set ) {
				sb.append("\"").append(key).append("\",");
			}
			sb.deleteCharAt(sb.length() - 1);
		}
		sb.append(']');
		return sb.toString();
	}
	
}
