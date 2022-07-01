package com.example.KaskoWebClient.Controller;

import com.example.KaskoWebClient.Model.KaskoAPI.Response.Products;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.io.IOException;
import java.util.List;

@Controller
@RestController
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
    public String listProduct(Model model) throws IOException {
        final String url = "https://testout.sovcomins.ru/casco/cartest/get_products";
        RestTemplate restTemplate = new RestTemplate();
		Products products = restTemplate.getForObject(url, Products.class);
        model.addAttribute("products", products);
        return "product";
    }
}
