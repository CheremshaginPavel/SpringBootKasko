package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc;

import com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.SecurityJa;
import com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.SterringWheel;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ModelDescription {

    @JsonProperty("tachograph")
    private Boolean tachograph;

    @JsonProperty("category")
    private String category;

    @JsonProperty("prefix_com_ts_id")
    private Integer prefixComTsId;

    @JsonProperty("prefix_com_ts_name")
    private String prefixComTsName;

    @JsonProperty("type_com_ts_id")
    private Integer typeComTsId;

    @JsonProperty("type_com_ts_name")
    private String typeComTsName;

    @JsonProperty("another_mm")
    private Boolean anotherMm;

    @JsonProperty("another_mark_name")
    private String anotherMarkName;

    @JsonProperty("another_model_name")
    private String anotherModelName;

    @JsonProperty("mile_age")
    private String mileAge;

    @JsonProperty("mark_name")
    private String markName;

    @JsonProperty("mark_id")
    private String markId;

    @JsonProperty("model_name")
    private String modelName;

    @JsonProperty("model_id")
    private String modelId;

    @JsonProperty("horsepower")
    private String horsepower;

    @JsonProperty("year")
    private String year;

    @JsonProperty("sterring_wheel")
    private SterringWheel sterringWheel;

    @JsonProperty("ts_new")
    private Boolean tsNew;

    @JsonProperty("security_ja")
    private SecurityJa securityJa;

    public ModelDescription() {
    }

    public Boolean getTachograph() { return tachograph; }

    public void setTachograph(Boolean tachograph) { this.tachograph = tachograph; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public Integer getPrefix_com_ts_id() { return prefixComTsId; }

    public void setPrefix_com_ts_id(Integer prefixComTsId) { this.prefixComTsId = prefixComTsId; }

    public String getPrefix_com_ts_name() { return prefixComTsName; }

    public void setPrefix_com_ts_name(String prefixComTsName) { this.prefixComTsName = prefixComTsName; }

    public Integer getType_com_ts_id() { return typeComTsId; }

    public void setType_com_ts_id(Integer typeComTsId) { this.typeComTsId = typeComTsId; }

    public String getType_com_ts_name() { return typeComTsName; }

    public void setType_com_ts_name(String typeComTsName) { this.typeComTsName = typeComTsName; }

    public Boolean getAnother_mm() { return anotherMm; }

    public void setAnother_mm(Boolean anotherMm) { this.anotherMm = anotherMm; }

    public String getAnother_mark_name() { return anotherMarkName; }

    public void setAnother_mark_name(String anotherMarkName) { this.anotherMarkName = anotherMarkName; }

    public String getAnother_model_name() { return anotherModelName; }

    public void setAnother_model_name(String anotherModelName) { this.anotherModelName = anotherModelName; }

    public String getMile_age() { return mileAge; }

    public void setMile_age(String mileAge) { this.mileAge = mileAge; }

    public String getMark_name() { return markName; }

    public void setMark_name(String markName) { this.markName = markName; }

    public String getMark_id() { return markId; }

    public void setMark_id(String markId) { this.markId = markId; }

    public String getModel_name() { return modelName; }

    public void setModel_name(String modelName) { this.modelName = modelName; }

        public String getModel_id() { return modelId; }

    public void setModel_id(String modelId) { this.modelId = modelId; }

    public String getHorsepower() { return horsepower; }

    public void setHorsepower(String horsepower) { this.horsepower = horsepower; }

    public String getYear() { return year; }

    public void setYear(String year) { this.year = year; }

    public SterringWheel getSterring_wheel() { return sterringWheel; }

    public void setSterring_wheel(SterringWheel sterringWheel) { this.sterringWheel = sterringWheel; }

    public Boolean getTs_new() { return tsNew; }

    public void setTs_new(Boolean tsNew) { this.tsNew = tsNew; }

    public SecurityJa getSecurity_ja() { return securityJa; }

    public void setSecurity_ja(SecurityJa securityJa) { this.securityJa = securityJa; }
}
