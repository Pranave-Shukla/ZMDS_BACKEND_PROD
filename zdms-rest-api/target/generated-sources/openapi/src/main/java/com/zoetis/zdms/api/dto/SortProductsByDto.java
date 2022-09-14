package com.zoetis.zdms.api.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets SortProductsBy
 */
public enum SortProductsByDto {
  
  IS_VISIBLE("IS_VISIBLE"),
  
  AVAILABILITY("AVAILABILITY"),
  
  PRODUCT_ID("PRODUCT_ID"),
  
  DESCRIPTION("DESCRIPTION"),
  
  MINIMUM_ORDER_QUANTITY("MINIMUM_ORDER_QUANTITY"),
  
  MAXIMUM_ORDER_QUANTITY("MAXIMUM_ORDER_QUANTITY"),
  
  HAS_MEDIA("HAS_MEDIA"),
  
  SOURCE("SOURCE");

  private String value;

  SortProductsByDto(String value) {
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
  public static SortProductsByDto fromValue(String value) {
    for (SortProductsByDto b : SortProductsByDto.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

