package com.example.KaskoWebClient.Model;

import java.util.Map;

public class Product {
    private final Integer ID;
    private final String name;
    public Integer getID() { return ID; }
    public String getName() { return name; }
    public Product (Integer ID, String name) {
        this.ID = ID;
        this.name = name;
    }
}
