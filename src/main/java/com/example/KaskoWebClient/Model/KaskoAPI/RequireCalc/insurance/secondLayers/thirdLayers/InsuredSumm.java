package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.insurance.secondLayers.thirdLayers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InsuredSumm {

    @JsonProperty("sum")
    private String sum;

    public InsuredSumm() {
    }

    public String getSum() { return sum; }

    public void setSum(String sum) { this.sum = sum; }
}
