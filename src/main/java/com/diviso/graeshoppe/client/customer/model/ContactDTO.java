package com.diviso.graeshoppe.client.customer.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContactDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-02T11:06:23.898839200+05:30[Asia/Calcutta]")

public class ContactDTO   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("mobileNumber")
  private String mobileNumber = null;

  @JsonProperty("telephone")
  private String telephone = null;

  public ContactDTO id(Long id) {
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

  public ContactDTO mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * Get mobileNumber
   * @return mobileNumber
  **/
  @ApiModelProperty(value = "")


  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public ContactDTO telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

  /**
   * Get telephone
   * @return telephone
  **/
  @ApiModelProperty(value = "")


  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactDTO contactDTO = (ContactDTO) o;
    return Objects.equals(this.id, contactDTO.id) &&
        Objects.equals(this.mobileNumber, contactDTO.mobileNumber) &&
        Objects.equals(this.telephone, contactDTO.telephone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mobileNumber, telephone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
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

