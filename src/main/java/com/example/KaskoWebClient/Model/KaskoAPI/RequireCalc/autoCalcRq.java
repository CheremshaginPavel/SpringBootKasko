package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class autoCalcRq {
    @JsonProperty("autoCalcRq")
    private List<Properties> properties;

    autoCalcRq() {
    }

    public void setAutoCalcRq(List<Properties> properties) { this.properties = properties; }

    public List<Properties> getProperties() { return properties; }

}
