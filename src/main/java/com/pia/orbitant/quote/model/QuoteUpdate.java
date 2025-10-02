package com.pia.orbitant.quote.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.pia.orbitant.quote.model.AgreementRef;
import com.pia.orbitant.quote.model.Authorization;
import com.pia.orbitant.quote.model.BillingAccountRef;
import com.pia.orbitant.quote.model.ContactMedium;
import com.pia.orbitant.quote.model.Note;
import com.pia.orbitant.quote.model.ProductOfferingQualificationRef;
import com.pia.orbitant.quote.model.QuoteItem;
import com.pia.orbitant.quote.model.QuotePrice;
import com.pia.orbitant.quote.model.QuoteStateType;
import com.pia.orbitant.quote.model.RelatedParty;
import com.pia.orbitant.quote.model.TimePeriod;
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
 * Quote can be used to negotiate service and product acquisition or modification between a customer and a service provider. Quote contain list of quote items, a reference to customer (partyRole), a list of productOffering and attached prices and conditions. Skipped properties: id,href,quoteDate
 */

@Schema(name = "Quote_Update", description = "Quote can be used to negotiate service and product acquisition or modification between a customer and a service provider. Quote contain list of quote items, a reference to customer (partyRole), a list of productOffering and attached prices and conditions. Skipped properties: id,href,quoteDate")
@JsonTypeName("Quote_Update")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class QuoteUpdate implements Serializable {

  private static final long serialVersionUID = 1L;

  private String category;

  private String description;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime effectiveQuoteCompletionDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expectedFulfillmentStartDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expectedQuoteCompletionDate;

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
  private List<@Valid QuotePrice> quoteTotalPrice;

  @Valid
  private List<@Valid RelatedParty> relatedParty;

  private QuoteStateType state;

  private TimePeriod validFor;

  private String atBaseType;

  private URI atSchemaLocation;

  private String atType;

  public QuoteUpdate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public QuoteUpdate(List<@Valid QuoteItem> quoteItem) {
    this.quoteItem = quoteItem;
  }

  public QuoteUpdate category(String category) {
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

  public QuoteUpdate description(String description) {
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

  public QuoteUpdate effectiveQuoteCompletionDate(OffsetDateTime effectiveQuoteCompletionDate) {
    this.effectiveQuoteCompletionDate = effectiveQuoteCompletionDate;
    return this;
  }

  /**
   * Date when the quote has been completed
   * @return effectiveQuoteCompletionDate
  */
  @Valid 
  @Schema(name = "effectiveQuoteCompletionDate", description = "Date when the quote has been completed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("effectiveQuoteCompletionDate")
  public OffsetDateTime getEffectiveQuoteCompletionDate() {
    return effectiveQuoteCompletionDate;
  }

  public void setEffectiveQuoteCompletionDate(OffsetDateTime effectiveQuoteCompletionDate) {
    this.effectiveQuoteCompletionDate = effectiveQuoteCompletionDate;
  }

  public QuoteUpdate expectedFulfillmentStartDate(OffsetDateTime expectedFulfillmentStartDate) {
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

  public QuoteUpdate expectedQuoteCompletionDate(OffsetDateTime expectedQuoteCompletionDate) {
    this.expectedQuoteCompletionDate = expectedQuoteCompletionDate;
    return this;
  }

  /**
   * This is expected date - from quote supplier - to be able to send back  a response for this quote
   * @return expectedQuoteCompletionDate
  */
  @Valid 
  @Schema(name = "expectedQuoteCompletionDate", description = "This is expected date - from quote supplier - to be able to send back  a response for this quote", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expectedQuoteCompletionDate")
  public OffsetDateTime getExpectedQuoteCompletionDate() {
    return expectedQuoteCompletionDate;
  }

  public void setExpectedQuoteCompletionDate(OffsetDateTime expectedQuoteCompletionDate) {
    this.expectedQuoteCompletionDate = expectedQuoteCompletionDate;
  }

  public QuoteUpdate externalId(String externalId) {
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

  public QuoteUpdate instantSyncQuote(Boolean instantSyncQuote) {
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

  public QuoteUpdate requestedQuoteCompletionDate(OffsetDateTime requestedQuoteCompletionDate) {
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

  public QuoteUpdate version(String version) {
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

  public QuoteUpdate agreement(List<@Valid AgreementRef> agreement) {
    this.agreement = agreement;
    return this;
  }

  public QuoteUpdate addAgreementItem(AgreementRef agreementItem) {
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

  public QuoteUpdate authorization(List<@Valid Authorization> authorization) {
    this.authorization = authorization;
    return this;
  }

  public QuoteUpdate addAuthorizationItem(Authorization authorizationItem) {
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

  public QuoteUpdate billingAccount(List<@Valid BillingAccountRef> billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

  public QuoteUpdate addBillingAccountItem(BillingAccountRef billingAccountItem) {
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

  public QuoteUpdate contactMedium(List<@Valid ContactMedium> contactMedium) {
    this.contactMedium = contactMedium;
    return this;
  }

  public QuoteUpdate addContactMediumItem(ContactMedium contactMediumItem) {
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

  public QuoteUpdate note(List<@Valid Note> note) {
    this.note = note;
    return this;
  }

  public QuoteUpdate addNoteItem(Note noteItem) {
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

  public QuoteUpdate productOfferingQualification(List<@Valid ProductOfferingQualificationRef> productOfferingQualification) {
    this.productOfferingQualification = productOfferingQualification;
    return this;
  }

  public QuoteUpdate addProductOfferingQualificationItem(ProductOfferingQualificationRef productOfferingQualificationItem) {
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

  public QuoteUpdate quoteItem(List<@Valid QuoteItem> quoteItem) {
    this.quoteItem = quoteItem;
    return this;
  }

  public QuoteUpdate addQuoteItemItem(QuoteItem quoteItemItem) {
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

  public QuoteUpdate quoteTotalPrice(List<@Valid QuotePrice> quoteTotalPrice) {
    this.quoteTotalPrice = quoteTotalPrice;
    return this;
  }

  public QuoteUpdate addQuoteTotalPriceItem(QuotePrice quoteTotalPriceItem) {
    if (this.quoteTotalPrice == null) {
      this.quoteTotalPrice = new ArrayList<>();
    }
    this.quoteTotalPrice.add(quoteTotalPriceItem);
    return this;
  }

  /**
   * Quote total price
   * @return quoteTotalPrice
  */
  @Valid 
  @Schema(name = "quoteTotalPrice", description = "Quote total price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quoteTotalPrice")
  public List<@Valid QuotePrice> getQuoteTotalPrice() {
    return quoteTotalPrice;
  }

  public void setQuoteTotalPrice(List<@Valid QuotePrice> quoteTotalPrice) {
    this.quoteTotalPrice = quoteTotalPrice;
  }

  public QuoteUpdate relatedParty(List<@Valid RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public QuoteUpdate addRelatedPartyItem(RelatedParty relatedPartyItem) {
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

  public QuoteUpdate state(QuoteStateType state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @Valid 
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public QuoteStateType getState() {
    return state;
  }

  public void setState(QuoteStateType state) {
    this.state = state;
  }

  public QuoteUpdate validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
  */
  @Valid 
  @Schema(name = "validFor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validFor")
  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public QuoteUpdate atBaseType(String atBaseType) {
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

  public QuoteUpdate atSchemaLocation(URI atSchemaLocation) {
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

  public QuoteUpdate atType(String atType) {
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
    QuoteUpdate quoteUpdate = (QuoteUpdate) o;
    return Objects.equals(this.category, quoteUpdate.category) &&
        Objects.equals(this.description, quoteUpdate.description) &&
        Objects.equals(this.effectiveQuoteCompletionDate, quoteUpdate.effectiveQuoteCompletionDate) &&
        Objects.equals(this.expectedFulfillmentStartDate, quoteUpdate.expectedFulfillmentStartDate) &&
        Objects.equals(this.expectedQuoteCompletionDate, quoteUpdate.expectedQuoteCompletionDate) &&
        Objects.equals(this.externalId, quoteUpdate.externalId) &&
        Objects.equals(this.instantSyncQuote, quoteUpdate.instantSyncQuote) &&
        Objects.equals(this.requestedQuoteCompletionDate, quoteUpdate.requestedQuoteCompletionDate) &&
        Objects.equals(this.version, quoteUpdate.version) &&
        Objects.equals(this.agreement, quoteUpdate.agreement) &&
        Objects.equals(this.authorization, quoteUpdate.authorization) &&
        Objects.equals(this.billingAccount, quoteUpdate.billingAccount) &&
        Objects.equals(this.contactMedium, quoteUpdate.contactMedium) &&
        Objects.equals(this.note, quoteUpdate.note) &&
        Objects.equals(this.productOfferingQualification, quoteUpdate.productOfferingQualification) &&
        Objects.equals(this.quoteItem, quoteUpdate.quoteItem) &&
        Objects.equals(this.quoteTotalPrice, quoteUpdate.quoteTotalPrice) &&
        Objects.equals(this.relatedParty, quoteUpdate.relatedParty) &&
        Objects.equals(this.state, quoteUpdate.state) &&
        Objects.equals(this.validFor, quoteUpdate.validFor) &&
        Objects.equals(this.atBaseType, quoteUpdate.atBaseType) &&
        Objects.equals(this.atSchemaLocation, quoteUpdate.atSchemaLocation) &&
        Objects.equals(this.atType, quoteUpdate.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, description, effectiveQuoteCompletionDate, expectedFulfillmentStartDate, expectedQuoteCompletionDate, externalId, instantSyncQuote, requestedQuoteCompletionDate, version, agreement, authorization, billingAccount, contactMedium, note, productOfferingQualification, quoteItem, quoteTotalPrice, relatedParty, state, validFor, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteUpdate {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    effectiveQuoteCompletionDate: ").append(toIndentedString(effectiveQuoteCompletionDate)).append("\n");
    sb.append("    expectedFulfillmentStartDate: ").append(toIndentedString(expectedFulfillmentStartDate)).append("\n");
    sb.append("    expectedQuoteCompletionDate: ").append(toIndentedString(expectedQuoteCompletionDate)).append("\n");
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
    sb.append("    quoteTotalPrice: ").append(toIndentedString(quoteTotalPrice)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

