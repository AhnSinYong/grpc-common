// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SearchRequest.proto

package com.levi.yoon.proto;

public final class SearchProto {
  private SearchProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_sample_SearchRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_sample_SearchRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_sample_SearchResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_sample_SearchResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023SearchRequest.proto\022\013grpc.sample\032\022Sear" +
      "chResult.proto\"q\n\rSearchRequest\022\r\n\005query" +
      "\030\001 \001(\t\022\023\n\013page_number\030\002 \001(\005\022\027\n\017result_pe" +
      "r_page\030\003 \001(\005\022#\n\006corpus\030\004 \001(\0162\023.grpc.samp" +
      "le.Corpus\"<\n\016SearchResponse\022*\n\007results\030\001" +
      " \003(\0132\031.grpc.sample.SearchResult*Z\n\006Corpu" +
      "s\022\r\n\tUNIVERSAL\020\000\022\007\n\003WEB\020\001\022\n\n\006IMAGES\020\002\022\t\n" +
      "\005LOCAL\020\003\022\010\n\004NEWS\020\004\022\014\n\010PRODUCTS\020\005\022\t\n\005VIDE" +
      "O\020\0062R\n\rSearchService\022A\n\006Search\022\032.grpc.sa" +
      "mple.SearchRequest\032\033.grpc.sample.SearchR" +
      "esponseB$\n\023com.levi.yoon.protoB\013SearchPr" +
      "otoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.levi.yoon.proto.SearchResultProto.getDescriptor(),
        });
    internal_static_grpc_sample_SearchRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpc_sample_SearchRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_sample_SearchRequest_descriptor,
        new java.lang.String[] { "Query", "PageNumber", "ResultPerPage", "Corpus", });
    internal_static_grpc_sample_SearchResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpc_sample_SearchResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_sample_SearchResponse_descriptor,
        new java.lang.String[] { "Results", });
    com.levi.yoon.proto.SearchResultProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}