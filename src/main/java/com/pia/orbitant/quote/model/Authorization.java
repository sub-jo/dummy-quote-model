package com.pia.orbitant.quote.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pia.orbitant.quote.model.RelatedParty;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * If special discount or special product offering price or specific condition need an approval for ISP sale representative it is described here.
 */

@Schema(name = "Authorization", description = "If special discount or special product offering price or specific condition need an approval for ISP sale representative it is described here.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class Authorization implements Serializable {

  private static final long serialVersionUID = 1L;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime givenDate;

  private String name;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime requestedDate;

  private String signatureRepresentation;

  private String state;

  @Valid
  private List<@Valid RelatedParty> approver;

  private String atBaseType;

  private URI atSchemaLocation;

  private String atType;

  public Authorization givenDate(OffsetDateTime givenDate) {
    this.givenDate = givenDate;
    return this;
  }

  /**
   * Date when the authorization (approved or declined) was done
   * @return givenDate
  */
  @Valid 
  @Schema(name = "givenDate", description = "Date when the authorization (approved or declined) was done", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("givenDate")
  public OffsetDateTime getGivenDate() {
    return givenDate;
  }

  public void setGivenDate(OffsetDateTime givenDate) {
    this.givenDate = givenDate;
  }

  public Authorization name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the required authorization
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the required authorization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Authorization requestedDate(OffsetDateTime requestedDate) {
    this.requestedDate = requestedDate;
    return this;
  }

  /**
   * Date when the authorization is requested for
   * @return requestedDate
  */
  @Valid 
  @Schema(name = "requestedDate", description = "Date when the authorization is requested for", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestedDate")
  public OffsetDateTime getRequestedDate() {
    return requestedDate;
  }

  public void setRequestedDate(OffsetDateTime requestedDate) {
    this.requestedDate = requestedDate;
  }

  public Authorization signatureRepresentation(String signatureRepresentation) {
    this.signatureRepresentation = signatureRepresentation;
    return this;
  }

  /**
   * To describe a digital or manual signature
   * @return signatureRepresentation
  */
  
  @Schema(name = "signatureRepresentation", description = "To describe a digital or manual signature", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("signatureRepresentation")
  public String getSignatureRepresentation() {
    return signatureRepresentation;
  }

  public void setSignatureRepresentation(String signatureRepresentation) {
    this.signatureRepresentation = signatureRepresentation;
  }

  public Authorization state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State of the authorization, such as: approved or declined
   * @return state
  */
  
  @Schema(name = "state", description = "State of the authorization, such as: approved or declined", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Authorization approver(List<@Valid RelatedParty> approver) {
    this.approver = approver;
    return this;
  }

  public Authorization addApproverItem(RelatedParty approverItem) {
    if (this.approver == null) {
      this.approver = new ArrayList<>();
    }
    this.approver.add(approverItem);
    return this;
  }

  /**
   * Get approver
   * @return approver
  */
  @Valid 
  @Schema(name = "approver", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approver")
  public List<@Valid RelatedParty> getApprover() {
    return approver;
  }

  public void setApprover(List<@Valid RelatedParty> approver) {
    this.approver = approver;
  }

  public Authorization atBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
  */
  
  @Schema(name = "@baseType", description = "When sub-classing, this defines the super-class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@baseType")
  public String getAtBaseType() {
    return atBaseType;
  }

  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }

  public Authorization atSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
  */
  @Valid 
  @Schema(name = "@schemaLocation", description = "A URI to a JSON-Schema file that defines additional attributes and relationships", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@schemaLocation")
  public URI getAtSchemaLocation() {
    return atSchemaLocation;
  }

  public void setAtSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }

  public Authorization atType(String atType) {
    this.atType = atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * @return atType
  */
  
  @Schema(name = "@type", description = "When sub-classing, this defines the sub-class entity name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@type")
  public String getAtType() {
    return atType;
  }

  public void setAtType(String atType) {
    this.atType = atType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Authorization authorization = (Authorization) o;
    return Objects.equals(this.givenDate, authorization.givenDate) &&
        Objects.equals(this.name, authorization.name) &&
        Objects.equals(this.requestedDate, authorization.requestedDate) &&
        Objects.equals(this.signatureRepresentation, authorization.signatureRepresentation) &&
        Objects.equals(this.state, authorization.state) &&
        Objects.equals(this.approver, authorization.approver) &&
        Objects.equals(this.atBaseType, authorization.atBaseType) &&
        Objects.equals(this.atSchemaLocation, authorization.atSchemaLocation) &&
        Objects.equals(this.atType, authorization.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(givenDate, name, requestedDate, signatureRepresentation, state, approver, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Authorization {\n");
    sb.append("    givenDate: ").append(toIndentedString(givenDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    requestedDate: ").append(toIndentedString(requestedDate)).append("\n");
    sb.append("    signatureRepresentation: ").append(toIndentedString(signatureRepresentation)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
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

