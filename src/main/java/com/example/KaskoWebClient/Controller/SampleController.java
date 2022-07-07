package com.example.KaskoWebClient.Controller;

import com.example.KaskoWebClient.model.KaskoAPI.ResponseProduct.Products;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

@RestController
public class SampleController {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping("/sample")
    public ModelAndView hello() {
        return new ModelAndView("sample");
    }

    @GetMapping("/elements")
    public ModelAndView listContact(Model model) {
        List<String> elements = List.of("element1", "element2", "element3");
        model.addAttribute("elements", elements);
        return new ModelAndView("element");
    }

    @GetMapping("/products")
    public ModelAndView listProduct(Model model) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
		Products products = new Products();
        products = restTemplate.getForObject(products.getUrl(), Products.class);
        model.addAttribute("products", products);
        return new ModelAndView("product");
    }

    @PostMapping("/calc")
    public ModelAndView calculate(Model model) throws IOException, ParseException {
        return new ModelAndView("policy");
    }

}
