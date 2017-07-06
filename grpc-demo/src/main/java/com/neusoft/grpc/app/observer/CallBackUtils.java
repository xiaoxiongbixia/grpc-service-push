package com.neusoft.grpc.app.observer;

public class CallBackUtils {

	@SuppressWarnings("rawtypes")
	public static ICallBack getCallBack(String topic, String info) throws Exception {
		if ("topicOne".equals(topic)) {
			return new TopicOneCallback(info);
		} else if ("topicTwo".equals(topic)) {
			return new TopicTwoCallback(info);
		}
		throw new Exception("Can't find callback for topic: " + topic);
	}
}
