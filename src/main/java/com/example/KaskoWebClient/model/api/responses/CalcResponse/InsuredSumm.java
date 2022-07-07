package com.example.KaskoWebClient.model.api.responses.CalcResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InsuredSumm {

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("sum")
    private Long sum;

    public  InsuredSumm() {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }
}
