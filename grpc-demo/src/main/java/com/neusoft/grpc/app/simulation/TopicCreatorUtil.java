package com.neusoft.grpc.app.simulation;

public class TopicCreatorUtil {

	@SuppressWarnings("rawtypes")
	public static ITopicCreator getCreator(String topic) throws Exception {
		if ("topicOne".equals(topic)) {
			return new TopicOneCreator();
		} else if ("topicTwo".equals(topic)) {
			return new TopicTwoCreator();
		}
		throw new Exception("Can't find topic creator for: " + topic);
	}
}
