package com.example.KaskoWebClient.model.api.requests.CalcRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AutoDescription {

    @JsonProperty("territory_id")
    private Integer territoryId;

    @JsonProperty("transit")
    private Boolean transit;

    @JsonProperty("model_description")
    private ModelDescription modelDescription;

    @JsonProperty("price")
    private Price price;

    @JsonProperty("region_id")
    private String regionId;

    @JsonProperty("credit_bank")
    private CreditBank creditBank;

    @JsonProperty("usage_purpose")
    private Integer usagePurpose;

    @JsonProperty("warranty")
    private String warranty;

    @JsonProperty("previous_company")
    private String previousCompany;

    @JsonProperty("accidents_last_year")
    private String accidentsLastYear;

    @JsonProperty("special_program_id")
    private Integer specialProgramId;

    public AutoDescription() {
    }

    public Integer getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(Integer territoryId) {
        this.territoryId = territoryId;
    }

    public Boolean getTransit() {
        return transit;
    }

    public void setTransit(Boolean transit) {
        this.transit = transit;
    }

    public ModelDescription getModelDescription() {
        return modelDescription;
    }

    public void setModelDescription(ModelDescription modelDescription) {
        this.modelDescription = modelDescription;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public CreditBank getCreditBank() {
        return creditBank;
    }

    public void setCreditBank(CreditBank creditBank) {
        this.creditBank = creditBank;
    }

    public Integer getUsagePurpose() {
        return usagePurpose;
    }

    public void setUsagePurpose(Integer usagePurpose) {
        this.usagePurpose = usagePurpose;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getPreviousCompany() {
        return previousCompany;
    }

    public void setPreviousCompany(String previousCompany) {
        this.previousCompany = previousCompany;
    }

    public String getAccidentsLastYear() {
        return accidentsLastYear;
    }

    public void setAccidentsLastYear(String accidentsLastYear) {
        this.accidentsLastYear = accidentsLastYear;
    }

    public Integer getSpecialProgramId() {
        return specialProgramId;
    }

    public void setSpecialProgramId(Integer specialProgramId) {
        this.specialProgramId = specialProgramId;
    }
}
