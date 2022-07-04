package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc;

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
    private Boolean warranty;

    @JsonProperty("previous_company")
    private String previousCompany;

    @JsonProperty("accidents_last_year")
    private Boolean accidentsLastYear;

    @JsonProperty("special_program_id")
    private String specialProgramId;

    public AutoDescription() {
    }

    public Integer getTerritory_id() { return territoryId; }

    public void setTerritory_id(Integer territoryId) { this.territoryId = territoryId; }

    public Boolean getTransit() { return transit; }

    public void setTransit(Boolean transit) { this.transit = transit; }

    public ModelDescription getModel_description() { return modelDescription; }

    public void setModel_description(ModelDescription modelDescription)
    { this.modelDescription = modelDescription; }

    public Price getPrice() { return price; }

    public void setPrice(Price price) { this.price = price; }

    public String getRegion_id() { return regionId; }

    public void setRegion_id(String regionId) { this.regionId = regionId; }

    public CreditBank getCredit_bank() { return creditBank; }

    public void setCredit_bank(CreditBank creditBank) { this.creditBank = creditBank; }

    public Integer getUsage_purpose() { return usagePurpose; }

    public void setUsage_purpose(Integer usagePurpose) { this.usagePurpose = usagePurpose; }

    public Boolean getWarranty() { return warranty; }

    public void setWarranty(Boolean warranty) { this.warranty = warranty; }

    public String getPrevious_company() { return previousCompany; }

    public void setPrevious_company(String previousCompany) { this.previousCompany = previousCompany; }

    public Boolean getAccidents_last_year() { return accidentsLastYear; }

    public void setAccidents_last_year(Boolean accidentsLastYear)
    { this.accidentsLastYear = accidentsLastYear; }

    public String getSpecial_program_id() { return specialProgramId; }

    public void setSpecial_program_id(String specialProgramId)
    { this.specialProgramId = specialProgramId; }

}
