package com.diviso.graeshoppe.client.order.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DeliveryInfo.
 */

@Document(indexName = "deliveryinfo")
public class DeliveryInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Long id;

    private String deliveryType;

    private Double deliveryCharge;

    private String deliveryNotes;


    private Address deliveryAddress;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public DeliveryInfo deliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Double getDeliveryCharge() {
        return deliveryCharge;
    }

    public DeliveryInfo deliveryCharge(Double deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
        return this;
    }

    public void setDeliveryCharge(Double deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }

    public String getDeliveryNotes() {
        return deliveryNotes;
    }

    public DeliveryInfo deliveryNotes(String deliveryNotes) {
        this.deliveryNotes = deliveryNotes;
        return this;
    }

    public void setDeliveryNotes(String deliveryNotes) {
        this.deliveryNotes = deliveryNotes;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public DeliveryInfo deliveryAddress(Address address) {
        this.deliveryAddress = address;
        return this;
    }

    public void setDeliveryAddress(Address address) {
        this.deliveryAddress = address;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeliveryInfo deliveryInfo = (DeliveryInfo) o;
        if (deliveryInfo.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), deliveryInfo.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "DeliveryInfo{" +
            "id=" + getId() +
            ", deliveryType='" + getDeliveryType() + "'" +
            ", deliveryCharge=" + getDeliveryCharge() +
            ", deliveryNotes='" + getDeliveryNotes() + "'" +
            "}";
    }
}
