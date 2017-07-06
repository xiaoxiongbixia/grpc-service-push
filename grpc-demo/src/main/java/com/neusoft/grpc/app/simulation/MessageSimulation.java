package com.neusoft.grpc.app.simulation;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.GeneratedMessageV3;
import com.neusoft.grpc.app.cache.IClientCache;
import com.neusoft.grpc.app.dao.ITopicService;
import com.neusoft.grpc.proto.demo1.Message;

import io.grpc.stub.StreamObserver;

public class MessageSimulation implements Runnable {
	private static final Logger log = LoggerFactory.getLogger(MessageSimulation.class);

	private ITopicService topicService;
	private IClientCache<Message> clientCache;
	private String topic;

	public MessageSimulation(ITopicService topicService, IClientCache<Message> clientCache, String topic) {
		this.topicService = topicService;
		this.clientCache = clientCache;
		this.topic = topic;
	}

	@SuppressWarnings({ "rawtypes", "static-access" })
	public void run() {
		log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>MessageSimulation start " + topic + ".");
		ITopicCreator creator = null;
		try {
			creator = TopicCreatorUtil.getCreator(topic);
		} catch (Exception e1) {
		}
		while (true) {
			try {
				Thread.currentThread().sleep(4000);
			} catch (InterruptedException e) {
			}
			try {
				Set<String> ids = topicService.getClientId(topic);
				log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>MessageSimulation loop " + topic + " " + (ids == null ? 0 : ids.size()) + " size");
				if (null != ids) {
					for (String clientId : ids) {
						try {
							StreamObserver<Message> observer = clientCache.getObserver(clientId);
							if (null != observer) {
								Message message = Message.newBuilder().setTopicName(topic).setStatus("OK").setMessage(((GeneratedMessageV3) creator.createTopic(clientId)).toByteString()).build();
								log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>buf size:" + message.toByteArray().length);
								observer.onNext(message);
							} else {
								log.error("can't find observer for: " + clientId);
							}
						} catch (Exception e) {
							log.error(e.getLocalizedMessage());
						}
					}
				}
			} catch (Exception e) {
				log.error(e.getLocalizedMessage());
			}
		}
	}

}
