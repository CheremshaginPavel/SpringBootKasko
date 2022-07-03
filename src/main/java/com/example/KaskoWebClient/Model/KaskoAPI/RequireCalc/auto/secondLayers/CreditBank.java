package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.auto.secondLayers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreditBank {

    @JsonProperty("bank_name")
    private String bank_name;

    @JsonProperty("bank_id")
    private String bank_id;

    public CreditBank() {
    }

    public String getBank_name() { return bank_name; }

    public void setBank_name(String bank_name) { this.bank_name = bank_name; }

    public String getBank_id() { return bank_id; }

    public void setBank_id(String bank_id) { this.bank_id = bank_id; }
}
