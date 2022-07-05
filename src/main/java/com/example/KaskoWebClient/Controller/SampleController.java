package com.example.KaskoWebClient.Controller;

import com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.*;
import com.example.KaskoWebClient.Model.KaskoAPI.ResponseProduct.Products;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;

//@Controller
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

    @GetMapping("/calc")
    public String calculate(Model model) throws IOException, ParseException {
        AutoCalcRq autoCalcRq = new AutoCalcRq();
        CurrentDate date = new CurrentDate();
//        Date data = new Date();
//        date.setCurrentDate(data);

        autoCalcRq.setPartnerPin("cartest");
        autoCalcRq.setCalcType("KASKO");
        autoCalcRq.setCalcDate(date.getCurrentDate());
        autoCalcRq.setExpressQuotationId(5768484);

        AutoDescription auto = new AutoDescription();
        ModelDescription modelDescription = new ModelDescription();
        modelDescription.setTsNew(true);
        modelDescription.setMileAge("10");
        modelDescription.setMarkId("52");
        modelDescription.setMarkName("FORD");
        modelDescription.setModelId("4908");
        modelDescription.setModelName("FOCUS III 1,6");
        modelDescription.setHorsepower("130");
        modelDescription.setYear("2017");

        SterringWheel sterringWheel = new SterringWheel();
        sterringWheel.setSide("LEFT");
        modelDescription.setSterringWheel(sterringWheel);
        auto.setModelDescription(modelDescription);

        Price price = new Price();
        price.setCurrency("RUB");
        price.setSum("1200000");
        auto.setPrice(price);

        auto.setRegionId("78");

        CreditBank creditBank = new CreditBank();
        creditBank.setBankId("137629");
        creditBank.setBankName("BMW bank (OOO)");
        auto.setCreditBank(creditBank);

        auto.setWarranty(false);
        auto.setAccidentsLastYear(false);
        auto.setSpecialProgramId("0");

        autoCalcRq.setAuto(auto);

        InsuranceDescription insuranceDescription = new InsuranceDescription();

        insuranceDescription.setKvSize("0");
        insuranceDescription.setProductId("17447");
        insuranceDescription.setContractId(1);
        insuranceDescription.setTermInsurance(36);
        insuranceDescription.setSpecialProgram(false);
        insuranceDescription.setFranchiseId(51);
        insuranceDescription.setDeprecation(false);
        insuranceDescription.setRegion("77");
        insuranceDescription.setReimbursement(2);
        insuranceDescription.setPaymentPlanId(1);

        Risks risks = new Risks();
        Risk riskChild = new Risk();
        List<Risk> risk = new ArrayList<>();
        riskChild.setRiskId(1);
        riskChild.setBankRequired(false);
        riskChild.setCodeRequired(false);
        InsuredSumm insuredSumm = new InsuredSumm();
        insuredSumm.setSum("1200000");
        riskChild.setInsuredSumm(insuredSumm);
        risk.add(0, riskChild);

        riskChild.setRiskId(3);
        riskChild.setInsuredSumm(insuredSumm);

        risk.add(1, riskChild);
        risks.setRisk(risk);

        insuranceDescription.setRisks(risks);

        DriversDescription driversDescription = new DriversDescription();
        driversDescription.setTransportUsage(5);
        driversDescription.setInsurerWorkersFlag(false);
        driversDescription.setOtherWorkersFlag(false);
        driversDescription.setOtherMultidriveFlag(true);
        driversDescription.setMultidrive(false);
        driversDescription.setMultidriveType(3);

        Driver driver = new Driver();
        driver.setAge("30");
        driver.setExperience("12");
        driver.setGender("MALE");
        driver.setResident(true);
        driver.setRegionRegistrationId("78");
        driversDescription.setDriver(driver);

        autoCalcRq.setInsurance(insuranceDescription);
        autoCalcRq.setDrivers(driversDescription);

        //HttpHeaders httpHeaders = restTemplate.headForHeaders("http://localhost:8080/calc");
        //Assertions.assertTrue(httpHeaders.getContentType().includes(MediaType.APPLICATION_JSON));

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        HttpEntity<String> request = new HttpEntity<>(objectMapper.writeValueAsString(autoCalcRq), headers);

        String response = restTemplate.exchange("https://testout.sovcomins.ru/casco/cartest/calc",
                HttpMethod.POST,
                request,
                String.class).getBody();

        return(response);
    }
}
