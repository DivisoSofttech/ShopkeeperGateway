package com.diviso.graeshoppe.client.store.model;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * StoreDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-20T12:06:46.420+05:30[Asia/Kolkata]")
@Document(indexName = "store")
public class StoreDTO   {
  @JsonProperty("closingTime")
  private Instant closingTime = null;

  @JsonProperty("contactNo")
  private Long contactNo = null;

  @JsonProperty("deliveryInfoId")
  private Long deliveryInfoId = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("image")
  private byte[] image = null;

  @JsonProperty("imageContentType")
  private String imageContentType = null;

  @JsonProperty("info")
  private String info = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("openingTime")
  private OffsetDateTime openingTime = null;

  @JsonProperty("propreitorId")
  private Long propreitorId = null;

  @JsonProperty("regNo")
  private String regNo = null;

  @JsonProperty("totalRating")
  private Double totalRating = null;

  public StoreDTO closingTime(Instant closingTime) {
    this.closingTime = closingTime;
    return this;
  }

  /**
   * Get closingTime
   * @return closingTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Instant getClosingTime() {
    return closingTime;
  }

  public void setClosingTime(Instant closingTime) {
    this.closingTime = closingTime;
  }

  public StoreDTO contactNo(Long contactNo) {
    this.contactNo = contactNo;
    return this;
  }

  /**
   * Get contactNo
   * @return contactNo
  **/
  @ApiModelProperty(value = "")


  public Long getContactNo() {
    return contactNo;
  }

  public void setContactNo(Long contactNo) {
    this.contactNo = contactNo;
  }

  public StoreDTO deliveryInfoId(Long deliveryInfoId) {
    this.deliveryInfoId = deliveryInfoId;
    return this;
  }

  /**
   * Get deliveryInfoId
   * @return deliveryInfoId
  **/
  @ApiModelProperty(value = "")


  public Long getDeliveryInfoId() {
    return deliveryInfoId;
  }

  public void setDeliveryInfoId(Long deliveryInfoId) {
    this.deliveryInfoId = deliveryInfoId;
  }

  public StoreDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public StoreDTO id(Long id) {
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

  public StoreDTO image(byte[] image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public StoreDTO imageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
    return this;
  }

  /**
   * Get imageContentType
   * @return imageContentType
  **/
  @ApiModelProperty(value = "")


  public String getImageContentType() {
    return imageContentType;
  }

  public void setImageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
  }

  public StoreDTO info(String info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
  **/
  @ApiModelProperty(value = "")


  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public StoreDTO location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public StoreDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StoreDTO openingTime(OffsetDateTime openingTime) {
    this.openingTime = openingTime;
    return this;
  }

  /**
   * Get openingTime
   * @return openingTime
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getOpeningTime() {
    return openingTime;
  }

  public void setOpeningTime(OffsetDateTime openingTime) {
    this.openingTime = openingTime;
  }

  public StoreDTO propreitorId(Long propreitorId) {
    this.propreitorId = propreitorId;
    return this;
  }

  /**
   * Get propreitorId
   * @return propreitorId
  **/
  @ApiModelProperty(value = "")


  public Long getPropreitorId() {
    return propreitorId;
  }

  public void setPropreitorId(Long propreitorId) {
    this.propreitorId = propreitorId;
  }

  public StoreDTO regNo(String regNo) {
    this.regNo = regNo;
    return this;
  }

  /**
   * Get regNo
   * @return regNo
  **/
  @ApiModelProperty(value = "")


  public String getRegNo() {
    return regNo;
  }

  public void setRegNo(String regNo) {
    this.regNo = regNo;
  }

  public StoreDTO totalRating(Double totalRating) {
    this.totalRating = totalRating;
    return this;
  }

  /**
   * Get totalRating
   * @return totalRating
  **/
  @ApiModelProperty(value = "")


  public Double getTotalRating() {
    return totalRating;
  }

  public void setTotalRating(Double totalRating) {
    this.totalRating = totalRating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreDTO storeDTO = (StoreDTO) o;
    return Objects.equals(this.closingTime, storeDTO.closingTime) &&
        Objects.equals(this.contactNo, storeDTO.contactNo) &&
        Objects.equals(this.deliveryInfoId, storeDTO.deliveryInfoId) &&
        Objects.equals(this.email, storeDTO.email) &&
        Objects.equals(this.id, storeDTO.id) &&
        Objects.equals(this.image, storeDTO.image) &&
        Objects.equals(this.imageContentType, storeDTO.imageContentType) &&
        Objects.equals(this.info, storeDTO.info) &&
        Objects.equals(this.location, storeDTO.location) &&
        Objects.equals(this.name, storeDTO.name) &&
        Objects.equals(this.openingTime, storeDTO.openingTime) &&
        Objects.equals(this.propreitorId, storeDTO.propreitorId) &&
        Objects.equals(this.regNo, storeDTO.regNo) &&
        Objects.equals(this.totalRating, storeDTO.totalRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closingTime, contactNo, deliveryInfoId, email, id, image, imageContentType, info, location, name, openingTime, propreitorId, regNo, totalRating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreDTO {\n");
    
    sb.append("    closingTime: ").append(toIndentedString(closingTime)).append("\n");
    sb.append("    contactNo: ").append(toIndentedString(contactNo)).append("\n");
    sb.append("    deliveryInfoId: ").append(toIndentedString(deliveryInfoId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageContentType: ").append(toIndentedString(imageContentType)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openingTime: ").append(toIndentedString(openingTime)).append("\n");
    sb.append("    propreitorId: ").append(toIndentedString(propreitorId)).append("\n");
    sb.append("    regNo: ").append(toIndentedString(regNo)).append("\n");
    sb.append("    totalRating: ").append(toIndentedString(totalRating)).append("\n");
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

