package com.example.KaskoWebClient.model.api.requests.CalcRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class CollectionVehicles {

    @JsonProperty("autoDictJa")
    private List<AutoDictJa> autoDictJa;

    public CollectionVehicles() {
    }

    public List<AutoDictJa> getAutoDictJa() {
        return autoDictJa;
    }

    public void setAutoDictJa(List<AutoDictJa> autoDictJa) {
        this.autoDictJa = autoDictJa;
    }
}
