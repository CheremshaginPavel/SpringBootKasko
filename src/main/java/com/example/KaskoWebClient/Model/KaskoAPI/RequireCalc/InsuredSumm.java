package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InsuredSumm {

    @JsonProperty("sum")
    private String sum;

    public InsuredSumm() {
    }

    public String getSum() { return sum; }

    public void setSum(String sum) { this.sum = sum; }
}
