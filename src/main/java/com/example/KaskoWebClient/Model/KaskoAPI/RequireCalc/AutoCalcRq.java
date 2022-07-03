package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AutoCalcRq {
    @JsonProperty("autoCalcRq")
    private Properties properties;

    AutoCalcRq() {
    }

    public void setAutoCalcRq(Properties properties) { this.properties = properties; }

    public Properties getProperties() { return properties; }

}
