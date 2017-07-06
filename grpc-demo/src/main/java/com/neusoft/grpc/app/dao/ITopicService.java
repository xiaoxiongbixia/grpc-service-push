package com.neusoft.grpc.app.dao;

import java.util.Set;

import com.neusoft.grpc.proto.demo1.Status;
import com.neusoft.grpc.proto.demo1.TopicInfo;


public interface ITopicService {
	
	public Status subscribeTopic(TopicInfo topicInfo);

	public Status cancelTopic(TopicInfo topicInfo);

	public Set<String> getClientId(String topic);
}
