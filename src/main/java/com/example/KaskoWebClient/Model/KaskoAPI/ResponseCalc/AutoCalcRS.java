package com.example.KaskoWebClient.Model.KaskoAPI.ResponseCalc;

import com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.InsuranceDescription;
import com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.Options;
import com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.Risks;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AutoCalcRS {

    @JsonProperty("transit")
    private Boolean transit;

    @JsonProperty("tachograph")
    private Boolean tachograph;

    @JsonProperty("territory_id")
    private Integer territoryId;

    @JsonProperty("model_id")
    private String modelId;

    @JsonProperty("mark_id")
    private String markId;

    @JsonProperty("mark_name")
    private String markName;

    @JsonProperty("model_name")
    private String modelName;

    @JsonProperty("prefix_com_ts_id")
    private Integer prefixComTsId;

    @JsonProperty("prefix_com_ts_name")
    private String prefixComTsName;

    @JsonProperty("type_com_ts_id")
    private Integer typeComTsId;

    @JsonProperty("type_com_ts_name")
    private String typeComTsName;

    @JsonProperty("category")
    private String category;

    @JsonProperty("another_mm")
    private Boolean anotherMm;

    @JsonProperty("another_mark_name")
    private String anotherMarkName;

    @JsonProperty("another_model_name")
    private String anotherModelName;

    @JsonProperty("manufacturer")
    private String manufacturer;

    @JsonProperty("calc_type")
    private String calcType;

    @JsonProperty("calc_date")
    @JsonFormat(pattern="dd.MM.yyyy HH:mm:ss")
    private Date calcDate;

    @JsonProperty("total_summ")
    private TotalSumm totalSumm;

    @JsonProperty("risks")
    private Risks risks;

    @JsonProperty("options")
    private Options options;

    @JsonProperty("insurance")
    private InsuranceDescription insuranceDescription;

    @JsonProperty("factor")
    private Boolean factor;

    @JsonProperty("warnings")
    private Warnings warnings;

    @JsonProperty("changed_conditions")
    private String changedConditions;

    @JsonProperty("express_quotation_id")
    private String expressQuotationId;

    @JsonProperty("express_quotation_url")
    private String express_quotation_url;

    @JsonProperty("calculation_id")
    private Long calculationId;

    @JsonProperty("errors")
    private Errors errors;

    public AutoCalcRS() {
    }

    public Boolean getTransit() {
        return transit;
    }

    public void setTransit(Boolean transit) {
        this.transit = transit;
    }

    public Boolean getTachograph() {
        return tachograph;
    }

    public void setTachograph(Boolean tachograph) {
        this.tachograph = tachograph;
    }

    public Integer getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(Integer territoryId) {
        this.territoryId = territoryId;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getMarkId() {
        return markId;
    }

    public void setMarkId(String markId) {
        this.markId = markId;
    }

    public String getMarkName() {
        return markName;
    }

    public void setMarkName(String markName) {
        this.markName = markName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getPrefixComTsId() {
        return prefixComTsId;
    }

    public void setPrefixComTsId(Integer prefixComTsId) {
        this.prefixComTsId = prefixComTsId;
    }

    public String getPrefixComTsName() {
        return prefixComTsName;
    }

    public void setPrefixComTsName(String prefixComTsName) {
        this.prefixComTsName = prefixComTsName;
    }

    public Integer getTypeComTsId() {
        return typeComTsId;
    }

    public void setTypeComTsId(Integer typeComTsId) {
        this.typeComTsId = typeComTsId;
    }

    public String getTypeComTsName() {
        return typeComTsName;
    }

    public void setTypeComTsName(String typeComTsName) {
        this.typeComTsName = typeComTsName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getAnotherMm() {
        return anotherMm;
    }

    public void setAnotherMm(Boolean anotherMm) {
        this.anotherMm = anotherMm;
    }

    public String getAnotherMarkName() {
        return anotherMarkName;
    }

    public void setAnotherMarkName(String anotherMarkName) {
        this.anotherMarkName = anotherMarkName;
    }

    public String getAnotherModelName() {
        return anotherModelName;
    }

    public void setAnotherModelName(String anotherModelName) {
        this.anotherModelName = anotherModelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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

    public TotalSumm getTotalSumm() {
        return totalSumm;
    }

    public void setTotalSumm(TotalSumm totalSumm) {
        this.totalSumm = totalSumm;
    }

    public Risks getRisks() {
        return risks;
    }

    public void setRisks(Risks risks) {
        this.risks = risks;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public InsuranceDescription getInsuranceDescription() {
        return insuranceDescription;
    }

    public void setInsuranceDescription(InsuranceDescription insuranceDescription) {
        this.insuranceDescription = insuranceDescription;
    }

    public Boolean getFactor() {
        return factor;
    }

    public void setFactor(Boolean factor) {
        this.factor = factor;
    }

    public Warnings getWarnings() {
        return warnings;
    }

    public void setWarnings(Warnings warnings) {
        this.warnings = warnings;
    }

    public String getChangedConditions() {
        return changedConditions;
    }

    public void setChangedConditions(String changedConditions) {
        this.changedConditions = changedConditions;
    }

    public String getExpressQuotationId() {
        return expressQuotationId;
    }

    public void setExpressQuotationId(String expressQuotationId) {
        this.expressQuotationId = expressQuotationId;
    }

    public String getExpress_quotation_url() {
        return express_quotation_url;
    }

    public void setExpress_quotation_url(String express_quotation_url) {
        this.express_quotation_url = express_quotation_url;
    }

    public Long getCalculationId() {
        return calculationId;
    }

    public void setCalculationId(Long calculationId) {
        this.calculationId = calculationId;
    }

    public Errors getErrors() {
        return errors;
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }

}
