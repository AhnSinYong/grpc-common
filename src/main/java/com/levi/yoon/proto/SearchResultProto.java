// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SearchResult.proto

package com.levi.yoon.proto;

public final class SearchResultProto {
  private SearchResultProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_sample_SearchResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_sample_SearchResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022SearchResult.proto\022\013grpc.sample\"*\n\014Sea" +
      "rchResult\022\013\n\003url\030\001 \001(\t\022\r\n\005title\030\002 \001(\tB*\n" +
      "\023com.levi.yoon.protoB\021SearchResultProtoP" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_grpc_sample_SearchResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpc_sample_SearchResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_sample_SearchResult_descriptor,
        new java.lang.String[] { "Url", "Title", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}