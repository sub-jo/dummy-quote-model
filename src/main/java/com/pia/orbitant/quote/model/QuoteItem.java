package com.pia.orbitant.quote.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pia.orbitant.quote.model.AppointmentRef;
import com.pia.orbitant.quote.model.AttachmentRefOrValue;
import com.pia.orbitant.quote.model.Authorization;
import com.pia.orbitant.quote.model.Note;
import com.pia.orbitant.quote.model.ProductOfferingQualificationItemRef;
import com.pia.orbitant.quote.model.ProductOfferingRef;
import com.pia.orbitant.quote.model.ProductRefOrValue;
import com.pia.orbitant.quote.model.QuoteItemRelationship;
import com.pia.orbitant.quote.model.QuotePrice;
import com.pia.orbitant.quote.model.RelatedParty;
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
 * A quote items describe an action to be performed on a productOffering or a product in order to get pricing elements and condition.
 */

@Schema(name = "QuoteItem", description = "A quote items describe an action to be performed on a productOffering or a product in order to get pricing elements and condition.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class QuoteItem implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;

  private String action;

  private Integer quantity;

  private String state;

  @Valid
  private List<@Valid AppointmentRef> appointment;

  @Valid
  private List<@Valid AttachmentRefOrValue> attachment;

  @Valid
  private List<@Valid Note> note;

  private ProductRefOrValue product;

  private ProductOfferingRef productOffering;

  private ProductOfferingQualificationItemRef productOfferingQualificationItem;

  @Valid
  private List<@Valid QuoteItem> quoteItem;

  @Valid
  private List<@Valid Authorization> quoteItemAuthorization;

  @Valid
  private List<@Valid QuotePrice> quoteItemPrice;

  @Valid
  private List<@Valid QuoteItemRelationship> quoteItemRelationship;

  @Valid
  private List<@Valid RelatedParty> relatedParty;

  private String atBaseType;

  private URI atSchemaLocation;

  private String atType;

  public QuoteItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the quote item (generally it is a sequence number 01, 02, 03, ...)
   * @return id
  */
  
  @Schema(name = "id", description = "Identifier of the quote item (generally it is a sequence number 01, 02, 03, ...)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public QuoteItem action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Action to be performed on this quote item (add, modify, remove, etc.)
   * @return action
  */
  
  @Schema(name = "action", description = "Action to be performed on this quote item (add, modify, remove, etc.)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public QuoteItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity asked for this quote item
   * @return quantity
  */
  
  @Schema(name = "quantity", description = "Quantity asked for this quote item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public QuoteItem state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State of the quote item : described in the state machine diagram
   * @return state
  */
  
  @Schema(name = "state", description = "State of the quote item : described in the state machine diagram", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public QuoteItem appointment(List<@Valid AppointmentRef> appointment) {
    this.appointment = appointment;
    return this;
  }

  public QuoteItem addAppointmentItem(AppointmentRef appointmentItem) {
    if (this.appointment == null) {
      this.appointment = new ArrayList<>();
    }
    this.appointment.add(appointmentItem);
    return this;
  }

  /**
   * A reference to appointment(s) associated with this quote item
   * @return appointment
  */
  @Valid 
  @Schema(name = "appointment", description = "A reference to appointment(s) associated with this quote item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appointment")
  public List<@Valid AppointmentRef> getAppointment() {
    return appointment;
  }

  public void setAppointment(List<@Valid AppointmentRef> appointment) {
    this.appointment = appointment;
  }

  public QuoteItem attachment(List<@Valid AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
    return this;
  }

  public QuoteItem addAttachmentItem(AttachmentRefOrValue attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<>();
    }
    this.attachment.add(attachmentItem);
    return this;
  }

  /**
   * A reference to attachment(s) associated with this quote item
   * @return attachment
  */
  @Valid 
  @Schema(name = "attachment", description = "A reference to attachment(s) associated with this quote item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attachment")
  public List<@Valid AttachmentRefOrValue> getAttachment() {
    return attachment;
  }

  public void setAttachment(List<@Valid AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
  }

  public QuoteItem note(List<@Valid Note> note) {
    this.note = note;
    return this;
  }

  public QuoteItem addNoteItem(Note noteItem) {
    if (this.note == null) {
      this.note = new ArrayList<>();
    }
    this.note.add(noteItem);
    return this;
  }

  /**
   * Free form text associated with the quote item
   * @return note
  */
  @Valid 
  @Schema(name = "note", description = "Free form text associated with the quote item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("note")
  public List<@Valid Note> getNote() {
    return note;
  }

  public void setNote(List<@Valid Note> note) {
    this.note = note;
  }

  public QuoteItem product(ProductRefOrValue product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
  */
  @Valid 
  @Schema(name = "product", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product")
  public ProductRefOrValue getProduct() {
    return product;
  }

  public void setProduct(ProductRefOrValue product) {
    this.product = product;
  }

  public QuoteItem productOffering(ProductOfferingRef productOffering) {
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

  public QuoteItem productOfferingQualificationItem(ProductOfferingQualificationItemRef productOfferingQualificationItem) {
    this.productOfferingQualificationItem = productOfferingQualificationItem;
    return this;
  }

  /**
   * Get productOfferingQualificationItem
   * @return productOfferingQualificationItem
  */
  @Valid 
  @Schema(name = "productOfferingQualificationItem", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productOfferingQualificationItem")
  public ProductOfferingQualificationItemRef getProductOfferingQualificationItem() {
    return productOfferingQualificationItem;
  }

  public void setProductOfferingQualificationItem(ProductOfferingQualificationItemRef productOfferingQualificationItem) {
    this.productOfferingQualificationItem = productOfferingQualificationItem;
  }

  public QuoteItem quoteItem(List<@Valid QuoteItem> quoteItem) {
    this.quoteItem = quoteItem;
    return this;
  }

  public QuoteItem addQuoteItemItem(QuoteItem quoteItemItem) {
    if (this.quoteItem == null) {
      this.quoteItem = new ArrayList<>();
    }
    this.quoteItem.add(quoteItemItem);
    return this;
  }

  /**
   * A structure to embedded quote item within quote item
   * @return quoteItem
  */
  @Valid 
  @Schema(name = "quoteItem", description = "A structure to embedded quote item within quote item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quoteItem")
  public List<@Valid QuoteItem> getQuoteItem() {
    return quoteItem;
  }

  public void setQuoteItem(List<@Valid QuoteItem> quoteItem) {
    this.quoteItem = quoteItem;
  }

  public QuoteItem quoteItemAuthorization(List<@Valid Authorization> quoteItemAuthorization) {
    this.quoteItemAuthorization = quoteItemAuthorization;
    return this;
  }

  public QuoteItem addQuoteItemAuthorizationItem(Authorization quoteItemAuthorizationItem) {
    if (this.quoteItemAuthorization == null) {
      this.quoteItemAuthorization = new ArrayList<>();
    }
    this.quoteItemAuthorization.add(quoteItemAuthorizationItem);
    return this;
  }

  /**
   * Authorization related to this quote item
   * @return quoteItemAuthorization
  */
  @Valid 
  @Schema(name = "quoteItemAuthorization", description = "Authorization related to this quote item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quoteItemAuthorization")
  public List<@Valid Authorization> getQuoteItemAuthorization() {
    return quoteItemAuthorization;
  }

  public void setQuoteItemAuthorization(List<@Valid Authorization> quoteItemAuthorization) {
    this.quoteItemAuthorization = quoteItemAuthorization;
  }

  public QuoteItem quoteItemPrice(List<@Valid QuotePrice> quoteItemPrice) {
    this.quoteItemPrice = quoteItemPrice;
    return this;
  }

  public QuoteItem addQuoteItemPriceItem(QuotePrice quoteItemPriceItem) {
    if (this.quoteItemPrice == null) {
      this.quoteItemPrice = new ArrayList<>();
    }
    this.quoteItemPrice.add(quoteItemPriceItem);
    return this;
  }

  /**
   * Price for this quote item
   * @return quoteItemPrice
  */
  @Valid 
  @Schema(name = "quoteItemPrice", description = "Price for this quote item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quoteItemPrice")
  public List<@Valid QuotePrice> getQuoteItemPrice() {
    return quoteItemPrice;
  }

  public void setQuoteItemPrice(List<@Valid QuotePrice> quoteItemPrice) {
    this.quoteItemPrice = quoteItemPrice;
  }

  public QuoteItem quoteItemRelationship(List<@Valid QuoteItemRelationship> quoteItemRelationship) {
    this.quoteItemRelationship = quoteItemRelationship;
    return this;
  }

  public QuoteItem addQuoteItemRelationshipItem(QuoteItemRelationship quoteItemRelationshipItem) {
    if (this.quoteItemRelationship == null) {
      this.quoteItemRelationship = new ArrayList<>();
    }
    this.quoteItemRelationship.add(quoteItemRelationshipItem);
    return this;
  }

  /**
   * A relationship from item within a quote
   * @return quoteItemRelationship
  */
  @Valid 
  @Schema(name = "quoteItemRelationship", description = "A relationship from item within a quote", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quoteItemRelationship")
  public List<@Valid QuoteItemRelationship> getQuoteItemRelationship() {
    return quoteItemRelationship;
  }

  public void setQuoteItemRelationship(List<@Valid QuoteItemRelationship> quoteItemRelationship) {
    this.quoteItemRelationship = quoteItemRelationship;
  }

  public QuoteItem relatedParty(List<@Valid RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public QuoteItem addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * A reference to a party playing a role in this quote item
   * @return relatedParty
  */
  @Valid 
  @Schema(name = "relatedParty", description = "A reference to a party playing a role in this quote item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relatedParty")
  public List<@Valid RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<@Valid RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public QuoteItem atBaseType(String atBaseType) {
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

  public QuoteItem atSchemaLocation(URI atSchemaLocation) {
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

  public QuoteItem atType(String atType) {
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
    QuoteItem quoteItem = (QuoteItem) o;
    return Objects.equals(this.id, quoteItem.id) &&
        Objects.equals(this.action, quoteItem.action) &&
        Objects.equals(this.quantity, quoteItem.quantity) &&
        Objects.equals(this.state, quoteItem.state) &&
        Objects.equals(this.appointment, quoteItem.appointment) &&
        Objects.equals(this.attachment, quoteItem.attachment) &&
        Objects.equals(this.note, quoteItem.note) &&
        Objects.equals(this.product, quoteItem.product) &&
        Objects.equals(this.productOffering, quoteItem.productOffering) &&
        Objects.equals(this.productOfferingQualificationItem, quoteItem.productOfferingQualificationItem) &&
        Objects.equals(this.quoteItem, quoteItem.quoteItem) &&
        Objects.equals(this.quoteItemAuthorization, quoteItem.quoteItemAuthorization) &&
        Objects.equals(this.quoteItemPrice, quoteItem.quoteItemPrice) &&
        Objects.equals(this.quoteItemRelationship, quoteItem.quoteItemRelationship) &&
        Objects.equals(this.relatedParty, quoteItem.relatedParty) &&
        Objects.equals(this.atBaseType, quoteItem.atBaseType) &&
        Objects.equals(this.atSchemaLocation, quoteItem.atSchemaLocation) &&
        Objects.equals(this.atType, quoteItem.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, action, quantity, state, appointment, attachment, note, product, productOffering, productOfferingQualificationItem, quoteItem, quoteItemAuthorization, quoteItemPrice, quoteItemRelationship, relatedParty, atBaseType, atSchemaLocation, atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    appointment: ").append(toIndentedString(appointment)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    productOfferingQualificationItem: ").append(toIndentedString(productOfferingQualificationItem)).append("\n");
    sb.append("    quoteItem: ").append(toIndentedString(quoteItem)).append("\n");
    sb.append("    quoteItemAuthorization: ").append(toIndentedString(quoteItemAuthorization)).append("\n");
    sb.append("    quoteItemPrice: ").append(toIndentedString(quoteItemPrice)).append("\n");
    sb.append("    quoteItemRelationship: ").append(toIndentedString(quoteItemRelationship)).append("\n");
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

