package com.pia.orbitant.quote.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pia.orbitant.quote.model.Price;
import com.pia.orbitant.quote.model.PriceAlteration;
import com.pia.orbitant.quote.model.ProductOfferingPriceRef;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Description of price and discount awarded
 */

@Schema(name = "QuotePrice", description = "Description of price and discount awarded")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class QuotePrice implements Serializable {

  private static final long serialVersionUID = 1L;

  private String description;

  private String name;

  private String priceType;

  private String recurringChargePeriod;

  private String unitOfMeasure;

  private Price price;

  @Valid
  private List<@Valid PriceAlteration> priceAlteration;

  private ProductOfferingPriceRef productOfferingPrice;

  private String atBaseType;

  private URI atSchemaLocation;

  private String atType;

  public QuotePrice description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the quote/quote item price
   * @return description
  */
  
  @Schema(name = "description", description = "Description of the quote/quote item price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public QuotePrice name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the quote /quote item price
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the quote /quote item price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public QuotePrice priceType(String priceType) {
    this.priceType = priceType;
    return this;
  }

  /**
   * indicate if the price is for recurrent or no-recurrent charge
   * @return priceType
  */
  
  @Schema(name = "priceType", description = "indicate if the price is for recurrent or no-recurrent charge", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priceType")
  public String getPriceType() {
    return priceType;
  }

  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  public QuotePrice recurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
    return this;
  }

  /**
   * Used for recurring charge to indicate period (month, week, etc..)
   * @return recurringChargePeriod
  */
  
  @Schema(name = "recurringChargePeriod", description = "Used for recurring charge to indicate period (month, week, etc..)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recurringChargePeriod")
  public String getRecurringChargePeriod() {
    return recurringChargePeriod;
  }

  public void setRecurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
  }

  public QuotePrice unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  /**
   * Unit of Measure if price depending on it (Gb, SMS volume, etc..)
   * @return unitOfMeasure
  */
  
  @Schema(name = "unitOfMeasure", description = "Unit of Measure if price depending on it (Gb, SMS volume, etc..)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unitOfMeasure")
  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public QuotePrice price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @Valid 
  @Schema(name = "price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public QuotePrice priceAlteration(List<@Valid PriceAlteration> priceAlteration) {
    this.priceAlteration = priceAlteration;
    return this;
  }

  public QuotePrice addPriceAlterationItem(PriceAlteration priceAlterationItem) {
    if (this.priceAlteration == null) {
      this.priceAlteration = new ArrayList<>();
    }
    this.priceAlteration.add(priceAlterationItem);
    return this;
  }

  /**
   * Get priceAlteration
   * @return priceAlteration
  */
  @Valid 
  @Schema(name = "priceAlteration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priceAlteration")
  public List<@Valid PriceAlteration> getPriceAlteration() {
    return priceAlteration;
  }

  public void setPriceAlteration(List<@Valid PriceAlteration> priceAlteration) {
    this.priceAlteration = priceAlteration;
  }

  public QuotePrice productOfferingPrice(ProductOfferingPriceRef productOfferingPrice) {
    this.productOfferingPrice = productOfferingPrice;
    return this;
  }

  /**
   * Get productOfferingPrice
   * @return productOfferingPrice
  */
  @Valid 
  @Schema(name = "productOfferingPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productOfferingPrice")
  public ProductOfferingPriceRef getProductOfferingPrice() {
    return productOfferingPrice;
  }

  public void setProductOfferingPrice(ProductOfferingPriceRef productOfferingPrice) {
    this.productOfferingPrice = productOfferingPrice;
  }

  public QuotePrice atBaseType(String atBaseType) {
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

  public QuotePrice atSchemaLocation(URI atSchemaLocation) {
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

  public QuotePrice atType(String atType) {
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
    QuotePrice quotePrice = (QuotePrice) o;
    return Objects.equals(this.description, quotePrice.description) &&
        Objects.equals(this.name, quotePrice.name) &&
        Objects.equals(this.priceType, quotePrice.priceType) &&
        Objects.equals(this.recurringChargePeriod, quotePrice.recurringChargePeriod) &&
        Objects.equals(this.unitOfMeasure, quotePrice.unitOfMeasure) &&
        Objects.equals(this.price, quotePrice.price) &&
        Objects.equals(this.priceAlteration, quotePrice.priceAlteration) &&
        Objects.equals(this.productOfferingPrice, quotePrice.productOfferingPrice) &&
        Objects.equals(this.atBaseType, quotePrice.atBaseType) &&
        Objects.equals(this.atSchemaLocation, quotePrice.atSchemaLocation) &&
        Objects.equals(this.atType, quotePrice.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, priceType, recurringChargePeriod, unitOfMeasure, price, priceAlteration, productOfferingPrice, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuotePrice {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    recurringChargePeriod: ").append(toIndentedString(recurringChargePeriod)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceAlteration: ").append(toIndentedString(priceAlteration)).append("\n");
    sb.append("    productOfferingPrice: ").append(toIndentedString(productOfferingPrice)).append("\n");
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

