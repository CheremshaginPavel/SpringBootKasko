package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreditBank {

    @JsonProperty("bank_name")
    private String bankName;

    @JsonProperty("bank_id")
    private String bankId;

    public CreditBank() {
    }

    public String getBank_name() { return bankName; }

    public void setBank_name(String bank_name) { this.bankName = bankName; }

    public String getBank_id() { return bankId; }

    public void setBank_id(String bankId) { this.bankId = bankId; }
}
