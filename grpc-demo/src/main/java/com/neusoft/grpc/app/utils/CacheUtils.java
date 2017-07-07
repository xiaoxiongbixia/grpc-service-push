package com.neusoft.grpc.app.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLException;

import com.neusoft.grpc.app.DemoClient;
import com.neusoft.grpc.app.DemoServer;
import com.neusoft.grpc.app.cache.DefaultClientCache;
import com.neusoft.grpc.app.cache.IClientCache;
import com.neusoft.grpc.app.dao.DefaultTopicService;
import com.neusoft.grpc.app.dao.ITopicService;
import com.neusoft.grpc.app.simulation.MessageSimulation;
import com.neusoft.grpc.proto.demo1.Message;

public class CacheUtils {
	public volatile static IClientCache<Message> serverCache = new DefaultClientCache<Message>();
	public volatile static ITopicService topicCache = new DefaultTopicService();
	private static DemoServer demoServer;
	private static Map<String, DemoClient> clientCache = new HashMap<>();
	private static List<String> list = new ArrayList<>();

	/**
	 * 启动一个Server,目前的Demo中只支持启动一个
	 */
	public static void createServer(int port, boolean usessl, String certChainFile, String privateKeyFile, boolean useInteceptor) throws IOException {
		demoServer = new DemoServer(port, usessl, certChainFile, privateKeyFile, useInteceptor);
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					demoServer.start();
					demoServer.blockUntilShutdown();
				} catch (IOException e) {
					System.err.println("sevsert start error "+e.getLocalizedMessage());
				} catch (InterruptedException e) {
					System.err.println("sevsert interrupted "+e.getLocalizedMessage());
				}
				System.out.println("server stop. ");
			}
		}).start();
	}
	
	/**
	 * 模拟服务器定时推送消息
	 */
	public static void simulation(){
		new Thread(new MessageSimulation(topicCache, serverCache, "topicOne")).start();
		new Thread(new MessageSimulation(topicCache, serverCache, "topicTwo")).start();
	}
	
	/**
	 * 关闭服务器
	 */
	public static void stopServer(){
		demoServer.stop();
	}
	
	/**
	 * 启动一个客户端
	 * @param clientId
	 * @throws IOException 
	 */
	public static void createClient(String clientId, String serverhost, int port, boolean usessl, String trustCertFile, boolean useInteceptor) throws IOException{
		DemoClient client = new DemoClient(serverhost, port, clientId, usessl, trustCertFile, useInteceptor);
		clientCache.put(clientId, client);
	}
	
	public static DemoClient getClient(String clientId){
		return clientCache.get(clientId);
	}
	
	public static void shutDownClient(String clientId) throws InterruptedException{
		DemoClient client = clientCache.remove(clientId);
		client.shutdown();
	}

	public static List<String> getCallbackInfo(){
		return list;
	}
	
	public static void pushCallbackInfo(String info){
		list.add(info);
	}
}
