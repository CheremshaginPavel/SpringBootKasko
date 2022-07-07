package com.example.KaskoWebClient.model.KaskoAPI.ResponseCalc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Payments {

    @JsonProperty("item_id")
    private Integer itemId;

    @JsonProperty("value")
    private String value;

    public Payments() {
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
