package com.baidu.yun.push.model;

import com.baidu.yun.core.annotation.JSonPath;
import com.baidu.yun.core.annotation.HttpParamKeyName;
import com.baidu.yun.core.annotation.R;
import com.baidu.yun.core.annotation.RangeRestrict;
import com.baidu.yun.push.constants.BaiduPushConstants;

/**
 * 记录，3个属性都是必须的，且只有属性的get方法
 * 但是直接属性的值是怎么放进去的呢，应该是和注解有关
 * @author maxinchun
 *
 */
public class Record {

	@JSonPath(path="msg_id")
	@HttpParamKeyName(name=BaiduPushConstants.MSG_ID, param=R.REQUIRE)
	private String msgId = null;
	
	@JSonPath(path="status")
	@HttpParamKeyName(name=BaiduPushConstants.MSG_STATUS, param=R.REQUIRE)
	@RangeRestrict(minLength=0, maxLength=3)
	private Integer status = null;
	
	@JSonPath(path="send_time")
	@HttpParamKeyName(name=BaiduPushConstants.SEND_TIME, param=R.REQUIRE)
	private long sendTime;
	
	// get
	public String getMsgId () {
		return msgId;
	}
	public Integer getMsgStatus () {
		return status;
	}
	public long getSendTime () {
		return sendTime;
	}
}
