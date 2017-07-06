package com.neusoft.grpc.app;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.neusoft.grpc.app.observer.DefaultObserver;
import com.neusoft.grpc.proto.demo1.ClientInfo;
import com.neusoft.grpc.proto.demo1.Status;
import com.neusoft.grpc.proto.demo1.SubscribeTopicGrpc;
import com.neusoft.grpc.proto.demo1.TopicInfo;
import com.neusoft.grpc.proto.demo1.SubscribeTopicGrpc.SubscribeTopicBlockingStub;
import com.neusoft.grpc.proto.demo1.SubscribeTopicGrpc.SubscribeTopicStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class DemoClient {
	private static final Logger logger = LoggerFactory.getLogger(DemoClient.class);
	private final SubscribeTopicStub asyncStub;
	private final SubscribeTopicBlockingStub blockingStub;
	private final ManagedChannel channel;
	private final String clientId;
	private final ClientInfo clientInfo;

	public DemoClient(String host, int port, String clientId) {
		this(ManagedChannelBuilder.forAddress(host, port).usePlaintext(true), clientId);
	}

	/**
	 * Construct client for accessing RouteGuide server using the existing
	 * channel.
	 */
	public DemoClient(ManagedChannelBuilder<?> channelBuilder, String clientId) {
		this.clientId = clientId;
		this.clientInfo = ClientInfo.newBuilder().setClientId(clientId).build();
		this.channel = channelBuilder.build();
		this.asyncStub = SubscribeTopicGrpc.newStub(channel);
		this.blockingStub = SubscribeTopicGrpc.newBlockingStub(channel);
		logger.info("init client "+clientId);
	}

	public void shutdown() throws InterruptedException {
		this.logoutFromServer();
		this.channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
		logger.info("shut down "+clientId);
	}

	public void registerToServer(){
		this.asyncStub.registerToServer(this.clientInfo, new DefaultObserver(this.clientId, this));
	}
	
	public String subscribeTopic(String topic){
		TopicInfo topicInfo = TopicInfo.newBuilder().setTopicName(topic).setClientInfo(this.clientInfo).build();
		Status status = this.blockingStub.subscribeTopic(topicInfo);
		return status.getStatus();
	}
	
	public String cancelTopic(String topic){
		TopicInfo topicInfo = TopicInfo.newBuilder().setTopicName(topic).setClientInfo(this.clientInfo).build();
		Status status = this.blockingStub.cancelTopic(topicInfo);
		return status.getStatus();
	}
	
	public String logoutFromServer(){
		Status status = this.blockingStub.logoutFromServer(this.clientInfo);
		return status.getStatus();
	}
	
}
