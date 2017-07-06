package com.neusoft.grpc.app.simulation;

import java.util.Random;

import com.neusoft.grpc.proto.demo1.TopicOne;

public class TopicOneCreator implements ITopicCreator<TopicOne> {

	private Random rand = new Random();

	public TopicOne createTopic() {
		int ii = rand.nextInt();
		return TopicOne.newBuilder().setTopicId("topicOneId" + ii).setTopicName("topicOneName" + ii).setXxx("xxx" + ii)
				.build();
	}

	public TopicOne createTopic(String clientId) {
		int ii = rand.nextInt();
		return TopicOne.newBuilder().setTopicId(clientId + "topicOneId" + ii)
				.setTopicName(clientId + "topicOneName" + ii).setXxx("xxx" + ii).build();
	}

}
