package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Objects;

/**
 * Product the license has access to
 */

@Schema(name = "Product", description = "Product the license has access to")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-20T10:19:38.256272+07:00[Asia/Bangkok]")
public class Product {

  private ProductName name;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date startTime = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date endTime = null;

  public Product() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Product(ProductName name) {
    this.name = name;
  }

  public Product name(ProductName name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @NotNull @Valid
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public ProductName getName() {
    return name;
  }

  public void setName(ProductName name) {
    this.name = name;
  }

  public Product startTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
   */
  @Valid
  @Schema(name = "start_time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_time")
  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  public Product endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
   */
  @Valid
  @Schema(name = "end_time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_time")
  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.name, product.name) &&
            Objects.equals(this.startTime, product.startTime) &&
            Objects.equals(this.endTime, product.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, startTime, endTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

