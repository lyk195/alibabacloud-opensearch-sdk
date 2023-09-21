/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.aliyun.opensearch.sdk.generated.search;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum SearchFormat implements org.apache.thrift.TEnum {
  XML(0),
  JSON(1),
  FULLJSON(2),
  PROTOBUF(3);

  private final int value;

  private SearchFormat(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static SearchFormat findByValue(int value) { 
    switch (value) {
      case 0:
        return XML;
      case 1:
        return JSON;
      case 2:
        return FULLJSON;
      case 3:
        return PROTOBUF;
      default:
        return null;
    }
  }
}
