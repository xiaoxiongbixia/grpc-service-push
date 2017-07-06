package com.neusoft.grpc.proto.demo1;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *订阅服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: service_push.proto")
public final class SubscribeTopicGrpc {

  private SubscribeTopicGrpc() {}

  public static final String SERVICE_NAME = "SubscribeTopic";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.neusoft.grpc.proto.demo1.ClientInfo,
      com.neusoft.grpc.proto.demo1.Message> METHOD_REGISTER_TO_SERVER =
      io.grpc.MethodDescriptor.<com.neusoft.grpc.proto.demo1.ClientInfo, com.neusoft.grpc.proto.demo1.Message>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "SubscribeTopic", "registerToServer"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.neusoft.grpc.proto.demo1.ClientInfo.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.neusoft.grpc.proto.demo1.Message.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.neusoft.grpc.proto.demo1.TopicInfo,
      com.neusoft.grpc.proto.demo1.Status> METHOD_SUBSCRIBE_TOPIC =
      io.grpc.MethodDescriptor.<com.neusoft.grpc.proto.demo1.TopicInfo, com.neusoft.grpc.proto.demo1.Status>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "SubscribeTopic", "subscribeTopic"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.neusoft.grpc.proto.demo1.TopicInfo.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.neusoft.grpc.proto.demo1.Status.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.neusoft.grpc.proto.demo1.TopicInfo,
      com.neusoft.grpc.proto.demo1.Status> METHOD_CANCEL_TOPIC =
      io.grpc.MethodDescriptor.<com.neusoft.grpc.proto.demo1.TopicInfo, com.neusoft.grpc.proto.demo1.Status>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "SubscribeTopic", "cancelTopic"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.neusoft.grpc.proto.demo1.TopicInfo.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.neusoft.grpc.proto.demo1.Status.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.neusoft.grpc.proto.demo1.ClientInfo,
      com.neusoft.grpc.proto.demo1.Status> METHOD_LOGOUT_FROM_SERVER =
      io.grpc.MethodDescriptor.<com.neusoft.grpc.proto.demo1.ClientInfo, com.neusoft.grpc.proto.demo1.Status>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "SubscribeTopic", "logoutFromServer"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.neusoft.grpc.proto.demo1.ClientInfo.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.neusoft.grpc.proto.demo1.Status.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SubscribeTopicStub newStub(io.grpc.Channel channel) {
    return new SubscribeTopicStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SubscribeTopicBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SubscribeTopicBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SubscribeTopicFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SubscribeTopicFutureStub(channel);
  }

