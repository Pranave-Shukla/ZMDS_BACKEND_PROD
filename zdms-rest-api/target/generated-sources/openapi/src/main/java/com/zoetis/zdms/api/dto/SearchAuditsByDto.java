package com.zoetis.zdms.api.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.zoetis.zdms.api.dto.SearchAuditsByFieldDto;
import com.zoetis.zdms.api.dto.SearchByOperationDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;

/**
 * SearchAuditsByDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-22T09:15:08.643330200-04:00[America/New_York]")
public class SearchAuditsByDto   {
  @JsonProperty("field")
  private SearchAuditsByFieldDto field;

  @JsonProperty("operation")
  private SearchByOperationDto operation;

  @JsonProperty("values")
  @Valid
  private List<String> values = null;

  public SearchAuditsByDto field(SearchAuditsByFieldDto field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchAuditsByFieldDto getField() {
    return field;
  }

  public void setField(SearchAuditsByFieldDto field) {
    this.field = field;
  }

  public SearchAuditsByDto operation(SearchByOperationDto operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchByOperationDto getOperation() {
    return operation;
  }

  public void setOperation(SearchByOperationDto operation) {
    this.operation = operation;
  }

  public SearchAuditsByDto values(List<String> values) {
    this.values = values;
    return this;
  }

  public SearchAuditsByDto addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")


  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchAuditsByDto searchAuditsBy = (SearchAuditsByDto) o;
    return Objects.equals(this.field, searchAuditsBy.field) &&
        Objects.equals(this.operation, searchAuditsBy.operation) &&
        Objects.equals(this.values, searchAuditsBy.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operation, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchAuditsByDto {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

