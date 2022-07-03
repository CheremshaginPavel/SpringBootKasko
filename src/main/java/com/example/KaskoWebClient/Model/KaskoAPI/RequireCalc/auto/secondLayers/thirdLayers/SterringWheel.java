package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.auto.secondLayers.thirdLayers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SterringWheel {

    @JsonProperty("side")
    private String side;

    SterringWheel() {
    }

    public String getSide() { return side; }

    public void setSide(String side) { this.side = side; }
}
