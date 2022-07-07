package com.example.KaskoWebClient.model.api.responses.CalcResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChangedConditions {

    @JsonProperty("term_insurance")
    private Integer term_insurance;

    @JsonProperty("payments")
    private Payments payments;

    public ChangedConditions() {
    }

    public Integer getTerm_insurance() {
        return term_insurance;
    }

    public void setTerm_insurance(Integer term_insurance) {
        this.term_insurance = term_insurance;
    }

    public Payments getPayments() {
        return payments;
    }

    public void setPayments(Payments payments) {
        this.payments = payments;
    }
}
