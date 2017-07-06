package com.neusoft.grpc.app.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.neusoft.grpc.app.utils.CacheUtils;
import com.neusoft.grpc.proto.demo1.TopicTwo;

public class TopicTwoCallback implements ICallBack<TopicTwo>{
	private String info;
	
	public TopicTwoCallback(String info){
		this.info = info;
	}
	private static final Logger log = LoggerFactory.getLogger(TopicTwoCallback.class);

	@Override
	public void callback(ByteString bytes) {
		try {
			TopicTwo two = TopicTwo.parseFrom(bytes);
			log.info(info+":callback-log: {topicName:"+two.getTopicName()+",topicId:"+two.getTopicId()+",yyy:"+two.getYyy()+",boolType:"+two.getBoolType()+"}");
			CacheUtils.pushCallbackInfo(info+":{topicName:"+two.getTopicName()+",topicId:"+two.getTopicId()+",yyy:"+two.getYyy()+",boolType:"+two.getBoolType()+"}");
		} catch (InvalidProtocolBufferException e) {
			log.error(info+e.getLocalizedMessage());
		}
	}

}
