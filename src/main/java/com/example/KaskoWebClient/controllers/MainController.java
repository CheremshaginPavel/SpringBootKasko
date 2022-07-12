package com.example.KaskoWebClient.controllers;

import com.example.KaskoWebClient.model.api.requests.CalcRequest.*;
import com.example.KaskoWebClient.model.api.responses.CalcResponse.AutoCalcResponse;
import com.example.KaskoWebClient.model.api.responses.ProductResponse.Products;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class  MainController {
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
    public ModelAndView policy(Model model) throws IOException, ParseException, JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        CollectionVehicles collectionVehicles =
                restTemplate.getForObject
                        ("https://testout.sovcomins.ru/casco/cartest/get_vehicles", CollectionVehicles.class);
        model.addAttribute("collectionVehicles", collectionVehicles);
        model.addAttribute("autoCalcRq", new AutoCalcRq());
        return new ModelAndView("policy");
    }

    @PostMapping("/calc")
    public ModelAndView calculate(Model model, @ModelAttribute("autoCalcRq") AutoCalcRq autoCalcRq) throws
            IOException, ParseException {
        // TODO: вызов KASKO API

        AutoDescription autoDescription = new AutoDescription();
        ModelDescription modelDescription = new ModelDescription();
        CreditBank creditBank = new CreditBank();
        InsuranceDescription insuranceDescription = new InsuranceDescription();

        Price price = new Price();
        price.setCurrency("RUB");
        price.setSum(autoCalcRq.getAuto().getPrice().getSum());
        autoDescription.setPrice(price);
        autoDescription.setRegionId("2");
        creditBank.setBankId("9918113");
        creditBank.setBankName(autoCalcRq.getAuto().getCreditBank().getBankName());
        autoDescription.setCreditBank(creditBank);

        modelDescription.setYear(autoCalcRq.getAuto().getModelDescription().getYear());
        modelDescription.setTsNew(autoCalcRq.getAuto().getModelDescription().getTsNew());
        modelDescription.setMarkId("73");
        modelDescription.setModelId("4759");
        modelDescription.setMarkName(autoCalcRq.getAuto().getModelDescription().getMarkName());
        modelDescription.setHorsepower(autoCalcRq.getAuto().getModelDescription().getHorsepower());
        modelDescription.setModelName(autoCalcRq.getAuto().getModelDescription().getModelName());
        SecurityJa securityJa = new SecurityJa();
        securityJa.setRecommendedPuu(autoCalcRq.getAuto().getModelDescription().getSecurityJa().getRecommendedPuu());
        modelDescription.setSecurityJa(securityJa);
        SterringWheel sterringWheel = new SterringWheel();
        sterringWheel.setSide(autoCalcRq.getAuto().getModelDescription().getSterringWheel().getSide());
        modelDescription.setSterringWheel(sterringWheel);
        autoDescription.setModelDescription(modelDescription);
        autoDescription.setSpecialProgramId(0);
        autoCalcRq.setAuto(autoDescription);
        DriversDescription driversDescription = new DriversDescription();
        Driver driver = new Driver();
        driver.setAge(autoCalcRq.getDrivers().getDriver().getAge());
        driver.setGender(autoCalcRq.getDrivers().getDriver().getGender());
        driver.setResident(autoCalcRq.getDrivers().getDriver().getResident());
        driver.setFlagLink(1);
        driver.setExperience(autoCalcRq.getDrivers().getDriver().getExperience());
        driver.setRegionRegistrationId("2");
        driversDescription.setDriver(driver);
        driversDescription.setMultidrive(false);
        autoCalcRq.setDrivers(driversDescription);
        Insurer insurer = new Insurer();
        insurer.setGender(autoCalcRq.getInsurer().getGender());
        insurer.setLastName(autoCalcRq.getInsurer().getLastName());
        insurer.setFirstName(autoCalcRq.getInsurer().getFirstName());
        insurer.setMiddleName(autoCalcRq.getInsurer().getMiddleName());
        insurer.setDateOfBirth(autoCalcRq.getInsurer().getDateOfBirth());
        autoCalcRq.setInsurer(insurer);

        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        autoCalcRq.setCalcDate(format.format(new Date()));
        autoCalcRq.setCalcType("КАСКО");
        insuranceDescription.setRegion("2");
        insuranceDescription.setKvSize("15");
        insuranceDescription.setFranchise("0");
        insuranceDescription.setProductId("50684");
        insuranceDescription.setDeprecation(false);
        insuranceDescription.setFranchiseId(0);
        insuranceDescription.setTermInsurance(12);
        insuranceDescription.setPaymentPlanId(1);
        insuranceDescription.setSpecialProgram(false);
        insuranceDescription.setReimbursement(2);
        autoCalcRq.setInsurance(insuranceDescription);
        autoCalcRq.setPartnerPin("cartest");
        autoCalcRq.setModelSelection(false);

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        HttpEntity<String> request = new HttpEntity<>(objectMapper.writeValueAsString(autoCalcRq), headers);
        AutoCalcResponse autoCalcResp;

        try {
            autoCalcResp = restTemplate.exchange("https://testout.sovcomins.ru/casco/cartest/calc",
                    HttpMethod.POST,
                    request,
                    AutoCalcResponse.class).getBody();
        } catch (RestClientException e) {
            return new ModelAndView("errorNull");
        }

        if (autoCalcResp.getAutoCalcRS().getErrors() != null && !autoCalcResp.getAutoCalcRS().getErrors().isEmpty()) {
            model.addAttribute("autoCalcResponse", autoCalcResp);
            return new ModelAndView("error");
        }

        String autoCalcRes = objectMapper.writeValueAsString(autoCalcResp);

        model.addAttribute("autoCalcResp", autoCalcResp);
        model.addAttribute("autoCalcRes", autoCalcRes);
        return new ModelAndView("calc");
    }
}
