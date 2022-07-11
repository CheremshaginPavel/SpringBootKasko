package com.example.KaskoWebClient.controllers;

import com.example.KaskoWebClient.model.api.requests.CalcRequest.*;
import com.example.KaskoWebClient.model.api.responses.CalcResponse.AutoCalcResponse;
import com.example.KaskoWebClient.model.api.responses.ProductResponse.Products;
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
    public ModelAndView policy(Model model) throws IOException, ParseException {
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
        price.setSum("986000");
        autoDescription.setPrice(price);
        autoDescription.setRegionId("2");
        creditBank.setBankId("9918113");
        creditBank.setBankName("Банк");
        autoDescription.setCreditBank(creditBank);

        modelDescription.setYear("2021");
        modelDescription.setTsNew(true);
        modelDescription.setMarkId("73");
        modelDescription.setModelId("4759");
        modelDescription.setMarkName("HYUNDAI");
        modelDescription.setHorsepower("123");
        modelDescription.setModelName("SOLARIS");
        SecurityJa securityJa = new SecurityJa();
        securityJa.setRecommendedPuu(true);
        modelDescription.setSecurityJa(securityJa);
        SterringWheel sterringWheel = new SterringWheel();
        sterringWheel.setSide("LEFT");
        modelDescription.setSterringWheel(sterringWheel);
        autoDescription.setModelDescription(modelDescription);
        autoDescription.setSpecialProgramId(0);
        autoCalcRq.setAuto(autoDescription);
        DriversDescription driversDescription = new DriversDescription();
        Driver driver = new Driver();
        driver.setAge("23");
        driver.setGender("MALE");
        driver.setResident(true);
        driver.setFlagLink(1);
        driver.setExperience("4");
        driver.setRegionRegistrationId("2");
        driversDescription.setDriver(driver);
        driversDescription.setMultidrive(false);
        autoCalcRq.setDrivers(driversDescription);
        Insurer insurer = new Insurer();
        insurer.setGender("MALE");
        insurer.setLastName("Иванов");
        insurer.setFirstName("Иван");
        insurer.setMiddleName("Тестович");
        insurer.setDateOfBirth("1997-10-22");
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

//        autoCalcRq.setPartnerPin("cartest");
//        autoCalcRq.setCalcType("KASKO");
//        autoCalcRq.setCalcDate(new Date());
//        autoCalcRq.setExpressQuotationId("5768484");
//
//        modelDescription.setMarkId("52");
//        modelDescription.setModelId("4908");
//        creditBank.setBankId("137629");
//        autoDescription.setModelDescription(modelDescription);
//        autoDescription.setCreditBank(creditBank);
//        autoDescription.setWarranty("0");
//        autoDescription.setAccidentsLastYear("0");
//        autoDescription.setSpecialProgramId(0);
//        autoCalcRq.setAuto(autoDescription);
//
//        insuranceDescription.setKvSize("0");
//        insuranceDescription.setProductId("17447");
//        insuranceDescription.setContractId("1");
//        insuranceDescription.setTermInsurance(36);
//        insuranceDescription.setSpecialProgram(false);
//        insuranceDescription.setFranchiseId(51);
//        insuranceDescription.setDeprecation(false);
//        insuranceDescription.setReimbursement(2);
//        insuranceDescription.setPaymentPlanId(1);
////        String dateBirth = (String) model.getAttribute("insurer.dateOfBirth");
////        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
////        Date date = sdf.parse(dateBirth);
////        Insurer insurer = new Insurer();
////        insurer.setDateOfBirth(date);
////        autoCalcRq.setInsurer(insurer);
//
//        Risks risks = new Risks();
//        Risk riskChild = new Risk();
//        List<Risk> risk = new ArrayList<>();
//        riskChild.setRiskId(1);
//        riskChild.setBankRequired(false);
//        riskChild.setCodeRequired(false);
//        InsuredSumm insuredSumm = new InsuredSumm();
//        insuredSumm.setSum("1200000");
//        riskChild.setInsuredSumm(insuredSumm);
//        risk.add(0, riskChild);
//
//        riskChild.setRiskId(3);
//        riskChild.setInsuredSumm(insuredSumm);
//
//        risk.add(1, riskChild);
//        risks.setRisk(risk);
//
//        insuranceDescription.setRisks(risks);
//
//        DriversDescription driversDescription = new DriversDescription();
//        driversDescription.setInsurerWorkersFlag(false);
//        driversDescription.setOtherWorkersFlag(false);
//        driversDescription.setOtherMultidriveFlag(true);
//        driversDescription.setMultidrive(false);
//        driversDescription.setMultidriveType(3);
//
//        autoCalcRq.setInsurance(insuranceDescription);
//        autoCalcRq.setDrivers(driversDescription);

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
