package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.auto.secondLayers;

import com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.auto.secondLayers.thirdLayers.SecurityJa;
import com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.auto.secondLayers.thirdLayers.SterringWheel;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ModelDescription {

    @JsonProperty("tachograph")
    private Boolean tachograph;

    @JsonProperty("category")
    private String category;

    @JsonProperty("prefix_com_ts_id")
    private Integer prefix_com_ts_id;

    @JsonProperty("prefix_com_ts_name")
    private String prefix_com_ts_name;

    @JsonProperty("type_com_ts_id")
    private Integer type_com_ts_id;

    @JsonProperty("type_com_ts_name")
    private String type_com_ts_name;

    @JsonProperty("another_mm")
    private Boolean another_mm;

    @JsonProperty("another_mark_name")
    private String another_mark_name;

    @JsonProperty("another_model_name")
    private String another_model_name;

    @JsonProperty("mile_age")
    private String mile_age;

    @JsonProperty("mark_name")
    private String mark_name;

    @JsonProperty("mark_id")
    private String mark_id;

    @JsonProperty("model_name")
    private String model_name;

    @JsonProperty("model_id")
    private String model_id;

    @JsonProperty("horsepower")
    private String horsepower;

    @JsonProperty("year")
    private String year;

    @JsonProperty("sterring_wheel")
    private SterringWheel sterring_wheel;

    @JsonProperty("ts_new")
    private Boolean ts_new;

    //@JsonProperty("model_id")
    //private String model_id;

    @JsonProperty("security_ja")
    private SecurityJa security_ja;

    public ModelDescription() {
    }

    public Boolean getTachograph() { return tachograph; }

    public void setTachograph(Boolean tachograph) { this.tachograph = tachograph; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public Integer getPrefix_com_ts_id() { return prefix_com_ts_id; }

    public void setPrefix_com_ts_id(Integer prefix_com_ts_id) { this.prefix_com_ts_id = prefix_com_ts_id; }

    public String getPrefix_com_ts_name() { return prefix_com_ts_name; }

    public void setPrefix_com_ts_name(String prefix_com_ts_name) { this.prefix_com_ts_name = prefix_com_ts_name; }

    public Integer getType_com_ts_id() { return type_com_ts_id; }

    public void setType_com_ts_id(Integer type_com_ts_id) { this.type_com_ts_id = type_com_ts_id; }

    public String getType_com_ts_name() { return type_com_ts_name; }

    public void setType_com_ts_name(String type_com_ts_name) { this.type_com_ts_name = type_com_ts_name; }

    public Boolean getAnother_mm() { return another_mm; }

    public void setAnother_mm(Boolean another_mm) { this.another_mm = another_mm; }

    public String getAnother_mark_name() { return another_mark_name; }

    public void setAnother_mark_name(String another_mark_name) { this.another_mark_name = another_mark_name; }

    public String getAnother_model_name() { return another_model_name; }

    public void setAnother_model_name(String another_model_name) { this.another_model_name = another_model_name; }

    public String getMile_age() { return mile_age; }

    public void setMile_age(String mile_age) { this.mile_age = mile_age; }

    public String getMark_name() { return mark_name; }

    public void setMark_name(String mark_name) { this.mark_name = mark_name; }

    public String getMark_id() { return mark_id; }

    public void setMark_id(String mark_id) { this.mark_id = mark_id; }

    public String getModel_name() { return model_name; }

    public void setModel_name(String model_name) { this.model_name = model_name; }

    public String getModel_id() { return model_id; }

    public void setModel_id(String model_id) { this.model_id = model_id; }

    public String getHorsepower() { return horsepower; }

    public void setHorsepower(String horsepower) { this.horsepower = horsepower; }

    public String getYear() { return year; }

    public void setYear(String year) { this.year = year; }

    public SterringWheel getSterring_wheel() { return sterring_wheel; }

    public void setSterring_wheel(SterringWheel sterring_wheel) { this.sterring_wheel = sterring_wheel; }

    public Boolean getTs_new() { return ts_new; }

    public void setTs_new(Boolean ts_new) { this.ts_new = ts_new; }

    public SecurityJa getSecurity_ja() { return security_ja; }

    public void setSecurity_ja(SecurityJa security_ja) { this.security_ja = security_ja; }
}
