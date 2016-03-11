package com.baidu.yun.push.client;

import com.baidu.yun.push.exception.PushClientException;
import com.baidu.yun.push.exception.PushServerException;
import com.baidu.yun.push.model.AddDevicesToTagRequest;
import com.baidu.yun.push.model.AddDevicesToTagResponse;
import com.baidu.yun.push.model.CreateTagRequest;
import com.baidu.yun.push.model.CreateTagResponse;
import com.baidu.yun.push.model.DeleteDevicesFromTagRequest;
import com.baidu.yun.push.model.DeleteDevicesFromTagResponse;
import com.baidu.yun.push.model.DeleteTagRequest;
import com.baidu.yun.push.model.DeleteTagResponse;
import com.baidu.yun.push.model.PushBatchUniMsgRequest;
import com.baidu.yun.push.model.PushBatchUniMsgResponse;
import com.baidu.yun.push.model.PushMsgToAllRequest;
import com.baidu.yun.push.model.PushMsgToAllResponse;
import com.baidu.yun.push.model.PushMsgToSingleDeviceRequest;
import com.baidu.yun.push.model.PushMsgToSingleDeviceResponse;
import com.baidu.yun.push.model.PushMsgToSmartTagRequest;
import com.baidu.yun.push.model.PushMsgToSmartTagResponse;
import com.baidu.yun.push.model.PushMsgToTagRequest;
import com.baidu.yun.push.model.PushMsgToTagResponse;
import com.baidu.yun.push.model.QueryDeviceNumInTagRequest;
import com.baidu.yun.push.model.QueryDeviceNumInTagResponse;
import com.baidu.yun.push.model.QueryMsgStatusRequest;
import com.baidu.yun.push.model.QueryMsgStatusResponse;
import com.baidu.yun.push.model.QueryStatisticDeviceRequest;
import com.baidu.yun.push.model.QueryStatisticDeviceResponse;
import com.baidu.yun.push.model.QueryStatisticMsgRequest;
import com.baidu.yun.push.model.QueryStatisticMsgResponse;
import com.baidu.yun.push.model.QueryStatisticTopicRequest;
import com.baidu.yun.push.model.QueryStatisticTopicResponse;
import com.baidu.yun.push.model.QueryTagsRequest;
import com.baidu.yun.push.model.QueryTagsResponse;
import com.baidu.yun.push.model.QueryTimerListRequest;
import com.baidu.yun.push.model.QueryTimerListResponse;
import com.baidu.yun.push.model.QueryTimerRecordsRequest;
import com.baidu.yun.push.model.QueryTimerRecordsResponse;
import com.baidu.yun.push.model.QueryTopicListRequest;
import com.baidu.yun.push.model.QueryTopicListResponse;
import com.baidu.yun.push.model.QueryTopicRecordsRequest;
import com.baidu.yun.push.model.QueryTopicRecordsResponse;

/**
 * 百度推送接口,定义百度推送的基本推送功能。这里也是暴露给开发者的主要推送方法接口。 
 * 其中每个推送或者查询、创建、删除操作的参数都有对应的请求对象且都继承一个统一的推动请求类PushRequest;
 * 同样的，每个函数的返回值都是对应的相应类对象,这些对象都继承一个统一的推送相应类PushResponse;
 * 主要包括：
 * 1. pushMsgToSingleDevice: 推送消息给单个设备
 * 2. pushMsgToAll: 推送消息给所有设备,即广播推送
 * 3. pushMsgToTag: 推送消息到标签的设备 //向绑定到tag中的用户推送消息，即普通组播。
 * 4. pushMagToSmartTag: 推送消息给指定的标签组。注：目前开放组合运算功能，仅对Android平台有效。
 * 5. pushBatchUniMsg: 推送消息给批量设备（批量单播）。
 * 6. queryMsgStatus: 查询消息推送状态，包括成功、失败、待发送、发送中4种状态。
 * 7. queryTimerRecords: 根据 timerId，获取一个定时的消息推送记录。
 * 8. queryTopicRecords: 根据 topic_id， 获取相应时间范围内的消息推送记录。
 * 9. queryTimerList: 查询定时推送任务信息列表。目前，每个应用可设置10个有效的定时任务。
 * 10. queryTopicList: 查询当前90天内消息推送中使用的类别主题的信息。
 * 11. queryTags: 查询用户定义的标签组信息。
 * 12. createTag: 创建用户自定义的标签组。
 * 13. deleteTag: 删除用户自定义的标签组。
 * 14. addDevicesToTag: 向标签组中批量添加设备。
 * 15. deleteDevicesFromTag: 从标签组中批量删除设备。
 * 16. queryDeviceNumInTag: 查看标签组中关联的设备。
 * 17. queryStatisticMsg: 统计app消息信息,返回30天所有统计项。
 * 18. queryStatisticTopic: 统计app某个分类主题的30天内的消息数。
 * 19. queryStatisticDevice: 统计安装了app的设备数,返回30天的所有统计项。
 * @author maxinchun
 *
 */
