// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OrderService.proto

package net.chrisrichardson.ftgo.orderservice.grpc;

public interface CreateOrderRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:orderservice.CreateOrderRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 restaurantId = 1;</code>
   * @return The restaurantId.
   */
  long getRestaurantId();

  /**
   * <code>int64 consumerId = 2;</code>
   * @return The consumerId.
   */
  long getConsumerId();

  /**
   * <code>repeated .orderservice.LineItem lineItems = 3;</code>
   */
  java.util.List<net.chrisrichardson.ftgo.orderservice.grpc.LineItem> 
      getLineItemsList();
  /**
   * <code>repeated .orderservice.LineItem lineItems = 3;</code>
   */
  net.chrisrichardson.ftgo.orderservice.grpc.LineItem getLineItems(int index);
  /**
   * <code>repeated .orderservice.LineItem lineItems = 3;</code>
   */
  int getLineItemsCount();
  /**
   * <code>repeated .orderservice.LineItem lineItems = 3;</code>
   */
  java.util.List<? extends net.chrisrichardson.ftgo.orderservice.grpc.LineItemOrBuilder> 
      getLineItemsOrBuilderList();
  /**
   * <code>repeated .orderservice.LineItem lineItems = 3;</code>
   */
  net.chrisrichardson.ftgo.orderservice.grpc.LineItemOrBuilder getLineItemsOrBuilder(
      int index);

  /**
   * <code>.orderservice.Address deliveryAddress = 4;</code>
   * @return Whether the deliveryAddress field is set.
   */
  boolean hasDeliveryAddress();
  /**
   * <code>.orderservice.Address deliveryAddress = 4;</code>
   * @return The deliveryAddress.
   */
  net.chrisrichardson.ftgo.orderservice.grpc.Address getDeliveryAddress();
  /**
   * <code>.orderservice.Address deliveryAddress = 4;</code>
   */
  net.chrisrichardson.ftgo.orderservice.grpc.AddressOrBuilder getDeliveryAddressOrBuilder();

  /**
   * <code>string deliveryTime = 5;</code>
   * @return The deliveryTime.
   */
  java.lang.String getDeliveryTime();
  /**
   * <code>string deliveryTime = 5;</code>
   * @return The bytes for deliveryTime.
   */
  com.google.protobuf.ByteString
      getDeliveryTimeBytes();
}
