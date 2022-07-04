package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Risks {

    @JsonProperty("risk_name")
    private String riskName;

    @JsonProperty("risk")
    private List<Risk> risk;

    public Risks() {
    }

    public String getRiskName() {
        return riskName;
    }

    public void setRiskName(String riskName) {
        this.riskName = riskName;
    }

    public List<Risk> getRisk() {
        return risk;
    }

    public void setRisk(List<Risk> risk) {
        this.risk = risk;
    }
}
