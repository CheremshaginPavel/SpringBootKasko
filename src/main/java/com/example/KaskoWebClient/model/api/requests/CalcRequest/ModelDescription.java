package com.example.KaskoWebClient.model.api.requests.CalcRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

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

    public Boolean getTachograph() {
        return tachograph;
    }

    public void setTachograph(Boolean tachograph) {
        this.tachograph = tachograph;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public String getMileAge() {
        return mileAge;
    }

    public void setMileAge(String mileAge) {
        this.mileAge = mileAge;
    }

    public String getMarkName() {
        return markName;
    }

    public void setMarkName(String markName) {
        this.markName = markName;
    }

    public String getMarkId() {
        return markId;
    }

    public void setMarkId(String markId) {
        this.markId = markId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(String horsepower) {
        this.horsepower = horsepower;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public SterringWheel getSterringWheel() {
        return sterringWheel;
    }

    public void setSterringWheel(SterringWheel sterringWheel) {
        this.sterringWheel = sterringWheel;
    }

    public Boolean getTsNew() {
        return tsNew;
    }

    public void setTsNew(Boolean tsNew) {
        this.tsNew = tsNew;
    }

    public SecurityJa getSecurityJa() {
        return securityJa;
    }

    public void setSecurityJa(SecurityJa securityJa) {
        this.securityJa = securityJa;
    }

    public String searchNameMark(String _markId) {
        Map<String, String> mapId = new HashMap<String, String>();

        mapId.put("1", "ACURA");
        mapId.put("2", "ALFA ROMEO");
        mapId.put("7", "AUDI");
        mapId.put("11", "BENTLEY");
        mapId.put("15", "BMW");
        mapId.put("73", "HYUNDAI");

        for (Map.Entry<String, String> entry : mapId.entrySet()) {
            if (Objects.equals(entry.getKey(), _markId)) {
                return entry.getValue();
            }
        }
        return _markId;
    }

    public String searchNameModel(String _modelId) {
        Map<String, String> mapId = new HashMap<String, String>();

        mapId.put("663", "TRAJET 2,0");
        mapId.put("664", "H 1 STAREX 2,5");
        mapId.put("1188", "AVANTE 1,6");
        mapId.put("1450", "GETZ 1,5 D");
        mapId.put("3198", "COUPE 2,0");
        mapId.put("4758", "SOLARIS 1,4");
        mapId.put("4759", "SOLARIS 1,6");

        for (Map.Entry<String, String> entry : mapId.entrySet()) {
            if (Objects.equals(entry.getValue(), _modelId)) {
                return entry.getKey();
            }
        }
        return _modelId;
    }

}
