package com.diviso.graeshoppe.client.order.model;


import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * A ApprovalDetails.
 */
@Entity
@Table(name = "approval_details")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "approvaldetails")
public class ApprovalDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "accepted_at")
    private Instant acceptedAt;

    @Column(name = "expected_delivery")
    private Instant expectedDelivery;

    @Column(name = "decision")
    private String decision;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getAcceptedAt() {
        return acceptedAt;
    }

    public ApprovalDetails acceptedAt(Instant acceptedAt) {
        this.acceptedAt = acceptedAt;
        return this;
    }

    public void setAcceptedAt(Instant acceptedAt) {
        this.acceptedAt = acceptedAt;
    }

    public Instant getExpectedDelivery() {
        return expectedDelivery;
    }

    public ApprovalDetails expectedDelivery(Instant expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
        return this;
    }

    public void setExpectedDelivery(Instant expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
    }

    public String getDecision() {
        return decision;
    }

    public ApprovalDetails decision(String decision) {
        this.decision = decision;
        return this;
    }

    public void setDecision(String decision) {
        this.decision = decision;
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
        ApprovalDetails approvalDetails = (ApprovalDetails) o;
        if (approvalDetails.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), approvalDetails.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ApprovalDetails{" +
            "id=" + getId() +
            ", acceptedAt='" + getAcceptedAt() + "'" +
            ", expectedDelivery='" + getExpectedDelivery() + "'" +
            ", decision='" + getDecision() + "'" +
            "}";
    }
}
