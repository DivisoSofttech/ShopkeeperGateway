package com.diviso.graeshoppe.shopkeepergateway.client.report.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReportSummary
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-15T09:53:50.027+05:30[Asia/Calcutta]")

public class ReportSummary   {
  @JsonProperty("fromDate")
  private LocalDate fromDate = null;

  @JsonProperty("storeId")
  private String storeId = null;

  @JsonProperty("toDate")
  private LocalDate toDate = null;

  @JsonProperty("typeAllCount")
  private Integer typeAllCount = null;

  @JsonProperty("typeAllTotal")
  private Double typeAllTotal = null;

  @JsonProperty("typeCardCount")
  private Long typeCardCount = null;

  @JsonProperty("typeCardTotal")
  private Double typeCardTotal = null;

  @JsonProperty("typeCashCount")
  private Long typeCashCount = null;

  @JsonProperty("typeCashTotal")
  private Double typeCashTotal = null;

  @JsonProperty("typeCollectionCount")
  private Long typeCollectionCount = null;

  @JsonProperty("typeCollectionTotal")
  private Double typeCollectionTotal = null;

  @JsonProperty("typeDeliveryCount")
  private Long typeDeliveryCount = null;

  @JsonProperty("typeDeliveryTotal")
  private Double typeDeliveryTotal = null;

  public ReportSummary fromDate(LocalDate fromDate) {
    this.fromDate = fromDate;
    return this;
  }

  /**
   * Get fromDate
   * @return fromDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getFromDate() {
    return fromDate;
  }

  public void setFromDate(LocalDate fromDate) {
    this.fromDate = fromDate;
  }

  public ReportSummary storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

  /**
   * Get storeId
   * @return storeId
  **/
  @ApiModelProperty(value = "")


  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public ReportSummary toDate(LocalDate toDate) {
    this.toDate = toDate;
    return this;
  }

  /**
   * Get toDate
   * @return toDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getToDate() {
    return toDate;
  }

  public void setToDate(LocalDate toDate) {
    this.toDate = toDate;
  }

  public ReportSummary typeAllCount(Integer typeAllCount) {
    this.typeAllCount = typeAllCount;
    return this;
  }

  /**
   * Get typeAllCount
   * @return typeAllCount
  **/
  @ApiModelProperty(value = "")


  public Integer getTypeAllCount() {
    return typeAllCount;
  }

  public void setTypeAllCount(Integer typeAllCount) {
    this.typeAllCount = typeAllCount;
  }

  public ReportSummary typeAllTotal(Double typeAllTotal) {
    this.typeAllTotal = typeAllTotal;
    return this;
  }

  /**
   * Get typeAllTotal
   * @return typeAllTotal
  **/
  @ApiModelProperty(value = "")


  public Double getTypeAllTotal() {
    return typeAllTotal;
  }

  public void setTypeAllTotal(Double typeAllTotal) {
    this.typeAllTotal = typeAllTotal;
  }

  public ReportSummary typeCardCount(Long typeCardCount) {
    this.typeCardCount = typeCardCount;
    return this;
  }

  /**
   * Get typeCardCount
   * @return typeCardCount
  **/
  @ApiModelProperty(value = "")


  public Long getTypeCardCount() {
    return typeCardCount;
  }

  public void setTypeCardCount(Long typeCardCount) {
    this.typeCardCount = typeCardCount;
  }

  public ReportSummary typeCardTotal(Double typeCardTotal) {
    this.typeCardTotal = typeCardTotal;
    return this;
  }

  /**
   * Get typeCardTotal
   * @return typeCardTotal
  **/
  @ApiModelProperty(value = "")


  public Double getTypeCardTotal() {
    return typeCardTotal;
  }

  public void setTypeCardTotal(Double typeCardTotal) {
    this.typeCardTotal = typeCardTotal;
  }

  public ReportSummary typeCashCount(Long typeCashCount) {
    this.typeCashCount = typeCashCount;
    return this;
  }

  /**
   * Get typeCashCount
   * @return typeCashCount
  **/
  @ApiModelProperty(value = "")


  public Long getTypeCashCount() {
    return typeCashCount;
  }

  public void setTypeCashCount(Long typeCashCount) {
    this.typeCashCount = typeCashCount;
  }

  public ReportSummary typeCashTotal(Double typeCashTotal) {
    this.typeCashTotal = typeCashTotal;
    return this;
  }

  /**
   * Get typeCashTotal
   * @return typeCashTotal
  **/
  @ApiModelProperty(value = "")


  public Double getTypeCashTotal() {
    return typeCashTotal;
  }

