package com.neusoft.grpc.app.simulation;

public interface ITopicCreator<T> {
		
	public T createTopic();
	public T createTopic(String clientId);
}
