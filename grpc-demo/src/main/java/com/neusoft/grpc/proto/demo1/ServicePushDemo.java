// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service_push.proto

package com.neusoft.grpc.proto.demo1;

public final class ServicePushDemo {
  private ServicePushDemo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Status_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Status_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TopicInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TopicInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Message_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TopicOne_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TopicOne_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TopicTwo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TopicTwo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022service_push.proto\"\036\n\nClientInfo\022\020\n\010cl" +
      "ientId\030\001 \001(\t\"\030\n\006Status\022\016\n\006status\030\001 \001(\t\"?" +
      "\n\tTopicInfo\022\037\n\nclientInfo\030\001 \001(\0132\013.Client" +
      "Info\022\021\n\ttopicName\030\002 \001(\t\"=\n\007Message\022\021\n\tto" +
      "picName\030\001 \001(\t\022\016\n\006status\030\002 \001(\t\022\017\n\007message" +
      "\030\003 \001(\014\";\n\010TopicOne\022\017\n\007topicId\030\001 \001(\t\022\021\n\tt" +
      "opicName\030\002 \001(\t\022\013\n\003xxx\030\003 \001(\t\"M\n\010TopicTwo\022" +
      "\017\n\007topicId\030\001 \001(\t\022\021\n\ttopicName\030\002 \001(\t\022\013\n\003y" +
      "yy\030\003 \001(\005\022\020\n\010boolType\030\004 \001(\0102\272\001\n\016Subscribe" +
      "Topic\022-\n\020registerToServer\022\013.ClientInfo\032\010",
      ".Message\"\0000\001\022\'\n\016subscribeTopic\022\n.TopicIn" +
      "fo\032\007.Status\"\000\022$\n\013cancelTopic\022\n.TopicInfo" +
      "\032\007.Status\"\000\022*\n\020logoutFromServer\022\013.Client" +
      "Info\032\007.Status\"\000B1\n\034com.neusoft.grpc.prot" +
      "o.demo1B\017ServicePushDemoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_ClientInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientInfo_descriptor,
        new java.lang.String[] { "ClientId", });
    internal_static_Status_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Status_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Status_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_TopicInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_TopicInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TopicInfo_descriptor,
        new java.lang.String[] { "ClientInfo", "TopicName", });
    internal_static_Message_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Message_descriptor,
        new java.lang.String[] { "TopicName", "Status", "Message", });
    internal_static_TopicOne_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_TopicOne_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TopicOne_descriptor,
        new java.lang.String[] { "TopicId", "TopicName", "Xxx", });
    internal_static_TopicTwo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_TopicTwo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TopicTwo_descriptor,
        new java.lang.String[] { "TopicId", "TopicName", "Yyy", "BoolType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}