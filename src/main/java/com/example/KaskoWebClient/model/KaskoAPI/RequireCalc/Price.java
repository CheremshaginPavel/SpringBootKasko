package com.example.KaskoWebClient.model.KaskoAPI.RequireCalc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Price {

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("sum")
    private String sum;

    public Price() {
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
