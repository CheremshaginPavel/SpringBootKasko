package com.example.KaskoWebClient.model.KaskoAPI.ResponseProduct;

import com.example.KaskoWebClient.model.Product;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Products {
    @JsonProperty("kasko-product")
    private List<Product> products;

    private final String url = "https://testout.sovcomins.ru/casco/cartest/get_products";

    public Products() {
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts (List<Product> products) {
        this.products = products;
    }

    public String getUrl() { return url; }
}
