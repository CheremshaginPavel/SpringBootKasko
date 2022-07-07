package com.example.KaskoWebClient.model.api.responses.CalcResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Insurance {

    @JsonProperty("kv_size")
    private Float kvSize;

    @JsonProperty("kv_size_max")
    private Integer kvSizeMax;

    @JsonProperty("term_insurance")
    private Integer term_insurance;

    public Insurance() {
    }

    public Float getKvSize() {
        return kvSize;
    }

    public void setKvSize(Float kvSize) {
        this.kvSize = kvSize;
    }

    public Integer getKvSizeMax() {
        return kvSizeMax;
    }

    public void setKvSizeMax(Integer kvSizeMax) {
        this.kvSizeMax = kvSizeMax;
    }

    public Integer getTerm_insurance() {
        return term_insurance;
    }

    public void setTerm_insurance(Integer term_insurance) {
        this.term_insurance = term_insurance;
    }
}
