package com.neusoft.grpc.app.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.neusoft.grpc.app.utils.CacheUtils;
import com.neusoft.grpc.proto.demo1.TopicOne;

public class TopicOneCallback implements ICallBack<TopicOne>{
	private String info;
	
	public TopicOneCallback(String info){
		this.info = info;
	}
	
	private static final Logger log = LoggerFactory.getLogger(TopicOneCallback.class);

	@Override
	public void callback(ByteString bytes) {
		try {
			TopicOne one = TopicOne.parseFrom(bytes);
			log.info(info+":callback-log: {topicName:"+one.getTopicName()+",topicId:"+one.getTopicId()+",xxx:"+one.getXxx()+"}");
			CacheUtils.pushCallbackInfo(info+":{topicName:"+one.getTopicName()+",topicId:"+one.getTopicId()+",xxx:"+one.getXxx()+"}");
		} catch (InvalidProtocolBufferException e) {
			log.error(info+e.getLocalizedMessage());
		}
	}

}
