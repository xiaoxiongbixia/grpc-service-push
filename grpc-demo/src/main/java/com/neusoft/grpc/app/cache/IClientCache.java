package com.neusoft.grpc.app.cache;

import com.neusoft.grpc.proto.demo1.ClientInfo;
import com.neusoft.grpc.proto.demo1.Status;

import io.grpc.stub.StreamObserver;

public interface IClientCache <T>{
	
	public Status registerToServer(ClientInfo clientInfo, StreamObserver<T> observer);
	
	public boolean removeErrorObserver(String clientId);
	
	public StreamObserver<T> getObserver(String clientId);
	
	public Status logoutFromServer(ClientInfo clientInfo);
	
	public StreamObserver<T> getObserver(ClientInfo clientInfo);
	
	public void clearErrorObserver();

}
