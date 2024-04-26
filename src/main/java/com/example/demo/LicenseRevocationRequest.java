package com.example.demo;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * License properties for update requests.
 */


@Schema(name = "licenseRevocationRequest", description = "License properties for update requests.")
@JsonTypeName("licenseRevocationRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-20T10:24:51.320643700+07:00[Asia/Bangkok]")
public class LicenseRevocationRequest {

  private Boolean revoked = null;

  @Valid
  private List<@Valid Product> products;

  private String publicKey = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date diagnosticExpirationTime = null;

  private String nonce;

  public LicenseRevocationRequest revoked(Boolean revoked) {
    this.revoked = revoked;
    return this;
  }

  /**
   * New revocation status.
   * @return revoked
   */

  @Schema(name = "revoked", description = "New revocation status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("revoked")
  public Boolean getRevoked() {
    return revoked;
  }

  public void setRevoked(Boolean revoked) {
    this.revoked = revoked;
  }

  public LicenseRevocationRequest products(List<@Valid Product> products) {
    this.products = products;
    return this;
  }

  public LicenseRevocationRequest addProductsItem(Product productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

  /**
   * New products state.
   * @return products
   */
  @Valid
  @Schema(name = "products", description = "New products state.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("products")
  public List<@Valid Product> getProducts() {
    return products;
  }

  public void setProducts(List<@Valid Product> products) {
    this.products = products;
  }

  public LicenseRevocationRequest publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

  /**
   * DEPRECATED - new public P-384 key encoded in uncompressed form (see SEC1v2, section 2.3.3)
   * @return publicKey
   */

  @Schema(name = "public_key", description = "DEPRECATED - new public P-384 key encoded in uncompressed form (see SEC1v2, section 2.3.3)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("public_key")
  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  public LicenseRevocationRequest diagnosticExpirationTime(Date diagnosticExpirationTime) {
    this.diagnosticExpirationTime = diagnosticExpirationTime;
    return this;
  }

  /**
   * Diagnostic Expiration Time.
   * @return diagnosticExpirationTime
   */
  @Valid
  @Schema(name = "diagnostic_expiration_time", description = "Diagnostic Expiration Time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("diagnostic_expiration_time")
  public Date getDiagnosticExpirationTime() {
    return diagnosticExpirationTime;
  }

  public void setDiagnosticExpirationTime(Date diagnosticExpirationTime) {
    this.diagnosticExpirationTime = diagnosticExpirationTime;
  }

  public LicenseRevocationRequest nonce(String nonce) {
    this.nonce = nonce;
    return this;
  }

  /**
   * Random bytes used to sign the response.
   * @return nonce
   */

  @Schema(name = "nonce", description = "Random bytes used to sign the response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nonce")
  public String getNonce() {
    return nonce;
  }

  public void setNonce(String nonce) {
    this.nonce = nonce;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseRevocationRequest licenseRevocationRequest = (LicenseRevocationRequest) o;
    return Objects.equals(this.revoked, licenseRevocationRequest.revoked) &&
            Objects.equals(this.products, licenseRevocationRequest.products) &&
            Objects.equals(this.publicKey, licenseRevocationRequest.publicKey) &&
            Objects.equals(this.diagnosticExpirationTime, licenseRevocationRequest.diagnosticExpirationTime) &&
            Objects.equals(this.nonce, licenseRevocationRequest.nonce);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revoked, products, publicKey, diagnosticExpirationTime, nonce);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseRevocationRequest {\n");
    sb.append("    revoked: ").append(toIndentedString(revoked)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    diagnosticExpirationTime: ").append(toIndentedString(diagnosticExpirationTime)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
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

