package com.baidu.yun.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 集合限定
 * 最大值(默认Integer最大值)  最小值(默认Integer最小值)
 * @author maxinchun
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface CollectionRestrict {

	public int minLength() default Integer.MIN_VALUE;
	
	public int maxLength() default Integer.MAX_VALUE;
	
	
}
