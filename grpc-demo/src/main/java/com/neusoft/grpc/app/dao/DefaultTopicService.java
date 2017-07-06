package com.neusoft.grpc.app.dao;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.neusoft.grpc.proto.demo1.Status;
import com.neusoft.grpc.proto.demo1.TopicInfo;


public class DefaultTopicService implements ITopicService {

	private ConcurrentHashMap<String, Set<String>> topics = new ConcurrentHashMap<String, Set<String>>();
	
	public Status subscribeTopic(TopicInfo topicInfo) {
		String id = topicInfo.getClientInfo().getClientId();
		String topic = topicInfo.getTopicName();
		Set<String> ids  = topics.get(topic);
		if(ids==null){
			ids = new HashSet<String>();
			topics.put(topic, ids);
		}
		ids.add(id);
		return Status.newBuilder().setStatus("OK").build();
	}

	public Status cancelTopic(TopicInfo topicInfo) {
		String topic = topicInfo.getTopicName();
		Set<String> ids  = topics.get(topic);
		if(ids==null){
			return Status.newBuilder().setStatus("OK").build();
		}
		ids.remove(topicInfo.getClientInfo().getClientId());
		return Status.newBuilder().setStatus("OK").build();
	}

	public Set<String> getClientId(String topic) {
		return topics.get(topic);
	}

}
