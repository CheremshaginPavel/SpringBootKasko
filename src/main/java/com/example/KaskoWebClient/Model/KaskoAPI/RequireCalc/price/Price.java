package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.price;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Price {

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("sum")
    private String sum;

    public Price() {
    }

    public String getCurrency() { return currency; }

    public void setCurrency(String currency) { this.currency = currency; }

    public String getSum() { return sum; }

    public void setSum(String sum) { this.sum = sum; }

}
