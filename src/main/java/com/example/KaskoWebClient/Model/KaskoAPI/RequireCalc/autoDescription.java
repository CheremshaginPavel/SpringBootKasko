package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class autoDescription {

    @JsonProperty("model_description")
    private modelDescription model_description;

    @JsonProperty("price")
    private Price price;

    @JsonProperty("region_id")
    private String region_id;

    @JsonProperty("credit_bank")
    private Bank credit_bank;

    @JsonProperty("warranty")
    private Boolean warranty;

    @JsonProperty("accidents_last_year")
    private Boolean accidents_last_year;

    @JsonProperty("special_program_id")
    private String special_program_id;

    public autoDescription() {
    }

    public modelDescription getModel_description() { return model_description; }

    public void setModel_description(modelDescription model_description)
    { this.model_description = model_description; }

    public Price getPrice() { return price; }

    public void setPrice(Price price) { this.price = price; }

    public String getRegion_id() { return region_id; }

    public void setRegion_id(String region_id) { this.region_id = region_id; }

    public Bank getCredit_bank() { return credit_bank; }

    public void setCredit_bank(Bank credit_bank) { this.credit_bank = credit_bank; }

    public Boolean getWarranty() { return warranty; }

    public void setWarranty(Boolean warranty) { this.warranty = warranty; }

    public Boolean getAccidents_last_year() { return accidents_last_year; }

    public void setAccidents_last_year(Boolean accidents_last_year)
    { this.accidents_last_year = accidents_last_year; }

    public String getSpecial_program_id() { return special_program_id; }

    public void setSpecial_program_id(String special_program_id)
    { this.special_program_id = special_program_id; }

}