  /**
   * <pre>
   *订阅服务
   * </pre>
   */
  public static abstract class SubscribeTopicImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *注册到基于protoBuf格式的推送服务
     * </pre>
     */
    public void registerToServer(com.neusoft.grpc.proto.demo1.ClientInfo request,
        io.grpc.stub.StreamObserver<com.neusoft.grpc.proto.demo1.Message> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_TO_SERVER, responseObserver);
    }

    /**
     * <pre>
     *订阅某些主题,阻塞调用
     * </pre>
     */
    public void subscribeTopic(com.neusoft.grpc.proto.demo1.TopicInfo request,
        io.grpc.stub.StreamObserver<com.neusoft.grpc.proto.demo1.Status> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SUBSCRIBE_TOPIC, responseObserver);
    }

    /**
     * <pre>
     *取消订阅某些主题,阻塞调用
     * </pre>
     */
    public void cancelTopic(com.neusoft.grpc.proto.demo1.TopicInfo request,
        io.grpc.stub.StreamObserver<com.neusoft.grpc.proto.demo1.Status> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CANCEL_TOPIC, responseObserver);
    }

    /**
     * <pre>
     *从服务注销,阻塞调用
     * </pre>
     */
    public void logoutFromServer(com.neusoft.grpc.proto.demo1.ClientInfo request,
        io.grpc.stub.StreamObserver<com.neusoft.grpc.proto.demo1.Status> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOGOUT_FROM_SERVER, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_REGISTER_TO_SERVER,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.neusoft.grpc.proto.demo1.ClientInfo,
                com.neusoft.grpc.proto.demo1.Message>(
                  this, METHODID_REGISTER_TO_SERVER)))
          .addMethod(
            METHOD_SUBSCRIBE_TOPIC,
            asyncUnaryCall(
              new MethodHandlers<
                com.neusoft.grpc.proto.demo1.TopicInfo,
                com.neusoft.grpc.proto.demo1.Status>(
                  this, METHODID_SUBSCRIBE_TOPIC)))
          .addMethod(
            METHOD_CANCEL_TOPIC,
            asyncUnaryCall(
              new MethodHandlers<
                com.neusoft.grpc.proto.demo1.TopicInfo,
                com.neusoft.grpc.proto.demo1.Status>(
                  this, METHODID_CANCEL_TOPIC)))
          .addMethod(
            METHOD_LOGOUT_FROM_SERVER,
            asyncUnaryCall(
              new MethodHandlers<
                com.neusoft.grpc.proto.demo1.ClientInfo,
                com.neusoft.grpc.proto.demo1.Status>(
                  this, METHODID_LOGOUT_FROM_SERVER)))
          .build();
    }
  }

  /**
   * <pre>
   *订阅服务
   * </pre>
   */
  public static final class SubscribeTopicStub extends io.grpc.stub.AbstractStub<SubscribeTopicStub> {
    private SubscribeTopicStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubscribeTopicStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubscribeTopicStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubscribeTopicStub(channel, callOptions);
    }

    /**
     * <pre>
     *注册到基于protoBuf格式的推送服务
     * </pre>
     */
    public void registerToServer(com.neusoft.grpc.proto.demo1.ClientInfo request,
        io.grpc.stub.StreamObserver<com.neusoft.grpc.proto.demo1.Message> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_REGISTER_TO_SERVER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *订阅某些主题,阻塞调用
     * </pre>
     */
    public void subscribeTopic(com.neusoft.grpc.proto.demo1.TopicInfo request,
        io.grpc.stub.StreamObserver<com.neusoft.grpc.proto.demo1.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SUBSCRIBE_TOPIC, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *取消订阅某些主题,阻塞调用
     * </pre>
     */
    public void cancelTopic(com.neusoft.grpc.proto.demo1.TopicInfo request,
        io.grpc.stub.StreamObserver<com.neusoft.grpc.proto.demo1.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CANCEL_TOPIC, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *从服务注销,阻塞调用
     * </pre>
     */
    public void logoutFromServer(com.neusoft.grpc.proto.demo1.ClientInfo request,
        io.grpc.stub.StreamObserver<com.neusoft.grpc.proto.demo1.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOGOUT_FROM_SERVER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *订阅服务
   * </pre>
   */
  public static final class SubscribeTopicBlockingStub extends io.grpc.stub.AbstractStub<SubscribeTopicBlockingStub> {
    private SubscribeTopicBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubscribeTopicBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubscribeTopicBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubscribeTopicBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *注册到基于protoBuf格式的推送服务
     * </pre>
     */
    public java.util.Iterator<com.neusoft.grpc.proto.demo1.Message> registerToServer(
        com.neusoft.grpc.proto.demo1.ClientInfo request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_REGISTER_TO_SERVER, getCallOptions(), request);
    }

    /**
     * <pre>
     *订阅某些主题,阻塞调用
     * </pre>
     */
    public com.neusoft.grpc.proto.demo1.Status subscribeTopic(com.neusoft.grpc.proto.demo1.TopicInfo request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SUBSCRIBE_TOPIC, getCallOptions(), request);
    }

    /**
     * <pre>
     *取消订阅某些主题,阻塞调用
     * </pre>
     */
    public com.neusoft.grpc.proto.demo1.Status cancelTopic(com.neusoft.grpc.proto.demo1.TopicInfo request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CANCEL_TOPIC, getCallOptions(), request);
    }

    /**
     * <pre>
     *从服务注销,阻塞调用
     * </pre>
     */
    public com.neusoft.grpc.proto.demo1.Status logoutFromServer(com.neusoft.grpc.proto.demo1.ClientInfo request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOGOUT_FROM_SERVER, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *订阅服务
   * </pre>
   */
  public static final class SubscribeTopicFutureStub extends io.grpc.stub.AbstractStub<SubscribeTopicFutureStub> {
    private SubscribeTopicFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubscribeTopicFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubscribeTopicFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubscribeTopicFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *订阅某些主题,阻塞调用
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neusoft.grpc.proto.demo1.Status> subscribeTopic(
        com.neusoft.grpc.proto.demo1.TopicInfo request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SUBSCRIBE_TOPIC, getCallOptions()), request);
    }

    /**
     * <pre>
     *取消订阅某些主题,阻塞调用
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neusoft.grpc.proto.demo1.Status> cancelTopic(
        com.neusoft.grpc.proto.demo1.TopicInfo request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CANCEL_TOPIC, getCallOptions()), request);
    }

    /**
     * <pre>
     *从服务注销,阻塞调用
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.neusoft.grpc.proto.demo1.Status> logoutFromServer(
        com.neusoft.grpc.proto.demo1.ClientInfo request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOGOUT_FROM_SERVER, getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_TO_SERVER = 0;
  private static final int METHODID_SUBSCRIBE_TOPIC = 1;
  private static final int METHODID_CANCEL_TOPIC = 2;
  private static final int METHODID_LOGOUT_FROM_SERVER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SubscribeTopicImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SubscribeTopicImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_TO_SERVER:
          serviceImpl.registerToServer((com.neusoft.grpc.proto.demo1.ClientInfo) request,
              (io.grpc.stub.StreamObserver<com.neusoft.grpc.proto.demo1.Message>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_TOPIC:
          serviceImpl.subscribeTopic((com.neusoft.grpc.proto.demo1.TopicInfo) request,
              (io.grpc.stub.StreamObserver<com.neusoft.grpc.proto.demo1.Status>) responseObserver);
          break;
        case METHODID_CANCEL_TOPIC:
          serviceImpl.cancelTopic((com.neusoft.grpc.proto.demo1.TopicInfo) request,
              (io.grpc.stub.StreamObserver<com.neusoft.grpc.proto.demo1.Status>) responseObserver);
          break;
        case METHODID_LOGOUT_FROM_SERVER:
          serviceImpl.logoutFromServer((com.neusoft.grpc.proto.demo1.ClientInfo) request,
              (io.grpc.stub.StreamObserver<com.neusoft.grpc.proto.demo1.Status>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class SubscribeTopicDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.neusoft.grpc.proto.demo1.ServicePushDemo.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SubscribeTopicGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SubscribeTopicDescriptorSupplier())
              .addMethod(METHOD_REGISTER_TO_SERVER)
              .addMethod(METHOD_SUBSCRIBE_TOPIC)
              .addMethod(METHOD_CANCEL_TOPIC)
              .addMethod(METHOD_LOGOUT_FROM_SERVER)
              .build();
        }
      }
    }
    return result;
  }
}
