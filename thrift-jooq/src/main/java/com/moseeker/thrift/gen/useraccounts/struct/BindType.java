/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.moseeker.thrift.gen.useraccounts.struct;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum BindType implements org.apache.thrift.TEnum {
  WECHAT(0),
  BAIDU(1);

  private final int value;

  private BindType(int value) {
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
  public static BindType findByValue(int value) { 
    switch (value) {
      case 0:
        return WECHAT;
      case 1:
        return BAIDU;
      default:
        return null;
    }
  }
}
