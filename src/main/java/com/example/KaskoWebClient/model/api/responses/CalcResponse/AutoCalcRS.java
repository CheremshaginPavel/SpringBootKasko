package com.example.KaskoWebClient.model.api.responses.CalcResponse;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AutoCalcRS {

    @JsonProperty("transit")
    private Boolean transit;

    @JsonProperty("tachograph")
    private Boolean tachograph;

    @JsonProperty("territory_id")
    private Integer territoryId;

    @JsonProperty("model_id")
    private Integer modelId;

    @JsonProperty("mark_id")
    private Integer markId;

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
    private List<Risks> risks;

    @JsonProperty("options")
    private List<Options> options;

    @JsonProperty("insurance")
    private Insurance insurance;

    @JsonProperty("factor")
    private Double factor;

    @JsonProperty("warnings")
    private List<Warnings> warnings;

    @JsonProperty("changed_conditions")
    private ChangedConditions changedConditions;

    @JsonProperty("express_quotation_id")
    private Long expressQuotationId;

    @JsonProperty("express_quotation_url")
    private String expressQuotationUrl;

    @JsonProperty("calculation_id")
    private Long calculationId;

    @JsonProperty("Errors")
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

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public Integer getMarkId() {
        return markId;
    }

    public void setMarkId(Integer markId) {
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

    public List<Options> getOptions() {
        return options;
    }

    public void setOptions(List<Options> options) {
        this.options = options;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Double getFactor() {
        return factor;
    }

    public void setFactor(Double factor) {
        this.factor = factor;
    }

    public List<Warnings> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<Warnings> warnings) {
        this.warnings = warnings;
    }

    public Long getExpressQuotationId() {
        return expressQuotationId;
    }

    public void setExpressQuotationId(Long expressQuotationId) {
        this.expressQuotationId = expressQuotationId;
    }

    public String getExpressQuotationUrl() {
        return expressQuotationUrl;
    }

    public void setExpressQuotationUrl(String expressQuotationUrl) {
        this.expressQuotationUrl = expressQuotationUrl;
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

    public List<Risks> getRisks() {
        return risks;
    }

    public void setRisks(List<Risks> risks) {
        this.risks = risks;
    }

    public ChangedConditions getChangedConditions() {
        return changedConditions;
    }

    public void setChangedConditions(ChangedConditions changedConditions) {
        this.changedConditions = changedConditions;
    }
}
