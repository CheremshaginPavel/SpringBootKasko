package com.example.KaskoWebClient.Model.KaskoAPI.Response;

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

}
