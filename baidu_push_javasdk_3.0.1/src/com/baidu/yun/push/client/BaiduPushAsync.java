package com.baidu.yun.push.client;

import java.util.concurrent.Future;

import com.baidu.yun.push.exception.PushClientException;
import com.baidu.yun.push.exception.PushServerException;
import com.baidu.yun.push.model.PushMsgToSingleDeviceRequest;
import com.baidu.yun.push.model.PushMsgToSingleDeviceResponse;

/**
 * 百度异步推送接口
 * 当前只定义了一个方法: pushMsgToSingleDeviceAsync 异步推送消息到单个设备
 * @author maxinchun
 *
 */
public interface BaiduPushAsync {

	Future<PushMsgToSingleDeviceResponse> pushMsgToSingleDeviceAsync(
			PushMsgToSingleDeviceRequest request)
			throws PushClientException, PushServerException;

}
