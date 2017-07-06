package com.neusoft.grpc.app.simulation;

import java.util.Random;

import com.neusoft.grpc.proto.demo1.TopicTwo;

public class TopicTwoCreator implements ITopicCreator<TopicTwo> {

	private Random rand = new Random();

	public TopicTwo createTopic() {
		int ii = rand.nextInt();
		return TopicTwo.newBuilder().setTopicId("topicTwoId" + ii).setTopicName("topicTwoName" + ii).setYyy(ii).setBoolType(true).build();
	}

	public TopicTwo createTopic(String clientId) {
		int ii = rand.nextInt();
		return TopicTwo.newBuilder().setTopicId(clientId + "topicTwoId" + ii).setTopicName(clientId + "topicTwoName" + ii).setYyy(ii).setBoolType(true).build();
	}

}
