package com.diviso.graeshoppe.shopkeepergateway.client.report.model;

import java.util.Objects;
import com.diviso.graeshoppe.shopkeepergateway.client.report.model.OrderMaster;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ReportSummary
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-01T15:31:36.359+05:30[Asia/Calcutta]")

public class ReportSummary   {
  @JsonProperty("collectionCard")
  @Valid
  private List<OrderMaster> collectionCard = null;

  @JsonProperty("collectionCash")
  @Valid
  private List<OrderMaster> collectionCash = null;

  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("deliveryCard")
  @Valid
  private List<OrderMaster> deliveryCard = null;

  @JsonProperty("deliveryCash")
  @Valid
  private List<OrderMaster> deliveryCash = null;

  @JsonProperty("storeId")
  private String storeId = null;

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

  public ReportSummary collectionCard(List<OrderMaster> collectionCard) {
    this.collectionCard = collectionCard;
    return this;
  }

  public ReportSummary addCollectionCardItem(OrderMaster collectionCardItem) {
    if (this.collectionCard == null) {
      this.collectionCard = new ArrayList<OrderMaster>();
    }
    this.collectionCard.add(collectionCardItem);
    return this;
  }

  /**
   * Get collectionCard
   * @return collectionCard
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderMaster> getCollectionCard() {
    return collectionCard;
  }

  public void setCollectionCard(List<OrderMaster> collectionCard) {
    this.collectionCard = collectionCard;
  }

  public ReportSummary collectionCash(List<OrderMaster> collectionCash) {
    this.collectionCash = collectionCash;
    return this;
  }

  public ReportSummary addCollectionCashItem(OrderMaster collectionCashItem) {
    if (this.collectionCash == null) {
      this.collectionCash = new ArrayList<OrderMaster>();
    }
    this.collectionCash.add(collectionCashItem);
    return this;
  }

  /**
   * Get collectionCash
   * @return collectionCash
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderMaster> getCollectionCash() {
    return collectionCash;
  }

  public void setCollectionCash(List<OrderMaster> collectionCash) {
    this.collectionCash = collectionCash;
  }

  public ReportSummary date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public ReportSummary deliveryCard(List<OrderMaster> deliveryCard) {
    this.deliveryCard = deliveryCard;
    return this;
  }

  public ReportSummary addDeliveryCardItem(OrderMaster deliveryCardItem) {
    if (this.deliveryCard == null) {
      this.deliveryCard = new ArrayList<OrderMaster>();
    }
    this.deliveryCard.add(deliveryCardItem);
    return this;
  }

  /**
   * Get deliveryCard
   * @return deliveryCard
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderMaster> getDeliveryCard() {
    return deliveryCard;
  }

  public void setDeliveryCard(List<OrderMaster> deliveryCard) {
    this.deliveryCard = deliveryCard;
  }

  public ReportSummary deliveryCash(List<OrderMaster> deliveryCash) {
    this.deliveryCash = deliveryCash;
    return this;
  }

  public ReportSummary addDeliveryCashItem(OrderMaster deliveryCashItem) {
    if (this.deliveryCash == null) {
      this.deliveryCash = new ArrayList<OrderMaster>();
    }
    this.deliveryCash.add(deliveryCashItem);
    return this;
  }

  /**
   * Get deliveryCash
   * @return deliveryCash
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderMaster> getDeliveryCash() {
    return deliveryCash;
  }

  public void setDeliveryCash(List<OrderMaster> deliveryCash) {
    this.deliveryCash = deliveryCash;
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
    return Objects.equals(this.collectionCard, reportSummary.collectionCard) &&
        Objects.equals(this.collectionCash, reportSummary.collectionCash) &&
        Objects.equals(this.date, reportSummary.date) &&
        Objects.equals(this.deliveryCard, reportSummary.deliveryCard) &&
        Objects.equals(this.deliveryCash, reportSummary.deliveryCash) &&
        Objects.equals(this.storeId, reportSummary.storeId) &&
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
    return Objects.hash(collectionCard, collectionCash, date, deliveryCard, deliveryCash, storeId, typeAllCount, typeAllTotal, typeCardCount, typeCardTotal, typeCashCount, typeCashTotal, typeCollectionCount, typeCollectionTotal, typeDeliveryCount, typeDeliveryTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportSummary {\n");
    
    sb.append("    collectionCard: ").append(toIndentedString(collectionCard)).append("\n");
    sb.append("    collectionCash: ").append(toIndentedString(collectionCash)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    deliveryCard: ").append(toIndentedString(deliveryCard)).append("\n");
    sb.append("    deliveryCash: ").append(toIndentedString(deliveryCash)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
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

