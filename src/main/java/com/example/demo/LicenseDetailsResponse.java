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
 * License details for a given license ID.
 */

/**
 * License details for a given license ID.
 */

@Schema(name = "licenseDetailsResponse", description = "License details for a given license ID.")
@JsonTypeName("licenseDetailsResponse")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-20T10:24:51.320643700+07:00[Asia/Bangkok]")
public class LicenseDetailsResponse {

  private String id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date creationTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date activationTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date expirationTime;

  private Boolean revoked;

  private String publicKey;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date diagnosticExpirationTime = null;

  private String ancestor = null;

  private String signature;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date lastConnectionTime = null;

  private String fleetId;

  private String clientId;

  @Valid
  private List<@Valid Product> products;

  public LicenseDetailsResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * License identifier.
   * @return id
   */

  @Schema(name = "id", description = "License identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LicenseDetailsResponse creationTime(Date creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Creation time of the license.
   * @return creationTime
   */
  @Valid
  @Schema(name = "creation_time", description = "Creation time of the license.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creation_time")
  public Date getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }

  public LicenseDetailsResponse activationTime(Date activationTime) {
    this.activationTime = activationTime;
    return this;
  }

  /**
   * Activation time of the license. In case of a transferred license, it corresponds to the first ancestor's activation time.
   * @return activationTime
   */
  @Valid
  @Schema(name = "activation_time", description = "Activation time of the license. In case of a transferred license, it corresponds to the first ancestor's activation time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activation_time")
  public Date getActivationTime() {
    return activationTime;
  }

  public void setActivationTime(Date activationTime) {
    this.activationTime = activationTime;
  }

  public LicenseDetailsResponse expirationTime(Date expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  /**
   * Expiration time of the license.
   * @return expirationTime
   */
  @Valid
  @Schema(name = "expiration_time", description = "Expiration time of the license.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expiration_time")
  public Date getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(Date expirationTime) {
    this.expirationTime = expirationTime;
  }

  public LicenseDetailsResponse revoked(Boolean revoked) {
    this.revoked = revoked;
    return this;
  }

  /**
   * Revoked status of the license.
   * @return revoked
   */

  @Schema(name = "revoked", description = "Revoked status of the license.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("revoked")
  public Boolean getRevoked() {
    return revoked;
  }

  public void setRevoked(Boolean revoked) {
    this.revoked = revoked;
  }

  public LicenseDetailsResponse publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

  /**
   * Public P-384 key encoded in uncompressed form (see SEC1v2, section 2.3.3).
   * @return publicKey
   */

  @Schema(name = "public_key", description = "Public P-384 key encoded in uncompressed form (see SEC1v2, section 2.3.3).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("public_key")
  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  public LicenseDetailsResponse diagnosticExpirationTime(Date diagnosticExpirationTime) {
    this.diagnosticExpirationTime = diagnosticExpirationTime;
    return this;
  }

  /**
   * Diagnostic expiration time of the license.
   * @return diagnosticExpirationTime
   */
  @Valid
  @Schema(name = "diagnostic_expiration_time", description = "Diagnostic expiration time of the license.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("diagnostic_expiration_time")
  public Date getDiagnosticExpirationTime() {
    return diagnosticExpirationTime;
  }

  public void setDiagnosticExpirationTime(Date diagnosticExpirationTime) {
    this.diagnosticExpirationTime = diagnosticExpirationTime;
  }

  public LicenseDetailsResponse ancestor(String ancestor) {
    this.ancestor = ancestor;
    return this;
  }

  /**
   * Ancestor identifier of the license.
   * @return ancestor
   */

  @Schema(name = "ancestor", description = "Ancestor identifier of the license.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ancestor")
  public String getAncestor() {
    return ancestor;
  }

  public void setAncestor(String ancestor) {
    this.ancestor = ancestor;
  }

  public LicenseDetailsResponse signature(String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * If nonce specified in request, ECDSA P-384 signature of SHA384(id|nonce).
   * @return signature
   */

  @Schema(name = "signature", description = "If nonce specified in request, ECDSA P-384 signature of SHA384(id|nonce).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("signature")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public LicenseDetailsResponse lastConnectionTime(Date lastConnectionTime) {
    this.lastConnectionTime = lastConnectionTime;
    return this;
  }

  /**
   * Last connection time for the license.
   * @return lastConnectionTime
   */
  @Valid
  @Schema(name = "last_connection_time", description = "Last connection time for the license.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_connection_time")
  public Date getLastConnectionTime() {
    return lastConnectionTime;
  }

  public void setLastConnectionTime(Date lastConnectionTime) {
    this.lastConnectionTime = lastConnectionTime;
  }

  public LicenseDetailsResponse fleetId(String fleetId) {
    this.fleetId = fleetId;
    return this;
  }

  /**
   * Fleet identifier of the license.
   * @return fleetId
   */

  @Schema(name = "fleet_id", description = "Fleet identifier of the license.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fleet_id")
  public String getFleetId() {
    return fleetId;
  }

  public void setFleetId(String fleetId) {
    this.fleetId = fleetId;
  }

  public LicenseDetailsResponse clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Client identifier of the license.
   * @return clientId
   */

  @Schema(name = "client_id", description = "Client identifier of the license.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("client_id")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public LicenseDetailsResponse products(List<@Valid Product> products) {
    this.products = products;
    return this;
  }

  public LicenseDetailsResponse addProductsItem(Product productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

  /**
   * Products associated to the license.
   * @return products
   */
  @Valid
  @Schema(name = "products", description = "Products associated to the license.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("products")
  public List<@Valid Product> getProducts() {
    return products;
  }

  public void setProducts(List<@Valid Product> products) {
    this.products = products;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseDetailsResponse licenseDetailsResponse = (LicenseDetailsResponse) o;
    return Objects.equals(this.id, licenseDetailsResponse.id) &&
            Objects.equals(this.creationTime, licenseDetailsResponse.creationTime) &&
            Objects.equals(this.activationTime, licenseDetailsResponse.activationTime) &&
            Objects.equals(this.expirationTime, licenseDetailsResponse.expirationTime) &&
            Objects.equals(this.revoked, licenseDetailsResponse.revoked) &&
            Objects.equals(this.publicKey, licenseDetailsResponse.publicKey) &&
            Objects.equals(this.diagnosticExpirationTime, licenseDetailsResponse.diagnosticExpirationTime) &&
            Objects.equals(this.ancestor, licenseDetailsResponse.ancestor) &&
            Objects.equals(this.signature, licenseDetailsResponse.signature) &&
            Objects.equals(this.lastConnectionTime, licenseDetailsResponse.lastConnectionTime) &&
            Objects.equals(this.fleetId, licenseDetailsResponse.fleetId) &&
            Objects.equals(this.clientId, licenseDetailsResponse.clientId) &&
            Objects.equals(this.products, licenseDetailsResponse.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creationTime, activationTime, expirationTime, revoked, publicKey, diagnosticExpirationTime, ancestor, signature, lastConnectionTime, fleetId, clientId, products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseDetailsResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    activationTime: ").append(toIndentedString(activationTime)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    revoked: ").append(toIndentedString(revoked)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    diagnosticExpirationTime: ").append(toIndentedString(diagnosticExpirationTime)).append("\n");
    sb.append("    ancestor: ").append(toIndentedString(ancestor)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    lastConnectionTime: ").append(toIndentedString(lastConnectionTime)).append("\n");
    sb.append("    fleetId: ").append(toIndentedString(fleetId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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

