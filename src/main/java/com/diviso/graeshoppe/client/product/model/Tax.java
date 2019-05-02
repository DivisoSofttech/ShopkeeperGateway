package com.diviso.graeshoppe.client.product.model;

import java.util.Objects;
import com.diviso.graeshoppe.client.product.model.TaxCategory;
import com.diviso.graeshoppe.client.product.model.TaxType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Tax
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-02T11:06:18.659136500+05:30[Asia/Calcutta]")

public class Tax   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("rate")
  private Double rate = null;

  @JsonProperty("taxCategory")
  private TaxCategory taxCategory = null;

  @JsonProperty("taxTypes")
  @Valid
  private List<TaxType> taxTypes = null;

  public Tax description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Tax id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Tax name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Tax rate(Double rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Get rate
   * @return rate
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }

  public Tax taxCategory(TaxCategory taxCategory) {
    this.taxCategory = taxCategory;
    return this;
  }

  /**
   * Get taxCategory
   * @return taxCategory
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TaxCategory getTaxCategory() {
    return taxCategory;
  }

  public void setTaxCategory(TaxCategory taxCategory) {
    this.taxCategory = taxCategory;
  }

  public Tax taxTypes(List<TaxType> taxTypes) {
    this.taxTypes = taxTypes;
    return this;
  }

  public Tax addTaxTypesItem(TaxType taxTypesItem) {
    if (this.taxTypes == null) {
      this.taxTypes = new ArrayList<TaxType>();
    }
    this.taxTypes.add(taxTypesItem);
    return this;
  }

  /**
   * Get taxTypes
   * @return taxTypes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<TaxType> getTaxTypes() {
    return taxTypes;
  }

  public void setTaxTypes(List<TaxType> taxTypes) {
    this.taxTypes = taxTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tax tax = (Tax) o;
    return Objects.equals(this.description, tax.description) &&
        Objects.equals(this.id, tax.id) &&
        Objects.equals(this.name, tax.name) &&
        Objects.equals(this.rate, tax.rate) &&
        Objects.equals(this.taxCategory, tax.taxCategory) &&
        Objects.equals(this.taxTypes, tax.taxTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, rate, taxCategory, taxTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tax {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    taxCategory: ").append(toIndentedString(taxCategory)).append("\n");
    sb.append("    taxTypes: ").append(toIndentedString(taxTypes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

