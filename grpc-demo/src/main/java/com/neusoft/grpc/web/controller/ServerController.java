package com.neusoft.grpc.web.controller;

import java.io.IOException;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.protobuf.GeneratedMessageV3;
import com.neusoft.grpc.app.simulation.ITopicCreator;
import com.neusoft.grpc.app.simulation.TopicCreatorUtil;
import com.neusoft.grpc.app.utils.CacheUtils;
import com.neusoft.grpc.proto.demo1.Message;

import io.grpc.stub.StreamObserver;

@RestController
@RequestMapping("/server")
public class ServerController {
	@GetMapping("/start")
	public String start() throws IOException {
		CacheUtils.createServer(8980);
		return "OK";
	}
	@GetMapping("/simulation")
	public String simulation(){
		CacheUtils.simulation();
		return "OK";
	}
	@GetMapping("/stop")
	public String stop(){
		CacheUtils.stopServer();
		return "OK";
	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping("/autoPush/{clientId}/{topic}")
	public Object AutoPush(@PathVariable("clientId") String clientId, @PathVariable("topic") String topic) throws Exception{
		Set<String> ids = CacheUtils.topicCache.getClientId(topic);
		if(null==ids||ids.size()==0 ||!ids.contains(clientId)){
			return "err: 该客户端没有订阅该主题";
		}
		StreamObserver<Message> observer = CacheUtils.serverCache.getObserver(clientId);
		if(null==observer){
			return "err: 该客户没有向服务器注册";
		}
		
		ITopicCreator creator = TopicCreatorUtil.getCreator(topic);
		Object msg = creator.createTopic();
		Message message = Message.newBuilder().setTopicName(topic).setStatus("OK").setMessage(((GeneratedMessageV3) msg).toByteString()).build();
		observer.onNext(message);
		return msg.toString();
	}

}
