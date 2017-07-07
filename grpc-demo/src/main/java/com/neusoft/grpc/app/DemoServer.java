package com.neusoft.grpc.app;


import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.neusoft.grpc.app.interceptor.DemoServerInterceptor;
import com.neusoft.grpc.app.simulation.MessageSimulation;
import com.neusoft.grpc.app.utils.CacheUtils;
import com.neusoft.grpc.app.utils.FileLoadUtils;
import com.neusoft.grpc.proto.demo1.ClientInfo;
import com.neusoft.grpc.proto.demo1.Message;
import com.neusoft.grpc.proto.demo1.Status;
import com.neusoft.grpc.proto.demo1.SubscribeTopicGrpc.SubscribeTopicImplBase;
import com.neusoft.grpc.proto.demo1.TopicInfo;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerInterceptors;
import io.grpc.netty.NettyServerBuilder;

public class DemoServer {
	private static final Logger logger = LoggerFactory.getLogger(DemoClient.class);

	private final int port;
	private final Server server;

	/**
	 * Create a RouteGuide server listening on {@code port} using
	 * {@code featureFile} database.
	 */
	public DemoServer(int port) throws IOException {
		this(ServerBuilder.forPort(port), port, false);
	}
	
	public DemoServer(int port, boolean useSSL, String certChainFile, String privateKeyFile, boolean useInteceptor) throws IOException{
		this(useSSL?NettyServerBuilder.forPort(port).useTransportSecurity(FileLoadUtils.loadFile(certChainFile),
				FileLoadUtils.loadFile(privateKeyFile))
				:ServerBuilder.forPort(port), port, useInteceptor);
	}

	/**
	 * Create a RouteGuide server using serverBuilder as a base and features as
	 * data.
	 */
	public DemoServer(ServerBuilder<?> serverBuilder, int port, boolean useInteceptor) {
		this.port = port;
		if(useInteceptor){
			server = serverBuilder.addService(ServerInterceptors.intercept(new SubscribeTopicServer(),new DemoServerInterceptor())).build();
		}else{
			server = serverBuilder.addService(new SubscribeTopicServer()).build();
		}
	}

	/** Start serving requests. */
	public void start() throws IOException {
		server.start();
		logger.info("Server started, listening on " + port);
		Runtime.getRuntime().addShutdownHook(new Thread() {

			public void run() {
				System.err.println("*** shutting down gRPC server since JVM is shutting down");
				DemoServer.this.stop();
				System.err.println("*** server shut down");
			}
		});
	}

	/** Stop serving requests and shutdown resources. */
	public void stop() {
		if (server != null) {
			server.shutdown();
		}
	}

	/**
	 * Await termination on the main thread since the grpc library uses daemon
	 * threads.
	 */
	public void blockUntilShutdown() throws InterruptedException {
		if (server != null) {
			server.awaitTermination();
		}
	}

	/**
	 * Main method. This comment makes the linter happy.
	 * @throws Exception 
	 */
	
	public static void main(String[] args) throws Exception{
		DemoServer server = new DemoServer(8980);
		server.start();
		new Thread(new MessageSimulation(CacheUtils.topicCache,CacheUtils.serverCache, "topicOne")).start();
		new Thread(new MessageSimulation(CacheUtils.topicCache, CacheUtils.serverCache, "topicTwo")).start();
		server.blockUntilShutdown();
	}
	
	
	public static class SubscribeTopicServer extends SubscribeTopicImplBase {
		 /**
	     * <pre>
	     *注册到基于protoBuf格式的推送服务
	     * </pre>
	     */
		@Override
	    public void registerToServer(ClientInfo request,
	        io.grpc.stub.StreamObserver<Message> responseObserver) {
			CacheUtils.serverCache.registerToServer(request, responseObserver);
	    }


	    /**
	     * <pre>
	     *订阅某些主题
	     * </pre>
	     */
	    @Override
	    public void subscribeTopic(TopicInfo request,
	        io.grpc.stub.StreamObserver<Status> responseObserver) {
	    	Status status = CacheUtils.topicCache.subscribeTopic(request);
	    	responseObserver.onNext(status);
	    	responseObserver.onCompleted();
	    }

	    /**
	     * <pre>
	     *取消订阅某些主题
	     * </pre>
	     */
	    @Override
	    public void cancelTopic(TopicInfo request,
	        io.grpc.stub.StreamObserver<Status> responseObserver) {
	    	Status status = CacheUtils.topicCache.cancelTopic(request);
	    	responseObserver.onNext(status);
	    	responseObserver.onCompleted();
	    }

	    /**
	     * <pre>
	     *从服务注销
	     * </pre>
	     */
	    @Override
	    public void logoutFromServer(ClientInfo request,
	        io.grpc.stub.StreamObserver<Status> responseObserver) {
	    	Status status = CacheUtils.serverCache.logoutFromServer(request);
	    	responseObserver.onNext(status);
	    	responseObserver.onCompleted();
	    } 	
	}
}
