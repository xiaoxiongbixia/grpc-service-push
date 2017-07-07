package com.neusoft.grpc.app.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ForwardingClientCall;
import io.grpc.ForwardingClientCallListener;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;

public class DemoClientInteceptor implements ClientInterceptor {
	
	private static final Logger log = LoggerFactory.getLogger(DemoClientInteceptor.class);

	static final Metadata.Key<String> CUSTOM_HEADER_KEY = Metadata.Key.of("clientHeader", Metadata.ASCII_STRING_MARSHALLER);

	@Override
	public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method, CallOptions callOptions, Channel next) {
		return new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(next.newCall(method, callOptions)) {
			@Override
			public void start(Listener<RespT> responseListener, Metadata headers) {
				// 放入客户端的header
				log.info("客户端调用走入拦截器");
				headers.put(CUSTOM_HEADER_KEY, "request");
				
				super.start(new ForwardingClientCallListener.SimpleForwardingClientCallListener<RespT>(responseListener) {
					@Override
					public void onHeaders(Metadata headers) {
						// 输出服务端传递回来的header
						log.info("客户端调用完成走入拦截器，服务器返回的header信息:" + headers);
						log.info("client on onHeaders 的顺序");
						super.onHeaders(headers);
					}
					
					@Override
					public void onMessage(RespT message) {
						log.info("client on onMessage 的顺序");
						super.onMessage(message);
					}

					@Override
					public void onClose(Status status, Metadata trailers) {
						log.info("client on onClose 的顺序");
						super.onClose(status, trailers);
					}

					@Override
					public void onReady() {
						log.info("client on onReady 的顺序");
						super.onReady();
					}
				}, headers);
			}
		};
	}

}
