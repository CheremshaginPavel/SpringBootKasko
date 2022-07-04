package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("autoCalcRq")
public class AutoCalcRq {

    @JsonProperty("partner_pin")
    private String partnerPin;

    @JsonProperty("calc_type")
    private String calcType;

    @JsonProperty("calc_date")
    private String calcDate;

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

    public AutoCalcRq() {
    }

    public String getPartner_pin() { return partnerPin; }

    public void setPartner_pin(String partnerPin) { this.partnerPin = partnerPin; }

    public String getCalc_type() { return calcType; }

    public void setCalc_type(String calcType) { this.calcType = calcType; }

    public String getCalc_date() { return calcDate; }

    public void setCalc_date(String calcDate) { this.calcDate = calcDate; }

    public Boolean getModel_selection() { return modelSelection; }

    public void setModel_selection(Boolean modelSection) { this.modelSelection = modelSection; }

    public Integer getExpress_quotation_id() { return expressQuotationId; }

    public void setExpress_quotation_id(Integer expressQuotationId)
    { this.expressQuotationId = expressQuotationId; }

    public String getRegion_id() { return regionId; }

    public void setRegion_id(String regionId) { this.regionId = regionId; }

    public String getFactor() { return factor; }

    public void setFactor(String factor) { this.factor = factor; }

    public AutoDescription getAuto() { return auto; }

    public void setAuto(AutoDescription auto) { this.auto = auto; }

    public InsuranceDescription getInsurance() { return insurance; }

    public void setInsurance(InsuranceDescription insurance) { this.insurance = insurance; }

    public DriversDescription getDrivers() { return drivers; }

    public void setDrivers(DriversDescription drivers) { this.drivers = drivers; }

}
