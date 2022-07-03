package com.example.KaskoWebClient.Model.KaskoAPI.ResponseProduct;

import com.example.KaskoWebClient.Model.Product;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Products {
    @JsonProperty("kasko-product")
    private List<Product> products;

    public Products() {
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts (List<Product> products) {
        this.products = products;
    }

}
