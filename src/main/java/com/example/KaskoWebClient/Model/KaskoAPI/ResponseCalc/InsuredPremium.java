package com.example.KaskoWebClient.Model.KaskoAPI.ResponseCalc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InsuredPremium {

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("sum")
    private Long sum;

    public InsuredPremium() {
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
