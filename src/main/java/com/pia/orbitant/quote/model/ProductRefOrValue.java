package com.pia.orbitant.quote.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.pia.orbitant.quote.model.AgreementItemRef;
import com.pia.orbitant.quote.model.BillingAccountRef;
import com.pia.orbitant.quote.model.Characteristic;
import com.pia.orbitant.quote.model.ProductOfferingRef;
import com.pia.orbitant.quote.model.ProductPrice;
import com.pia.orbitant.quote.model.ProductRelationship;
import com.pia.orbitant.quote.model.ProductSpecificationRef;
import com.pia.orbitant.quote.model.ProductStatusType;
import com.pia.orbitant.quote.model.ProductTerm;
import com.pia.orbitant.quote.model.RelatedParty;
import com.pia.orbitant.quote.model.RelatedPlaceRefOrValue;
import com.pia.orbitant.quote.model.RelatedProductOrderItem;
import com.pia.orbitant.quote.model.ResourceRef;
import com.pia.orbitant.quote.model.ServiceRef;
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
 * A product to be created defined by value or existing defined by reference. The polymorphic attributes @type, @schemaLocation &amp; @referredType are related to the product entity and not the RelatedProductRefOrValue class itself
 */

@Schema(name = "ProductRefOrValue", description = "A product to be created defined by value or existing defined by reference. The polymorphic attributes @type, @schemaLocation & @referredType are related to the product entity and not the RelatedProductRefOrValue class itself")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class ProductRefOrValue implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private String href;

  private String description;

  private Boolean isBundle;

  private Boolean isCustomerVisible;

  private String name;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime orderDate;

  private String productSerialNumber;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime terminationDate;

  @Valid
  private List<@Valid AgreementItemRef> agreement;

  private BillingAccountRef billingAccount;

  @Valid
  private List<@Valid RelatedPlaceRefOrValue> place;

  @Valid
  private List<@Valid ProductRefOrValue> product;

  @Valid
  private List<@Valid Characteristic> productCharacteristic;

  private ProductOfferingRef productOffering;

  @Valid
  private List<@Valid RelatedProductOrderItem> productOrderItem;

  @Valid
  private List<@Valid ProductPrice> productPrice;

  @Valid
  private List<@Valid ProductRelationship> productRelationship;

  private ProductSpecificationRef productSpecification;

  @Valid
  private List<@Valid ProductTerm> productTerm;

  @Valid
  private List<@Valid ResourceRef> realizingResource;

  @Valid
  private List<@Valid ServiceRef> realizingService;

  @Valid
  private List<@Valid RelatedParty> relatedParty;

  private ProductStatusType status;

  private String atBaseType;

  private URI atSchemaLocation;

  private String atType;

  private String atReferredType;

  public ProductRefOrValue id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the product
   * @return id
  */
  
  @Schema(name = "id", description = "Unique identifier of the product", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductRefOrValue href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the product
   * @return href
  */
  
  @Schema(name = "href", description = "Reference of the product", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ProductRefOrValue description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Is the description of the product. It could be copied from the description of the Product Offering.
   * @return description
  */
  
  @Schema(name = "description", description = "Is the description of the product. It could be copied from the description of the Product Offering.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductRefOrValue isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  /**
   * If true, the product is a ProductBundle which is an instantiation of a BundledProductOffering. If false, the product is a ProductComponent which is an instantiation of a SimpleProductOffering.
   * @return isBundle
  */
  
  @Schema(name = "isBundle", description = "If true, the product is a ProductBundle which is an instantiation of a BundledProductOffering. If false, the product is a ProductComponent which is an instantiation of a SimpleProductOffering.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isBundle")
  public Boolean getIsBundle() {
    return isBundle;
  }

  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  public ProductRefOrValue isCustomerVisible(Boolean isCustomerVisible) {
    this.isCustomerVisible = isCustomerVisible;
    return this;
  }

  /**
   * If true, the product is visible by the customer.
   * @return isCustomerVisible
  */
  
  @Schema(name = "isCustomerVisible", description = "If true, the product is visible by the customer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isCustomerVisible")
  public Boolean getIsCustomerVisible() {
    return isCustomerVisible;
  }

  public void setIsCustomerVisible(Boolean isCustomerVisible) {
    this.isCustomerVisible = isCustomerVisible;
  }

  public ProductRefOrValue name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the product. It could be the same as the name of the product offering
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the product. It could be the same as the name of the product offering", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductRefOrValue orderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
    return this;
  }

  /**
   * Is the date when the product was ordered
   * @return orderDate
  */
  @Valid 
  @Schema(name = "orderDate", description = "Is the date when the product was ordered", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderDate")
  public OffsetDateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
  }

  public ProductRefOrValue productSerialNumber(String productSerialNumber) {
    this.productSerialNumber = productSerialNumber;
    return this;
  }

  /**
   * Is the serial number for the product. This is typically applicable to tangible products e.g. Broadband Router.
   * @return productSerialNumber
  */
  
  @Schema(name = "productSerialNumber", description = "Is the serial number for the product. This is typically applicable to tangible products e.g. Broadband Router.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productSerialNumber")
  public String getProductSerialNumber() {
    return productSerialNumber;
  }

  public void setProductSerialNumber(String productSerialNumber) {
    this.productSerialNumber = productSerialNumber;
  }

  public ProductRefOrValue startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Is the date from which the product starts
   * @return startDate
  */
  @Valid 
  @Schema(name = "startDate", description = "Is the date from which the product starts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public ProductRefOrValue terminationDate(OffsetDateTime terminationDate) {
    this.terminationDate = terminationDate;
    return this;
  }

  /**
   * Is the date when the product was terminated
   * @return terminationDate
  */
  @Valid 
  @Schema(name = "terminationDate", description = "Is the date when the product was terminated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("terminationDate")
  public OffsetDateTime getTerminationDate() {
    return terminationDate;
  }

  public void setTerminationDate(OffsetDateTime terminationDate) {
    this.terminationDate = terminationDate;
  }

  public ProductRefOrValue agreement(List<@Valid AgreementItemRef> agreement) {
    this.agreement = agreement;
    return this;
  }

  public ProductRefOrValue addAgreementItem(AgreementItemRef agreementItem) {
    if (this.agreement == null) {
      this.agreement = new ArrayList<>();
    }
    this.agreement.add(agreementItem);
    return this;
  }

  /**
   * Get agreement
   * @return agreement
  */
  @Valid 
  @Schema(name = "agreement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("agreement")
  public List<@Valid AgreementItemRef> getAgreement() {
    return agreement;
  }

  public void setAgreement(List<@Valid AgreementItemRef> agreement) {
    this.agreement = agreement;
  }

  public ProductRefOrValue billingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

  /**
   * Get billingAccount
   * @return billingAccount
  */
  @Valid 
  @Schema(name = "billingAccount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billingAccount")
  public BillingAccountRef getBillingAccount() {
    return billingAccount;
  }

  public void setBillingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
  }

  public ProductRefOrValue place(List<@Valid RelatedPlaceRefOrValue> place) {
    this.place = place;
    return this;
  }

  public ProductRefOrValue addPlaceItem(RelatedPlaceRefOrValue placeItem) {
    if (this.place == null) {
      this.place = new ArrayList<>();
    }
    this.place.add(placeItem);
    return this;
  }

  /**
   * Get place
   * @return place
  */
  @Valid 
  @Schema(name = "place", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("place")
  public List<@Valid RelatedPlaceRefOrValue> getPlace() {
    return place;
  }

  public void setPlace(List<@Valid RelatedPlaceRefOrValue> place) {
    this.place = place;
  }

  public ProductRefOrValue product(List<@Valid ProductRefOrValue> product) {
    this.product = product;
    return this;
  }

  public ProductRefOrValue addProductItem(ProductRefOrValue productItem) {
    if (this.product == null) {
      this.product = new ArrayList<>();
    }
    this.product.add(productItem);
    return this;
  }

  /**
   * Get product
   * @return product
  */
  @Valid 
  @Schema(name = "product", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product")
  public List<@Valid ProductRefOrValue> getProduct() {
    return product;
  }

  public void setProduct(List<@Valid ProductRefOrValue> product) {
    this.product = product;
  }

  public ProductRefOrValue productCharacteristic(List<@Valid Characteristic> productCharacteristic) {
    this.productCharacteristic = productCharacteristic;
    return this;
  }

  public ProductRefOrValue addProductCharacteristicItem(Characteristic productCharacteristicItem) {
    if (this.productCharacteristic == null) {
      this.productCharacteristic = new ArrayList<>();
    }
    this.productCharacteristic.add(productCharacteristicItem);
    return this;
  }

  /**
   * Get productCharacteristic
   * @return productCharacteristic
  */
  @Valid 
  @Schema(name = "productCharacteristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productCharacteristic")
  public List<@Valid Characteristic> getProductCharacteristic() {
    return productCharacteristic;
  }

  public void setProductCharacteristic(List<@Valid Characteristic> productCharacteristic) {
    this.productCharacteristic = productCharacteristic;
  }

  public ProductRefOrValue productOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
    return this;
  }

  /**
   * Get productOffering
   * @return productOffering
  */
  @Valid 
  @Schema(name = "productOffering", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productOffering")
  public ProductOfferingRef getProductOffering() {
    return productOffering;
  }

  public void setProductOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
  }

  public ProductRefOrValue productOrderItem(List<@Valid RelatedProductOrderItem> productOrderItem) {
    this.productOrderItem = productOrderItem;
    return this;
  }

  public ProductRefOrValue addProductOrderItemItem(RelatedProductOrderItem productOrderItemItem) {
    if (this.productOrderItem == null) {
      this.productOrderItem = new ArrayList<>();
    }
    this.productOrderItem.add(productOrderItemItem);
    return this;
  }

  /**
   * Get productOrderItem
   * @return productOrderItem
  */
  @Valid 
  @Schema(name = "productOrderItem", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productOrderItem")
  public List<@Valid RelatedProductOrderItem> getProductOrderItem() {
    return productOrderItem;
  }

  public void setProductOrderItem(List<@Valid RelatedProductOrderItem> productOrderItem) {
    this.productOrderItem = productOrderItem;
  }

  public ProductRefOrValue productPrice(List<@Valid ProductPrice> productPrice) {
    this.productPrice = productPrice;
    return this;
  }

  public ProductRefOrValue addProductPriceItem(ProductPrice productPriceItem) {
    if (this.productPrice == null) {
      this.productPrice = new ArrayList<>();
    }
    this.productPrice.add(productPriceItem);
    return this;
  }

  /**
   * Get productPrice
   * @return productPrice
  */
  @Valid 
  @Schema(name = "productPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productPrice")
  public List<@Valid ProductPrice> getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(List<@Valid ProductPrice> productPrice) {
    this.productPrice = productPrice;
  }

  public ProductRefOrValue productRelationship(List<@Valid ProductRelationship> productRelationship) {
    this.productRelationship = productRelationship;
    return this;
  }

  public ProductRefOrValue addProductRelationshipItem(ProductRelationship productRelationshipItem) {
    if (this.productRelationship == null) {
      this.productRelationship = new ArrayList<>();
    }
    this.productRelationship.add(productRelationshipItem);
    return this;
  }

  /**
   * Get productRelationship
   * @return productRelationship
  */
  @Valid 
  @Schema(name = "productRelationship", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productRelationship")
  public List<@Valid ProductRelationship> getProductRelationship() {
    return productRelationship;
  }

  public void setProductRelationship(List<@Valid ProductRelationship> productRelationship) {
    this.productRelationship = productRelationship;
  }

  public ProductRefOrValue productSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
    return this;
  }

  /**
   * Get productSpecification
   * @return productSpecification
  */
  @Valid 
  @Schema(name = "productSpecification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productSpecification")
  public ProductSpecificationRef getProductSpecification() {
    return productSpecification;
  }

  public void setProductSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
  }

  public ProductRefOrValue productTerm(List<@Valid ProductTerm> productTerm) {
    this.productTerm = productTerm;
    return this;
  }

  public ProductRefOrValue addProductTermItem(ProductTerm productTermItem) {
    if (this.productTerm == null) {
      this.productTerm = new ArrayList<>();
    }
    this.productTerm.add(productTermItem);
    return this;
  }

  /**
   * Get productTerm
   * @return productTerm
  */
  @Valid 
  @Schema(name = "productTerm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productTerm")
  public List<@Valid ProductTerm> getProductTerm() {
    return productTerm;
  }

  public void setProductTerm(List<@Valid ProductTerm> productTerm) {
    this.productTerm = productTerm;
  }

  public ProductRefOrValue realizingResource(List<@Valid ResourceRef> realizingResource) {
    this.realizingResource = realizingResource;
    return this;
  }

  public ProductRefOrValue addRealizingResourceItem(ResourceRef realizingResourceItem) {
    if (this.realizingResource == null) {
      this.realizingResource = new ArrayList<>();
    }
    this.realizingResource.add(realizingResourceItem);
    return this;
  }

  /**
   * Get realizingResource
   * @return realizingResource
  */
  @Valid 
  @Schema(name = "realizingResource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("realizingResource")
  public List<@Valid ResourceRef> getRealizingResource() {
    return realizingResource;
  }

  public void setRealizingResource(List<@Valid ResourceRef> realizingResource) {
    this.realizingResource = realizingResource;
  }

  public ProductRefOrValue realizingService(List<@Valid ServiceRef> realizingService) {
    this.realizingService = realizingService;
    return this;
  }

  public ProductRefOrValue addRealizingServiceItem(ServiceRef realizingServiceItem) {
    if (this.realizingService == null) {
      this.realizingService = new ArrayList<>();
    }
    this.realizingService.add(realizingServiceItem);
    return this;
  }

  /**
   * Get realizingService
   * @return realizingService
  */
  @Valid 
  @Schema(name = "realizingService", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("realizingService")
  public List<@Valid ServiceRef> getRealizingService() {
    return realizingService;
  }

  public void setRealizingService(List<@Valid ServiceRef> realizingService) {
    this.realizingService = realizingService;
  }

  public ProductRefOrValue relatedParty(List<@Valid RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ProductRefOrValue addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * Get relatedParty
   * @return relatedParty
  */
  @Valid 
  @Schema(name = "relatedParty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedParty")
  public List<@Valid RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<@Valid RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ProductRefOrValue status(ProductStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public ProductStatusType getStatus() {
    return status;
  }

  public void setStatus(ProductStatusType status) {
    this.status = status;
  }

  public ProductRefOrValue atBaseType(String atBaseType) {
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

  public ProductRefOrValue atSchemaLocation(URI atSchemaLocation) {
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

  public ProductRefOrValue atType(String atType) {
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

  public ProductRefOrValue atReferredType(String atReferredType) {
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
    ProductRefOrValue productRefOrValue = (ProductRefOrValue) o;
    return Objects.equals(this.id, productRefOrValue.id) &&
        Objects.equals(this.href, productRefOrValue.href) &&
        Objects.equals(this.description, productRefOrValue.description) &&
        Objects.equals(this.isBundle, productRefOrValue.isBundle) &&
        Objects.equals(this.isCustomerVisible, productRefOrValue.isCustomerVisible) &&
        Objects.equals(this.name, productRefOrValue.name) &&
        Objects.equals(this.orderDate, productRefOrValue.orderDate) &&
        Objects.equals(this.productSerialNumber, productRefOrValue.productSerialNumber) &&
        Objects.equals(this.startDate, productRefOrValue.startDate) &&
        Objects.equals(this.terminationDate, productRefOrValue.terminationDate) &&
        Objects.equals(this.agreement, productRefOrValue.agreement) &&
        Objects.equals(this.billingAccount, productRefOrValue.billingAccount) &&
        Objects.equals(this.place, productRefOrValue.place) &&
        Objects.equals(this.product, productRefOrValue.product) &&
        Objects.equals(this.productCharacteristic, productRefOrValue.productCharacteristic) &&
        Objects.equals(this.productOffering, productRefOrValue.productOffering) &&
        Objects.equals(this.productOrderItem, productRefOrValue.productOrderItem) &&
        Objects.equals(this.productPrice, productRefOrValue.productPrice) &&
        Objects.equals(this.productRelationship, productRefOrValue.productRelationship) &&
        Objects.equals(this.productSpecification, productRefOrValue.productSpecification) &&
        Objects.equals(this.productTerm, productRefOrValue.productTerm) &&
        Objects.equals(this.realizingResource, productRefOrValue.realizingResource) &&
        Objects.equals(this.realizingService, productRefOrValue.realizingService) &&
        Objects.equals(this.relatedParty, productRefOrValue.relatedParty) &&
        Objects.equals(this.status, productRefOrValue.status) &&
        Objects.equals(this.atBaseType, productRefOrValue.atBaseType) &&
        Objects.equals(this.atSchemaLocation, productRefOrValue.atSchemaLocation) &&
        Objects.equals(this.atType, productRefOrValue.atType) &&
        Objects.equals(this.atReferredType, productRefOrValue.atReferredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, isBundle, isCustomerVisible, name, orderDate, productSerialNumber, startDate, terminationDate, agreement, billingAccount, place, product, productCharacteristic, productOffering, productOrderItem, productPrice, productRelationship, productSpecification, productTerm, realizingResource, realizingService, relatedParty, status, atBaseType, atSchemaLocation, atType, atReferredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductRefOrValue {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    isCustomerVisible: ").append(toIndentedString(isCustomerVisible)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    productSerialNumber: ").append(toIndentedString(productSerialNumber)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    terminationDate: ").append(toIndentedString(terminationDate)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productCharacteristic: ").append(toIndentedString(productCharacteristic)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    productOrderItem: ").append(toIndentedString(productOrderItem)).append("\n");
    sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
    sb.append("    productRelationship: ").append(toIndentedString(productRelationship)).append("\n");
    sb.append("    productSpecification: ").append(toIndentedString(productSpecification)).append("\n");
    sb.append("    productTerm: ").append(toIndentedString(productTerm)).append("\n");
    sb.append("    realizingResource: ").append(toIndentedString(realizingResource)).append("\n");
    sb.append("    realizingService: ").append(toIndentedString(realizingService)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

