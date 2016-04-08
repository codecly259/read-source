package com.baidu.yun.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 限定范围  最大长度(Long的最大值)，最小长度(Long的最小值)
 * @author maxinchun
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface RangeRestrict {
	
	public long minLength() default Long.MIN_VALUE;
	
	public long maxLength() default Long.MAX_VALUE;
	
}
