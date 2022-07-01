package com.example.KaskoWebClient.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Kasko {
    @JsonProperty("product-id")
    private Integer id;
    @JsonProperty("product-name")
    private String name;
    public Kasko (Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Integer getId() { return id; }
    public String getName() { return name; }
}
