package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.auto;

import com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.auto.secondLayers.CreditBank;
import com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.auto.secondLayers.ModelDescription;
import com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.price.Price;
import com.fasterxml.jackson.annotation.JsonProperty;

public class autoDescription {

    @JsonProperty("territory_id")
    private Integer territory_id;

    @JsonProperty("transit")
    private Boolean transit;

    @JsonProperty("model_description")
    private ModelDescription model_description;

    @JsonProperty("price")
    private Price price;

    @JsonProperty("region_id")
    private String region_id;

    @JsonProperty("credit_bank")
    private CreditBank credit_bank;

    @JsonProperty("usage_purpose")
    private Integer usage_purpose;

    @JsonProperty("warranty")
    private Boolean warranty;

    @JsonProperty("previous_company")
    private String previous_company;

    @JsonProperty("accidents_last_year")
    private Boolean accidents_last_year;

    @JsonProperty("special_program_id")
    private String special_program_id;

    public autoDescription() {
    }

    public Integer getTerritory_id() { return territory_id; }

    public void setTerritory_id(Integer territory_id) { this.territory_id = territory_id; }

    public Boolean getTransit() { return transit; }

    public void setTransit(Boolean transit) { this.transit = transit; }

    public ModelDescription getModel_description() { return model_description; }

    public void setModel_description(ModelDescription model_description)
    { this.model_description = model_description; }

    public Price getPrice() { return price; }

    public void setPrice(Price price) { this.price = price; }

    public String getRegion_id() { return region_id; }

    public void setRegion_id(String region_id) { this.region_id = region_id; }

    public CreditBank getCredit_bank() { return credit_bank; }

    public void setCredit_bank(CreditBank credit_bank) { this.credit_bank = credit_bank; }

    public Integer getUsage_purpose() { return usage_purpose; }

    public void setUsage_purpose(Integer usage_purpose) { this.usage_purpose = usage_purpose; }

    public Boolean getWarranty() { return warranty; }

    public void setWarranty(Boolean warranty) { this.warranty = warranty; }

    public String getPrevious_company() { return previous_company; }

    public void setPrevious_company(String previous_company) { this.previous_company = previous_company; }

    public Boolean getAccidents_last_year() { return accidents_last_year; }

    public void setAccidents_last_year(Boolean accidents_last_year)
    { this.accidents_last_year = accidents_last_year; }

    public String getSpecial_program_id() { return special_program_id; }

    public void setSpecial_program_id(String special_program_id)
    { this.special_program_id = special_program_id; }

}
