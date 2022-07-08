package com.example.KaskoWebClient.model.api.requests.CalcRequest;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Date;

@JsonRootName("autoCalcRq")
public class AutoCalcRq {

    @JsonProperty("partner_pin")
    private String partnerPin;

    @JsonProperty("calc_type")
    private String calcType;

    @JsonProperty("calc_date")
    @JsonFormat(pattern="dd.MM.yyyy HH:mm:ss")
    private Date calcDate;

    @JsonProperty("model_selection")
    private Boolean modelSelection;

    @JsonProperty("factor")
    private String factor;

    @JsonProperty("express_quotation_id")
    private Integer expressQuotationId;

    @JsonProperty("region_id")
    private String regionId;

    @JsonProperty("auto")
    private AutoDescription auto;

    @JsonProperty("insurance")
    private InsuranceDescription insurance;

    @JsonProperty("drivers")
    private DriversDescription drivers;

    @JsonProperty("insurer")
    private Insurer insurer;

    public AutoCalcRq() {
    }

    public String getPartnerPin() {
        return partnerPin;
    }

    public void setPartnerPin(String partnerPin) {
        this.partnerPin = partnerPin;
    }

    public String getCalcType() {
        return calcType;
    }

    public void setCalcType(String calcType) {
        this.calcType = calcType;
    }

    public Date getCalcDate() {
        return calcDate;
    }

    public void setCalcDate(Date calcDate) {
        this.calcDate = calcDate;
    }

    public Boolean getModelSelection() {
        return modelSelection;
    }

    public void setModelSelection(Boolean modelSelection) {
        this.modelSelection = modelSelection;
    }

    public String getFactor() {
        return factor;
    }

    public void setFactor(String factor) {
        this.factor = factor;
    }

    public Integer getExpressQuotationId() {
        return expressQuotationId;
    }

    public void setExpressQuotationId(Integer expressQuotationId) {
        this.expressQuotationId = expressQuotationId;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public AutoDescription getAuto() {
        return auto;
    }

    public void setAuto(AutoDescription auto) {
        this.auto = auto;
    }

    public InsuranceDescription getInsurance() {
        return insurance;
    }

    public void setInsurance(InsuranceDescription insurance) {
        this.insurance = insurance;
    }

    public DriversDescription getDrivers() {
        return drivers;
    }

    public void setDrivers(DriversDescription drivers) {
        this.drivers = drivers;
    }

    public Insurer getInsurer() {
        return insurer;
    }

    public void setInsurer(Insurer insurer) {
        this.insurer = insurer;
    }
}
