package com.example.KaskoWebClient.Model.KaskoAPI.ResponseCalc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AutoCalcResponse {
    @JsonProperty("AutoCalcRS")
    private AutoCalcRS autoCalcRS;

    public AutoCalcResponse() {
    }

    public AutoCalcRS getAutoCalcRS() {
        return autoCalcRS;
    }

    public void setAutoCalcRS(AutoCalcRS autoCalcRS) {
        this.autoCalcRS = autoCalcRS;
    }
}
