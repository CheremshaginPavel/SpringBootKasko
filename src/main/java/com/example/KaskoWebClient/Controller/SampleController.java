package com.example.KaskoWebClient.Controller;

import com.example.KaskoWebClient.Model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SampleController {

    static Product[] products = new Product[5];

    static {
        products[0] = new Product(123, "bananas");
        products[1] = new Product(234, "watermelon");
        products[2] = new Product(577, "grape");
        products[3] = new Product(12, "cherry");
        products[4] = new Product(56, "blueberry");
    }

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
        Map<Integer, String> elements = new HashMap<>();
        elements.put(products[0].getID(), products[0].getName());
        elements.put(products[1].getID(), products[1].getName());
        elements.put(products[2].getID(), products[2].getName());
        elements.put(products[3].getID(), products[3].getName());
        elements.put(products[4].getID(), products[4].getName());
        model.addAttribute("elements", elements);
        return "product";
    }
}
