package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.insurance.secondLayers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Risks {

    @JsonProperty("risk_name")
    private String risk_name;

    @JsonProperty("risk")
    private Risk risk;

    public Risks() {
    }

    public String getRisk_name() { return risk_name; }

    public void setRisk_name(String risk_name) { this.risk_name = risk_name; }

    public Risk getRisk() { return risk; }

    public void setRisk(Risk risk) { this.risk = risk; }
}