public interface BaiduPush {

	public PushMsgToSingleDeviceResponse pushMsgToSingleDevice (
			PushMsgToSingleDeviceRequest request) throws PushClientException,
		    PushServerException;
	
	public PushMsgToAllResponse pushMsgToAll (
			PushMsgToAllRequest request) throws PushClientException,
		    PushServerException;
	
	public PushMsgToTagResponse pushMsgToTag (
			PushMsgToTagRequest request) throws PushClientException, 
	PushServerException;
	
	public PushMsgToSmartTagResponse pushMsgToSmartTag (
			PushMsgToSmartTagRequest request) throws PushClientException, 
	PushServerException;
	
	public PushBatchUniMsgResponse pushBatchUniMsg (
			PushBatchUniMsgRequest request) throws PushClientException, 
	PushServerException;
	
	public QueryMsgStatusResponse queryMsgStatus (
			QueryMsgStatusRequest request) throws PushClientException, 
	PushServerException;
	
	public QueryTimerRecordsResponse queryTimerRecords (
			QueryTimerRecordsRequest request) throws PushClientException, 
	PushServerException;
	
	public QueryTopicRecordsResponse queryTopicRecords (
			QueryTopicRecordsRequest request) throws PushClientException, 
	PushServerException;
	
	public QueryTimerListResponse queryTimerList (
			QueryTimerListRequest request) throws PushClientException, 
	PushServerException;
	
	public QueryTopicListResponse queryTopicList (
			QueryTopicListRequest request) throws PushClientException, 
	PushServerException;
	
	public QueryTagsResponse queryTags (
			QueryTagsRequest request) throws PushClientException, 
	PushServerException;
	
	public CreateTagResponse createTag (
			CreateTagRequest request) throws PushClientException, 
	PushServerException;
	
	public DeleteTagResponse deleteTag (
			DeleteTagRequest request) throws PushClientException, 
	PushServerException;
	
	public AddDevicesToTagResponse addDevicesToTag (
			AddDevicesToTagRequest request) throws PushClientException, 
	PushServerException;
	
	public DeleteDevicesFromTagResponse deleteDevicesFromTag (
			DeleteDevicesFromTagRequest request) throws PushClientException, 
	PushServerException;
	
	public QueryDeviceNumInTagResponse queryDeviceNumInTag (
			QueryDeviceNumInTagRequest request) throws PushClientException, 
	PushServerException;
	
	public QueryStatisticMsgResponse queryStatisticMsg (
			QueryStatisticMsgRequest request) throws PushClientException, 
	PushServerException;
	
	public QueryStatisticTopicResponse queryStatisticTopic (
			QueryStatisticTopicRequest request) throws PushClientException, 
	PushServerException;
	
	public QueryStatisticDeviceResponse queryStatisticDevice (
			QueryStatisticDeviceRequest request) throws 
	PushClientException, PushServerException;
	
}
