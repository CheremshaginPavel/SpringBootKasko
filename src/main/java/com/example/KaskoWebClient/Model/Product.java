package com.example.KaskoWebClient.Model;

public class Product {
    private final Integer id;
    private final String name;
    public Product (Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Integer getId() { return id; }
    public String getName() { return name; }
}
