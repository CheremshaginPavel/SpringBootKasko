package com.example.KaskoWebClient.controllers;

import com.example.KaskoWebClient.model.api.requests.CalcRequest.AutoCalcRq;
import com.example.KaskoWebClient.model.api.responses.CalcResponse.AutoCalcRS;
import com.example.KaskoWebClient.model.api.responses.ProductResponse.Products;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.text.ParseException;

@RestController
public class MainController {
    private final ObjectMapper objectMapper = new ObjectMapper();

    // TODO: Убрать, эндпоинт создан для примера работы с KASKO API
    @GetMapping("/products")
    public ModelAndView listProduct(Model model) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
		Products products = new Products();
        products = restTemplate.getForObject(products.getUrl(), Products.class);
        model.addAttribute("products", products);
        return new ModelAndView("product");
    }

    @GetMapping("/policy")
    public ModelAndView policy(Model model) throws IOException, ParseException {
        model.addAttribute("autoCalcRq", new AutoCalcRq());
        return new ModelAndView("policy");
    }

    @PostMapping("/calc")
    public ModelAndView calculate(Model model, @ModelAttribute("autoCalcRq") AutoCalcRq autoCalcRq) throws IOException, ParseException {
        // TODO: вызов KASKO API

        AutoCalcRS autoCalcRs = new AutoCalcRS();
        autoCalcRs.setCalcType("Данные из формы - regionId = " + autoCalcRq.getAuto().getRegionId());

        model.addAttribute("autoCalcRs", autoCalcRs);
        return new ModelAndView("calc");
    }
}