  public void setTypeCashTotal(Double typeCashTotal) {
    this.typeCashTotal = typeCashTotal;
  }

  public ReportSummary typeCollectionCount(Long typeCollectionCount) {
    this.typeCollectionCount = typeCollectionCount;
    return this;
  }

  /**
   * Get typeCollectionCount
   * @return typeCollectionCount
  **/
  @ApiModelProperty(value = "")


  public Long getTypeCollectionCount() {
    return typeCollectionCount;
  }

  public void setTypeCollectionCount(Long typeCollectionCount) {
    this.typeCollectionCount = typeCollectionCount;
  }

  public ReportSummary typeCollectionTotal(Double typeCollectionTotal) {
    this.typeCollectionTotal = typeCollectionTotal;
    return this;
  }

  /**
   * Get typeCollectionTotal
   * @return typeCollectionTotal
  **/
  @ApiModelProperty(value = "")


  public Double getTypeCollectionTotal() {
    return typeCollectionTotal;
  }

  public void setTypeCollectionTotal(Double typeCollectionTotal) {
    this.typeCollectionTotal = typeCollectionTotal;
  }

  public ReportSummary typeDeliveryCount(Long typeDeliveryCount) {
    this.typeDeliveryCount = typeDeliveryCount;
    return this;
  }

  /**
   * Get typeDeliveryCount
   * @return typeDeliveryCount
  **/
  @ApiModelProperty(value = "")


  public Long getTypeDeliveryCount() {
    return typeDeliveryCount;
  }

  public void setTypeDeliveryCount(Long typeDeliveryCount) {
    this.typeDeliveryCount = typeDeliveryCount;
  }

  public ReportSummary typeDeliveryTotal(Double typeDeliveryTotal) {
    this.typeDeliveryTotal = typeDeliveryTotal;
    return this;
  }

  /**
   * Get typeDeliveryTotal
   * @return typeDeliveryTotal
  **/
  @ApiModelProperty(value = "")


  public Double getTypeDeliveryTotal() {
    return typeDeliveryTotal;
  }

  public void setTypeDeliveryTotal(Double typeDeliveryTotal) {
    this.typeDeliveryTotal = typeDeliveryTotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportSummary reportSummary = (ReportSummary) o;
    return Objects.equals(this.fromDate, reportSummary.fromDate) &&
        Objects.equals(this.storeId, reportSummary.storeId) &&
        Objects.equals(this.toDate, reportSummary.toDate) &&
        Objects.equals(this.typeAllCount, reportSummary.typeAllCount) &&
        Objects.equals(this.typeAllTotal, reportSummary.typeAllTotal) &&
        Objects.equals(this.typeCardCount, reportSummary.typeCardCount) &&
        Objects.equals(this.typeCardTotal, reportSummary.typeCardTotal) &&
        Objects.equals(this.typeCashCount, reportSummary.typeCashCount) &&
        Objects.equals(this.typeCashTotal, reportSummary.typeCashTotal) &&
        Objects.equals(this.typeCollectionCount, reportSummary.typeCollectionCount) &&
        Objects.equals(this.typeCollectionTotal, reportSummary.typeCollectionTotal) &&
        Objects.equals(this.typeDeliveryCount, reportSummary.typeDeliveryCount) &&
        Objects.equals(this.typeDeliveryTotal, reportSummary.typeDeliveryTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromDate, storeId, toDate, typeAllCount, typeAllTotal, typeCardCount, typeCardTotal, typeCashCount, typeCashTotal, typeCollectionCount, typeCollectionTotal, typeDeliveryCount, typeDeliveryTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportSummary {\n");
    
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    typeAllCount: ").append(toIndentedString(typeAllCount)).append("\n");
    sb.append("    typeAllTotal: ").append(toIndentedString(typeAllTotal)).append("\n");
    sb.append("    typeCardCount: ").append(toIndentedString(typeCardCount)).append("\n");
    sb.append("    typeCardTotal: ").append(toIndentedString(typeCardTotal)).append("\n");
    sb.append("    typeCashCount: ").append(toIndentedString(typeCashCount)).append("\n");
    sb.append("    typeCashTotal: ").append(toIndentedString(typeCashTotal)).append("\n");
    sb.append("    typeCollectionCount: ").append(toIndentedString(typeCollectionCount)).append("\n");
    sb.append("    typeCollectionTotal: ").append(toIndentedString(typeCollectionTotal)).append("\n");
    sb.append("    typeDeliveryCount: ").append(toIndentedString(typeDeliveryCount)).append("\n");
    sb.append("    typeDeliveryTotal: ").append(toIndentedString(typeDeliveryTotal)).append("\n");
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

