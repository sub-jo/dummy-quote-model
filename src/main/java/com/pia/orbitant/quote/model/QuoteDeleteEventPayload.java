package com.pia.orbitant.quote.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pia.orbitant.quote.model.Quote;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The event data structure
 */

@Schema(name = "QuoteDeleteEventPayload", description = "The event data structure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.4.0")
public class QuoteDeleteEventPayload implements Serializable {

  private static final long serialVersionUID = 1L;

  private Quote quote;

  public QuoteDeleteEventPayload quote(Quote quote) {
    this.quote = quote;
    return this;
  }

  /**
   * Get quote
   * @return quote
  */
  @Valid 
  @Schema(name = "quote", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quote")
  public Quote getQuote() {
    return quote;
  }

  public void setQuote(Quote quote) {
    this.quote = quote;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteDeleteEventPayload quoteDeleteEventPayload = (QuoteDeleteEventPayload) o;
    return Objects.equals(this.quote, quoteDeleteEventPayload.quote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteDeleteEventPayload {\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
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

