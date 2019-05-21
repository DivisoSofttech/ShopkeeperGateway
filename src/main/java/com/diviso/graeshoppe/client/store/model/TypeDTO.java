package com.diviso.graeshoppe.client.store.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TypeDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-20T12:06:46.420+05:30[Asia/Kolkata]")
@Document(indexName = "type")
public class TypeDTO   {
  @JsonProperty("deliveryInfoId")
  private Long deliveryInfoId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  public TypeDTO deliveryInfoId(Long deliveryInfoId) {
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

  public TypeDTO id(Long id) {
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

  public TypeDTO name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeDTO typeDTO = (TypeDTO) o;
    return Objects.equals(this.deliveryInfoId, typeDTO.deliveryInfoId) &&
        Objects.equals(this.id, typeDTO.id) &&
        Objects.equals(this.name, typeDTO.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryInfoId, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeDTO {\n");
    
    sb.append("    deliveryInfoId: ").append(toIndentedString(deliveryInfoId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

