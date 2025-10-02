package com.pia.orbitant.quote.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Refers an appointment, such as a Customer presentation or internal meeting or site visit
 */

@Schema(name = "AppointmentRef", description = "Refers an appointment, such as a Customer presentation or internal meeting or site visit")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class AppointmentRef implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private String href;

  private String description;

  private String atBaseType;

  private URI atSchemaLocation;

  private String atType;

  private String atReferredType;

  public AppointmentRef() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AppointmentRef(String id) {
    this.id = id;
  }

  public AppointmentRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier of the referred appointment
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The identifier of the referred appointment", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AppointmentRef href(String href) {
    this.href = href;
    return this;
  }

  /**
   * The reference of the appointment
   * @return href
  */
  
  @Schema(name = "href", description = "The reference of the appointment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public AppointmentRef description(String description) {
    this.description = description;
    return this;
  }

  /**
   * An explanatory text regarding the appointment made with a party
   * @return description
  */
  
  @Schema(name = "description", description = "An explanatory text regarding the appointment made with a party", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AppointmentRef atBaseType(String atBaseType) {
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

  public AppointmentRef atSchemaLocation(URI atSchemaLocation) {
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

  public AppointmentRef atType(String atType) {
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

  public AppointmentRef atReferredType(String atReferredType) {
    this.atReferredType = atReferredType;
    return this;
  }

  /**
   * The actual type of the target instance when needed for disambiguation
   * @return atReferredType
  */
  
  @Schema(name = "@referredType", description = "The actual type of the target instance when needed for disambiguation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("@referredType")
  public String getAtReferredType() {
    return atReferredType;
  }

  public void setAtReferredType(String atReferredType) {
    this.atReferredType = atReferredType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppointmentRef appointmentRef = (AppointmentRef) o;
    return Objects.equals(this.id, appointmentRef.id) &&
        Objects.equals(this.href, appointmentRef.href) &&
        Objects.equals(this.description, appointmentRef.description) &&
        Objects.equals(this.atBaseType, appointmentRef.atBaseType) &&
        Objects.equals(this.atSchemaLocation, appointmentRef.atSchemaLocation) &&
        Objects.equals(this.atType, appointmentRef.atType) &&
        Objects.equals(this.atReferredType, appointmentRef.atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, atBaseType, atSchemaLocation, atType, atReferredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppointmentRef {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    atReferredType: ").append(toIndentedString(atReferredType)).append("\n");
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

