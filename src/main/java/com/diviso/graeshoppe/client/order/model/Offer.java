package com.diviso.graeshoppe.client.order.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Offer.
 */

@Document(indexName = "offer")
public class Offer implements Serializable {

    private static final long serialVersionUID = 1L;
    
  
    private Long id;

    private String offerRef;

 
    private Order order;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOfferRef() {
        return offerRef;
    }

    public Offer offerRef(String offerRef) {
        this.offerRef = offerRef;
        return this;
    }

    public void setOfferRef(String offerRef) {
        this.offerRef = offerRef;
    }

    public Order getOrder() {
        return order;
    }

    public Offer order(Order order) {
        this.order = order;
        return this;
    }

    public void setOrder(Order order) {
        this.order = order;
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
        Offer offer = (Offer) o;
        if (offer.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), offer.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Offer{" +
            "id=" + getId() +
            ", offerRef='" + getOfferRef() + "'" +
            "}";
    }
}
