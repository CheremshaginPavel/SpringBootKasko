package com.example.KaskoWebClient.Controller;

import com.example.KaskoWebClient.Model.KaskoAPI.Response.Products;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@Controller
@RestController
public class SampleController {

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
        final String url = "https://testout.sovcomins.ru/casco/cartest/get_products";
        RestTemplate restTemplate = new RestTemplate();
		Products products = restTemplate.getForObject(url, Products.class);
        model.addAttribute("products", products);
        return new ModelAndView("product");
    }
}
