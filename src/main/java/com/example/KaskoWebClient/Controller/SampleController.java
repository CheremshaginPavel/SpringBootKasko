package com.example.KaskoWebClient.Controller;

import com.example.KaskoWebClient.Model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.Map;

@Controller
public class SampleController {

    final static Map<Integer, Product> ELEMENTS = Map.of(1, new Product(123, "bananas"),
            2, new Product(234, "watermelon"),
            3, new Product(577, "grape"),
            4, new Product(12, "cherry"),
            5, new Product(56, "blueberry"));

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
        model.addAttribute("ELEMENTS", ELEMENTS);
        return "product";
    }
}
