package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc;

import com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.auto.autoDescription;
import com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.drivers.driversDescription;
import com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.insurance.insuranceDescription;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Properties {

    @JsonProperty("partner_pin")
    private String partner_pin;

    @JsonProperty("calc_type")
    private String calc_type;

    @JsonProperty("calc_date")
    private String calc_date;

    @JsonProperty("model_selection")
    private Boolean model_selection;

    @JsonProperty("factor")
    private String factor;

    @JsonProperty("express_quotation_id")
    private Integer express_quotation_id;

    @JsonProperty("region_id")
    private String region_id;

    @JsonProperty("auto")
    private autoDescription auto;

    @JsonProperty("insurance")
    private insuranceDescription insurance;

    @JsonProperty("drivers")
    private driversDescription drivers;

    public Properties() {
    }

    public String getPartner_pin() { return partner_pin; }

    public void setPartner_pin(String partner_pin) { this.partner_pin = partner_pin; }

    public String getCalc_type() { return calc_type; }

    public void setCalc_type(String calc_type) { this.calc_type = calc_type; }

    public String getCalc_date() { return calc_date; }

    public void setCalc_date(String calc_date) { this.calc_date = calc_date; }

    public Boolean getModel_selection() { return model_selection; }

    public void setModel_selection(Boolean model_section) { this.model_selection = model_section; }

    public Integer getExpress_quotation_id() { return express_quotation_id; }

    public void setExpress_quotation_id(Integer express_quotation_id)
    { this.express_quotation_id = express_quotation_id; }

    public String getRegion_id() { return region_id; }

    public void setRegion_id(String region_id) { this.region_id = region_id; }

    public String getFactor() { return factor; }

    public void setFactor(String factor) { this.factor = factor; }

    public autoDescription getAuto() { return auto; }

    public void setAuto(autoDescription auto) { this.auto = auto; }

    public insuranceDescription getInsurance() { return insurance; }

    public void setInsurance(insuranceDescription insurance) { this.insurance = insurance; }

    public driversDescription getDrivers() { return drivers; }

    public void setDrivers(driversDescription drivers) { this.drivers = drivers; }

}
