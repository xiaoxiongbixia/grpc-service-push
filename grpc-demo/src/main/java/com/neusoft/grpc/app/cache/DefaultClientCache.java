package com.neusoft.grpc.app.cache;

import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.neusoft.grpc.proto.demo1.ClientInfo;
import com.neusoft.grpc.proto.demo1.Status;

import io.grpc.stub.StreamObserver;

public class DefaultClientCache<T> implements IClientCache<T> {
	
	private volatile ConcurrentHashMap<String, StreamObserver<T>> cache = new ConcurrentHashMap<String, StreamObserver<T>>();

	public Status registerToServer(ClientInfo clientInfo, StreamObserver<T> observer) {
		cache.put(clientInfo.getClientId(), observer);
		return null;
	}

	public Status logoutFromServer(ClientInfo clientInfo) {
		StreamObserver<T> ob = getObserver(clientInfo);
		if(null!=ob){
			ob.onCompleted();
			cache.remove(clientInfo.getClientId());
		}
		return Status.newBuilder().setStatus("OK").build();
	}

	public void clearErrorObserver() {
		Set<Entry<String, StreamObserver<T>>> set = cache.entrySet();
		for (Entry<String, StreamObserver<T>> entry : set) {
			StreamObserver<T> observer = entry.getValue();
			//暂时不知道判断
		}
	}

	@Override
	public StreamObserver<T> getObserver(ClientInfo clientInfo) {
		return getObserver(clientInfo.getClientId());
	}

	@Override
	public boolean removeErrorObserver(String clientId) {
		cache.remove(clientId);
		return true;
	}

	@Override
	public StreamObserver<T> getObserver(String clientId) {
		return cache.get(clientId);
	}

}
