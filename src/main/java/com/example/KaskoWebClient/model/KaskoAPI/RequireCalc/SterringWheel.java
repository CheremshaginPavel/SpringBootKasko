package com.example.KaskoWebClient.model.KaskoAPI.RequireCalc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SterringWheel {

    @JsonProperty("side")
    private String side;

    public SterringWheel() {
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }
}
