// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SearchRequest.proto

package com.levi.yoon.proto;

public interface SearchResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.sample.SearchResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .grpc.sample.SearchResult results = 1;</code>
   */
  java.util.List<com.levi.yoon.proto.SearchResult> 
      getResultsList();
  /**
   * <code>repeated .grpc.sample.SearchResult results = 1;</code>
   */
  com.levi.yoon.proto.SearchResult getResults(int index);
  /**
   * <code>repeated .grpc.sample.SearchResult results = 1;</code>
   */
  int getResultsCount();
  /**
   * <code>repeated .grpc.sample.SearchResult results = 1;</code>
   */
  java.util.List<? extends com.levi.yoon.proto.SearchResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <code>repeated .grpc.sample.SearchResult results = 1;</code>
   */
  com.levi.yoon.proto.SearchResultOrBuilder getResultsOrBuilder(
      int index);
}