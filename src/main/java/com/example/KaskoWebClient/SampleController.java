package com.example.KaskoWebClient;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SampleController {
    @GetMapping("/sample")
    public String hello() {
        return "sample";
    }

    @GetMapping("/elements")
    public String listContact(Model model) {
        List<String> elements = List.of("element1", "element2", "element3");
        model.addAttribute("elements", elements);
        return "element";
    }

    @GetMapping("/products")
    public String listProduct(Model model) {
        class Product {
            private final String ID_product;
            private final String product_name;
            public String get_ID_product() { return ID_product; }
            public String get_name() { return product_name; }
            public Product (String ID_product, String product_name) {
                this.ID_product = ID_product;
                this.product_name = product_name;
            }
        }

        Product[] prod = new Product[5];

        prod[0] = new Product("123", "bananas");
        prod[1] = new Product("234", "watermelon");
        prod[2] = new Product("577", "grape");
        prod[3] = new Product("12", "cherry");
        prod[4] = new Product("56", "blueberry");

        List<String> elements = List.of(prod[0].get_ID_product(), prod[0].get_name(), prod[1].get_ID_product(),
                prod[1].get_name(), prod[2].get_ID_product(), prod[2].get_name(), prod[3].get_ID_product(),
                prod[3].get_name(), prod[4].get_ID_product(), prod[4].get_name());
        model.addAttribute("elements", elements);
        return "list";
    }
}
