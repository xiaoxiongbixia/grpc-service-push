package com.neusoft.grpc.app.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.grpc.ForwardingServerCall;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;

public class DemoServerInterceptor implements ServerInterceptor {
	private static final Logger log = LoggerFactory.getLogger(DemoServerInterceptor.class);

	static final Metadata.Key<String> CUSTOM_HEADER_KEY = Metadata.Key.of("serverHeader", Metadata.ASCII_STRING_MARSHALLER);

	@Override
	public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {
		// 输出客户端传递过来的header
		log.info("服务端调用走入拦截器，收到的客户端的headers为:"+headers);

		return next.startCall(new ForwardingServerCall.SimpleForwardingServerCall<ReqT, RespT>(call) {
			@Override
			public void sendHeaders(Metadata responseHeaders) {
				log.info("服务端处理完成走入拦截器，并增加 header.");
				responseHeaders.put(CUSTOM_HEADER_KEY, "response");
				super.sendHeaders(responseHeaders);
			}
		}, headers);
	}

}
