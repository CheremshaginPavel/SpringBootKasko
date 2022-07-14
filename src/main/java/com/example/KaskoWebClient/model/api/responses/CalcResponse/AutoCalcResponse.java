package com.example.KaskoWebClient.model.api.responses.CalcResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
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
