package com.neusoft.grpc.app.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.neusoft.grpc.app.DemoClient;
import com.neusoft.grpc.proto.demo1.Message;

import io.grpc.stub.StreamObserver;

public class DefaultObserver implements StreamObserver<Message> {
	private static final Logger log = LoggerFactory.getLogger(DefaultObserver.class);
	private DemoClient client; //用于回调客户端信息
	private String info;
	
	public DefaultObserver(String info, DemoClient client){
		this.info = info;
		this.client = client;
	}
	
	@Override
	public void onCompleted() {
		log.info(info+"onCompleted");
	}

	@Override
	public void onError(Throwable arg0) {
		log.info(info+"onCompleted");
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void onNext(Message message) {
		log.info(info+",{topicName:"+message.getTopicName()+",status:"+message.getStatus()+"}");
		ICallBack call;
		try {
			call = CallBackUtils.getCallBack(message.getTopicName(), info);
			call.callback(message.getMessage());
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
		}
	}

}
