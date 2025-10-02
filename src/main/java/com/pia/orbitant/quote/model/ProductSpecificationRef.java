package com.pia.orbitant.quote.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pia.orbitant.quote.model.TargetProductSchema;
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
 * Product specification reference: A ProductSpecification is a detailed description of a tangible or intangible object made available externally in the form of a ProductOffering to customers or other parties playing a party role.
 */

@Schema(name = "ProductSpecificationRef", description = "Product specification reference: A ProductSpecification is a detailed description of a tangible or intangible object made available externally in the form of a ProductOffering to customers or other parties playing a party role.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class ProductSpecificationRef implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private String href;

  private String name;

  private String version;

  private TargetProductSchema targetProductSchema;

  private String atBaseType;

  private URI atSchemaLocation;

  private String atType;

  private String atReferredType;

  public ProductSpecificationRef() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProductSpecificationRef(String id) {
    this.id = id;
  }

  public ProductSpecificationRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of a related entity.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Unique identifier of a related entity.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductSpecificationRef href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the related entity.
   * @return href
  */
  
  @Schema(name = "href", description = "Reference of the related entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ProductSpecificationRef name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the related entity.
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the related entity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductSpecificationRef version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the product specification
   * @return version
  */
  
  @Schema(name = "version", description = "Version of the product specification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ProductSpecificationRef targetProductSchema(TargetProductSchema targetProductSchema) {
    this.targetProductSchema = targetProductSchema;
    return this;
  }

  /**
   * Get targetProductSchema
   * @return targetProductSchema
  */
  @Valid 
  @Schema(name = "targetProductSchema", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetProductSchema")
  public TargetProductSchema getTargetProductSchema() {
    return targetProductSchema;
  }

  public void setTargetProductSchema(TargetProductSchema targetProductSchema) {
    this.targetProductSchema = targetProductSchema;
  }

  public ProductSpecificationRef atBaseType(String atBaseType) {
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

  public ProductSpecificationRef atSchemaLocation(URI atSchemaLocation) {
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

  public ProductSpecificationRef atType(String atType) {
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

  public ProductSpecificationRef atReferredType(String atReferredType) {
    this.atReferredType = atReferredType;
    return this;
  }

  /**
   * The actual type of the target instance when needed for disambiguation.
   * @return atReferredType
  */
  
  @Schema(name = "@referredType", description = "The actual type of the target instance when needed for disambiguation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ProductSpecificationRef productSpecificationRef = (ProductSpecificationRef) o;
    return Objects.equals(this.id, productSpecificationRef.id) &&
        Objects.equals(this.href, productSpecificationRef.href) &&
        Objects.equals(this.name, productSpecificationRef.name) &&
        Objects.equals(this.version, productSpecificationRef.version) &&
        Objects.equals(this.targetProductSchema, productSpecificationRef.targetProductSchema) &&
        Objects.equals(this.atBaseType, productSpecificationRef.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productSpecificationRef.atSchemaLocation) &&
        Objects.equals(this.atType, productSpecificationRef.atType) &&
        Objects.equals(this.atReferredType, productSpecificationRef.atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, version, targetProductSchema, atBaseType, atSchemaLocation, atType, atReferredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationRef {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    targetProductSchema: ").append(toIndentedString(targetProductSchema)).append("\n");
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

