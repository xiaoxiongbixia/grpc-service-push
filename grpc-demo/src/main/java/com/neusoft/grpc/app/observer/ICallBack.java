package com.neusoft.grpc.app.observer;

import com.google.protobuf.ByteString;

public interface ICallBack<T> {
	public void callback(ByteString bytes);
}
