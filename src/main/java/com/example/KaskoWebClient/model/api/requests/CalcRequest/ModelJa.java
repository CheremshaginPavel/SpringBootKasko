package com.example.KaskoWebClient.model.api.requests.CalcRequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.Serializable;
import java.util.ArrayList;

public class ModelJa implements Serializable, Comparable<ModelJa> {

    private static final long serialVersionUID = 1345345345L;

    @JsonProperty("name")
    private String name;

    @JsonProperty("nameShort")
    private String nameShort;

    @JsonProperty("id")
    private Long id;

    @JsonProperty("right_side_wheel")
    private Boolean hasRightSideWheel;

    @JsonDeserialize(using = ItemDeserializer.class)
    @JsonProperty("production_years")
    private ArrayList<Integer> productionYears;

    /**
     * Мощность двигателя.
     */

    @JsonProperty("enginePower")
    private Integer enginePower;

    @JsonProperty("carSeats")
    private Integer carSeats;

    @JsonProperty("maxWeight")
    private Float maxWeight;

    /**
     * Id модели РСА (реальный, а не INDEXMAINS834).
     */

    @JsonProperty("realModelRsaId")
    private Long realModelRsaId;

    @JsonProperty("carCode")
    private String carCode;

    @JsonProperty("manufacturer")
    private String manufacturer;

    /**
     * Id группы модели
     */

    @JsonProperty("modelGroupId")
    private Long modelGroupId;

    //field7 - флаг страхования с учетом износа
    @JsonProperty("wear")
    private Boolean wear;

    //field8 - тип документа: 1 - первичный
    @JsonDeserialize(using = ItemDeserializer.class)
    @JsonProperty("primary_years")
    private ArrayList<Integer> primaryYears;
    //field8 - тип документа: 3 - возобновление

    @JsonDeserialize(using = ItemDeserializer.class)
    @JsonProperty("renew_years")
    private ArrayList<Integer> renewYears;

    @JsonProperty("markIdForFilter")
    private String markIdForFilter;

    @JsonProperty("modelIdForFilter")
    private String modelIdForFilter;

    public ModelJa() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameShort() {
        return nameShort;
    }

    public void setNameShort(String nameShort) {
        this.nameShort = nameShort;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getHasRightSideWheel() {
        return hasRightSideWheel;
    }

    public void setHasRightSideWheel(Boolean hasRightSideWheel) {
        this.hasRightSideWheel = hasRightSideWheel;
    }

    public ArrayList<Integer> getProductionYears() {
        return productionYears;
    }

    public void setProductionYears(ArrayList<Integer> productionYears) {
        this.productionYears = productionYears;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(Integer enginePower) {
        this.enginePower = enginePower;
    }

    public Integer getCarSeats() {
        return carSeats;
    }

    public void setCarSeats(Integer carSeats) {
        this.carSeats = carSeats;
    }

    public Float getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Float maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Long getRealModelRsaId() {
        return realModelRsaId;
    }

    public void setRealModelRsaId(Long realModelRsaId) {
        this.realModelRsaId = realModelRsaId;
    }

    public String getCarCode() {
        return carCode;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Long getModelGroupId() {
        return modelGroupId;
    }

    public void setModelGroupId(Long modelGroupId) {
        this.modelGroupId = modelGroupId;
    }

    public Boolean getWear() {
        return wear;
    }

    public void setWear(Boolean wear) {
        this.wear = wear;
    }

    public ArrayList<Integer> getPrimaryYears() {
        return primaryYears;
    }

    public void setPrimaryYears(ArrayList<Integer> primaryYears) {
        this.primaryYears = primaryYears;
    }

    public ArrayList<Integer> getRenewYears() {
        return renewYears;
    }

    public void setRenewYears(ArrayList<Integer> renewYears) {
        this.renewYears = renewYears;
    }

    public String getMarkIdForFilter() {
        return markIdForFilter;
    }

    public void setMarkIdForFilter(String markIdForFilter) {
        this.markIdForFilter = markIdForFilter;
    }

    public String getModelIdForFilter() {
        return modelIdForFilter;
    }

    public void setModelIdForFilter(String modelIdForFilter) {
        this.modelIdForFilter = modelIdForFilter;
    }

    /**
     * Компароатор для сравнения и сортировки в лексикографическом порядке
     * @param объект для сравнения
     * @return результат сравнения
     */
    @Override
    public int compareTo(ModelJa compared) {
        return this.getName().compareTo(compared.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModelJa modelJa = (ModelJa) o;

        if (name != null ? !name.equals(modelJa.name) : modelJa.name != null) return false;
        if (id != null ? !id.equals(modelJa.id) : modelJa.id != null) return false;
        if (hasRightSideWheel != null ? !hasRightSideWheel.equals(modelJa.hasRightSideWheel) : modelJa.hasRightSideWheel != null)
            return false;
        return !(wear != null ? !wear.equals(modelJa.wear) : modelJa.wear != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (hasRightSideWheel != null ? hasRightSideWheel.hashCode() : 0);
        result = 31 * result + (wear != null ? wear.hashCode() : 0);
        return result;
    }
}