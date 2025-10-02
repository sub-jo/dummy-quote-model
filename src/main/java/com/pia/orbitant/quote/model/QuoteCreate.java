package com.pia.orbitant.quote.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.pia.orbitant.quote.model.AgreementRef;
import com.pia.orbitant.quote.model.Authorization;
import com.pia.orbitant.quote.model.BillingAccountRef;
import com.pia.orbitant.quote.model.ContactMedium;
import com.pia.orbitant.quote.model.Note;
import com.pia.orbitant.quote.model.ProductOfferingQualificationRef;
import com.pia.orbitant.quote.model.QuoteItem;
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
 * Quote can be used to negotiate service and product acquisition or modification between a customer and a service provider. Quote contain list of quote items, a reference to customer (partyRole), a list of productOffering and attached prices and conditions. Skipped properties: href,quoteDate,state,effectiveQuoteCompletionDate,quoteAuthorization,quoteTotalPrice,expectedQuoteCompletionDate,validFor
 */

@Schema(name = "Quote_Create", description = "Quote can be used to negotiate service and product acquisition or modification between a customer and a service provider. Quote contain list of quote items, a reference to customer (partyRole), a list of productOffering and attached prices and conditions. Skipped properties: href,quoteDate,state,effectiveQuoteCompletionDate,quoteAuthorization,quoteTotalPrice,expectedQuoteCompletionDate,validFor")
@JsonTypeName("Quote_Create")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class QuoteCreate implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private String category;

  private String description;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expectedFulfillmentStartDate;

  private String externalId;

  private Boolean instantSyncQuote;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime requestedQuoteCompletionDate;

  private String version;

  @Valid
  private List<@Valid AgreementRef> agreement;

  @Valid
  private List<@Valid Authorization> authorization;

  @Valid
  private List<@Valid BillingAccountRef> billingAccount;

  @Valid
  private List<@Valid ContactMedium> contactMedium;

  @Valid
  private List<@Valid Note> note;

  @Valid
  private List<@Valid ProductOfferingQualificationRef> productOfferingQualification;

  @Valid
  private List<@Valid QuoteItem> quoteItem = new ArrayList<>();

  @Valid
  private List<@Valid RelatedParty> relatedParty;

  private String atBaseType;

  private URI atSchemaLocation;

  private String atType;

  public QuoteCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public QuoteCreate(List<@Valid QuoteItem> quoteItem) {
    this.quoteItem = quoteItem;
  }

  public QuoteCreate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier - attributed by quoting system
   * @return id
  */
  
  @Schema(name = "id", description = "Unique identifier - attributed by quoting system", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public QuoteCreate category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Used to categorize the quote from a business perspective that can be useful for the CRM system (e.g. \"enterprise\", \"residential\", ...)
   * @return category
  */
  
  @Schema(name = "category", description = "Used to categorize the quote from a business perspective that can be useful for the CRM system (e.g. \"enterprise\", \"residential\", ...)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public QuoteCreate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the quote
   * @return description
  */
  
  @Schema(name = "description", description = "Description of the quote", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public QuoteCreate expectedFulfillmentStartDate(OffsetDateTime expectedFulfillmentStartDate) {
    this.expectedFulfillmentStartDate = expectedFulfillmentStartDate;
    return this;
  }

  /**
   * this is the date wished by the requester to have the requested quote item delivered
   * @return expectedFulfillmentStartDate
  */
  @Valid 
  @Schema(name = "expectedFulfillmentStartDate", description = "this is the date wished by the requester to have the requested quote item delivered", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expectedFulfillmentStartDate")
  public OffsetDateTime getExpectedFulfillmentStartDate() {
    return expectedFulfillmentStartDate;
  }

  public void setExpectedFulfillmentStartDate(OffsetDateTime expectedFulfillmentStartDate) {
    this.expectedFulfillmentStartDate = expectedFulfillmentStartDate;
  }

  public QuoteCreate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * ID given by the consumer and only understandable by him (to facilitate his searches afterwards)
   * @return externalId
  */
  
  @Schema(name = "externalId", description = "ID given by the consumer and only understandable by him (to facilitate his searches afterwards)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public QuoteCreate instantSyncQuote(Boolean instantSyncQuote) {
    this.instantSyncQuote = instantSyncQuote;
    return this;
  }

  /**
   * An indicator which when the value is \"true\" means that requester expects to get quoting result immediately in the response. If the indicator is true then the response code of 200 indicates the operation is successful otherwise a task is created with a response 201. 
   * @return instantSyncQuote
  */
  
  @Schema(name = "instantSyncQuote", description = "An indicator which when the value is \"true\" means that requester expects to get quoting result immediately in the response. If the indicator is true then the response code of 200 indicates the operation is successful otherwise a task is created with a response 201. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instantSyncQuote")
  public Boolean getInstantSyncQuote() {
    return instantSyncQuote;
  }

  public void setInstantSyncQuote(Boolean instantSyncQuote) {
    this.instantSyncQuote = instantSyncQuote;
  }

  public QuoteCreate requestedQuoteCompletionDate(OffsetDateTime requestedQuoteCompletionDate) {
    this.requestedQuoteCompletionDate = requestedQuoteCompletionDate;
    return this;
  }

  /**
   * This is requested date - from quote requester - to get a complete response for this quote
   * @return requestedQuoteCompletionDate
  */
  @Valid 
  @Schema(name = "requestedQuoteCompletionDate", description = "This is requested date - from quote requester - to get a complete response for this quote", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestedQuoteCompletionDate")
  public OffsetDateTime getRequestedQuoteCompletionDate() {
    return requestedQuoteCompletionDate;
  }

  public void setRequestedQuoteCompletionDate(OffsetDateTime requestedQuoteCompletionDate) {
    this.requestedQuoteCompletionDate = requestedQuoteCompletionDate;
  }

  public QuoteCreate version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Quote version - if the customer rejected the quote but  negotiations still open a new version of the quote is managed
   * @return version
  */
  
  @Schema(name = "version", description = "Quote version - if the customer rejected the quote but  negotiations still open a new version of the quote is managed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public QuoteCreate agreement(List<@Valid AgreementRef> agreement) {
    this.agreement = agreement;
    return this;
  }

  public QuoteCreate addAgreementItem(AgreementRef agreementItem) {
    if (this.agreement == null) {
      this.agreement = new ArrayList<>();
    }
    this.agreement.add(agreementItem);
    return this;
  }

  /**
   * A reference to an agreement defining the context of the quote
   * @return agreement
  */
  @Valid 
  @Schema(name = "agreement", description = "A reference to an agreement defining the context of the quote", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("agreement")
  public List<@Valid AgreementRef> getAgreement() {
    return agreement;
  }

  public void setAgreement(List<@Valid AgreementRef> agreement) {
    this.agreement = agreement;
  }

  public QuoteCreate authorization(List<@Valid Authorization> authorization) {
    this.authorization = authorization;
    return this;
  }

  public QuoteCreate addAuthorizationItem(Authorization authorizationItem) {
    if (this.authorization == null) {
      this.authorization = new ArrayList<>();
    }
    this.authorization.add(authorizationItem);
    return this;
  }

  /**
   * An authorization provided for the quote
   * @return authorization
  */
  @Valid 
  @Schema(name = "authorization", description = "An authorization provided for the quote", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authorization")
  public List<@Valid Authorization> getAuthorization() {
    return authorization;
  }

  public void setAuthorization(List<@Valid Authorization> authorization) {
    this.authorization = authorization;
  }

  public QuoteCreate billingAccount(List<@Valid BillingAccountRef> billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

  public QuoteCreate addBillingAccountItem(BillingAccountRef billingAccountItem) {
    if (this.billingAccount == null) {
      this.billingAccount = new ArrayList<>();
    }
    this.billingAccount.add(billingAccountItem);
    return this;
  }

  /**
   * A reference to a billing account to provide quote context information 
   * @return billingAccount
  */
  @Valid 
  @Schema(name = "billingAccount", description = "A reference to a billing account to provide quote context information ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billingAccount")
  public List<@Valid BillingAccountRef> getBillingAccount() {
    return billingAccount;
  }

  public void setBillingAccount(List<@Valid BillingAccountRef> billingAccount) {
    this.billingAccount = billingAccount;
  }

  public QuoteCreate contactMedium(List<@Valid ContactMedium> contactMedium) {
    this.contactMedium = contactMedium;
    return this;
  }

  public QuoteCreate addContactMediumItem(ContactMedium contactMediumItem) {
    if (this.contactMedium == null) {
      this.contactMedium = new ArrayList<>();
    }
    this.contactMedium.add(contactMediumItem);
    return this;
  }

  /**
   * Information contact related to the quote requester
   * @return contactMedium
  */
  @Valid 
  @Schema(name = "contactMedium", description = "Information contact related to the quote requester", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contactMedium")
  public List<@Valid ContactMedium> getContactMedium() {
    return contactMedium;
  }

  public void setContactMedium(List<@Valid ContactMedium> contactMedium) {
    this.contactMedium = contactMedium;
  }

  public QuoteCreate note(List<@Valid Note> note) {
    this.note = note;
    return this;
  }

  public QuoteCreate addNoteItem(Note noteItem) {
    if (this.note == null) {
      this.note = new ArrayList<>();
    }
    this.note.add(noteItem);
    return this;
  }

  /**
   * Free form text associated with the quote
   * @return note
  */
  @Valid 
  @Schema(name = "note", description = "Free form text associated with the quote", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("note")
  public List<@Valid Note> getNote() {
    return note;
  }

  public void setNote(List<@Valid Note> note) {
    this.note = note;
  }

  public QuoteCreate productOfferingQualification(List<@Valid ProductOfferingQualificationRef> productOfferingQualification) {
    this.productOfferingQualification = productOfferingQualification;
    return this;
  }

  public QuoteCreate addProductOfferingQualificationItem(ProductOfferingQualificationRef productOfferingQualificationItem) {
    if (this.productOfferingQualification == null) {
      this.productOfferingQualification = new ArrayList<>();
    }
    this.productOfferingQualification.add(productOfferingQualificationItem);
    return this;
  }

  /**
   * A reference to a previously done product offering qualification
   * @return productOfferingQualification
  */
  @Valid 
  @Schema(name = "productOfferingQualification", description = "A reference to a previously done product offering qualification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productOfferingQualification")
  public List<@Valid ProductOfferingQualificationRef> getProductOfferingQualification() {
    return productOfferingQualification;
  }

  public void setProductOfferingQualification(List<@Valid ProductOfferingQualificationRef> productOfferingQualification) {
    this.productOfferingQualification = productOfferingQualification;
  }

  public QuoteCreate quoteItem(List<@Valid QuoteItem> quoteItem) {
    this.quoteItem = quoteItem;
    return this;
  }

  public QuoteCreate addQuoteItemItem(QuoteItem quoteItemItem) {
    if (this.quoteItem == null) {
      this.quoteItem = new ArrayList<>();
    }
    this.quoteItem.add(quoteItemItem);
    return this;
  }

  /**
   * An item of the quote - it is used to descirbe an operation on a product to be quoted
   * @return quoteItem
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "quoteItem", description = "An item of the quote - it is used to descirbe an operation on a product to be quoted", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("quoteItem")
  public List<@Valid QuoteItem> getQuoteItem() {
    return quoteItem;
  }

  public void setQuoteItem(List<@Valid QuoteItem> quoteItem) {
    this.quoteItem = quoteItem;
  }

  public QuoteCreate relatedParty(List<@Valid RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public QuoteCreate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * A reference to a party playing a role in this quote (customer, seller, requester, etc.)
   * @return relatedParty
  */
  @Valid 
  @Schema(name = "relatedParty", description = "A reference to a party playing a role in this quote (customer, seller, requester, etc.)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedParty")
  public List<@Valid RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<@Valid RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public QuoteCreate atBaseType(String atBaseType) {
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

  public QuoteCreate atSchemaLocation(URI atSchemaLocation) {
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

  public QuoteCreate atType(String atType) {
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
    QuoteCreate quoteCreate = (QuoteCreate) o;
    return Objects.equals(this.id, quoteCreate.id) &&
        Objects.equals(this.category, quoteCreate.category) &&
        Objects.equals(this.description, quoteCreate.description) &&
        Objects.equals(this.expectedFulfillmentStartDate, quoteCreate.expectedFulfillmentStartDate) &&
        Objects.equals(this.externalId, quoteCreate.externalId) &&
        Objects.equals(this.instantSyncQuote, quoteCreate.instantSyncQuote) &&
        Objects.equals(this.requestedQuoteCompletionDate, quoteCreate.requestedQuoteCompletionDate) &&
        Objects.equals(this.version, quoteCreate.version) &&
        Objects.equals(this.agreement, quoteCreate.agreement) &&
        Objects.equals(this.authorization, quoteCreate.authorization) &&
        Objects.equals(this.billingAccount, quoteCreate.billingAccount) &&
        Objects.equals(this.contactMedium, quoteCreate.contactMedium) &&
        Objects.equals(this.note, quoteCreate.note) &&
        Objects.equals(this.productOfferingQualification, quoteCreate.productOfferingQualification) &&
        Objects.equals(this.quoteItem, quoteCreate.quoteItem) &&
        Objects.equals(this.relatedParty, quoteCreate.relatedParty) &&
        Objects.equals(this.atBaseType, quoteCreate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, quoteCreate.atSchemaLocation) &&
        Objects.equals(this.atType, quoteCreate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, category, description, expectedFulfillmentStartDate, externalId, instantSyncQuote, requestedQuoteCompletionDate, version, agreement, authorization, billingAccount, contactMedium, note, productOfferingQualification, quoteItem, relatedParty, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteCreate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expectedFulfillmentStartDate: ").append(toIndentedString(expectedFulfillmentStartDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    instantSyncQuote: ").append(toIndentedString(instantSyncQuote)).append("\n");
    sb.append("    requestedQuoteCompletionDate: ").append(toIndentedString(requestedQuoteCompletionDate)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    contactMedium: ").append(toIndentedString(contactMedium)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    productOfferingQualification: ").append(toIndentedString(productOfferingQualification)).append("\n");
    sb.append("    quoteItem: ").append(toIndentedString(quoteItem)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
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

