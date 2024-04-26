package com.example.demo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;

/**
 * Name of a license product.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-19T14:52:59.503899900+07:00[Asia/Bangkok]")
public enum ProductName {

  ADAS("adas"),

  ISA("isa");

  private String value;

  ProductName(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductName fromValue(String value) {
    for (ProductName b : ProductName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

