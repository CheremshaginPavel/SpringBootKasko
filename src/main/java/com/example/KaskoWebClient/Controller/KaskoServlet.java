package com.example.KaskoWebClient.Controller;

import com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.*;
import com.example.KaskoWebClient.Model.KaskoAPI.ResponseCalc.AutoCalcResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KaskoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        AutoCalcRq autoCalcRq = new AutoCalcRq();
        AutoDescription autoDescription = new AutoDescription();
        ModelDescription modelDescription = new ModelDescription();
        SterringWheel sterringWheel = new SterringWheel();
        Price price = new Price();
        CreditBank creditBank = new CreditBank();
        SecurityJa securityJa = new SecurityJa();
        InsuranceDescription insuranceDescription = new InsuranceDescription();

        modelDescription.setTsNew(Boolean.parseBoolean(req.getParameter("NewTs")));
        modelDescription.setMileAge(req.getParameter("MileAge"));
        modelDescription.setMarkName(req.getParameter("MarkName"));
        modelDescription.setModelName(req.getParameter("ModelName"));
        modelDescription.setHorsepower(req.getParameter("horsepower"));
        modelDescription.setYear(req.getParameter("year"));
        sterringWheel.setSide(req.getParameter("side"));
        modelDescription.setSterringWheel(sterringWheel);
        modelDescription.setMarkId(req.getParameter("markId"));
        modelDescription.setModelId(req.getParameter("modelId"));
        securityJa.setRecommendedPuu(Boolean.parseBoolean(req.getParameter("recommendedPuu")));
        modelDescription.setSecurityJa(securityJa);
        price.setSum(req.getParameter("sum"));
        autoDescription.setRegionId(req.getParameter("regionId"));
        creditBank.setBankId(req.getParameter("bankId"));
        creditBank.setBankName(req.getParameter("BankName"));
        insuranceDescription.setRegion(req.getParameter(""));
        autoDescription.setModelDescription(modelDescription);
        autoDescription.setPrice(price);
        autoDescription.setCreditBank(creditBank);
        autoCalcRq.setAuto(autoDescription);

        autoCalcRq.setPartnerPin("cartest");
        autoCalcRq.setCalcType("KASKO");
        autoCalcRq.setCalcDate(new Date());
        autoCalcRq.setExpressQuotationId(5768484);

        modelDescription.setMarkId("52");
        modelDescription.setModelId("4908");
        modelDescription.setHorsepower("130");
        modelDescription.setYear("2017");

        autoDescription.setWarranty(false);
        autoDescription.setAccidentsLastYear(false);
        autoDescription.setSpecialProgramId("0");

        autoCalcRq.setAuto(autoDescription);



        insuranceDescription.setKvSize("0");
        insuranceDescription.setProductId("17447");
        insuranceDescription.setContractId(1);
        insuranceDescription.setTermInsurance(36);
        insuranceDescription.setSpecialProgram(false);
        insuranceDescription.setFranchiseId(51);
        insuranceDescription.setDeprecation(false);
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

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        HttpEntity<String> request = new HttpEntity<>(objectMapper.writeValueAsString(autoCalcRq), headers);

        AutoCalcResponse response = restTemplate.exchange("https://testout.sovcomins.ru/casco/cartest/calc",
                HttpMethod.POST,
                request,
                AutoCalcResponse.class).getBody();

    }

}
