package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Risks {

    @JsonProperty("risk_name")
    private String riskName;

    @JsonProperty("risk")
    private Risk risk;

    public Risks() {
    }

    public String getRisk_name() { return riskName; }

    public void setRisk_name(String riskName) { this.riskName = riskName; }

    public Risk getRisk() { return risk; }

    public void setRisk(Risk risk) { this.risk = risk; }
}
