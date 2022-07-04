package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DriversDescription {

    @JsonProperty("multidrive")
    private Boolean multidrive;

    @JsonProperty("insurer_workers_flag")
    private Boolean insurerWorkersFlag;

    @JsonProperty("transport_usage")
    private Integer transportUsage;

    @JsonProperty("other_multidrive_flag")
    private Boolean otherMultidriveFlag;

    @JsonProperty("multidrive_type")
    private Integer multidriveType;

    @JsonProperty("other_workers_flag")
    private Boolean otherWorkersFlag;

//    @JsonProperty("flag_multidrive")
//    private Boolean flag_multidrive;

    public DriversDescription() {
    }

    public Boolean getMultidrive() {
        return multidrive;
    }

    public void setMultidrive(Boolean multidrive) {
        this.multidrive = multidrive;
    }

    public Boolean getInsurerWorkersFlag() {
        return insurerWorkersFlag;
    }

    public void setInsurerWorkersFlag(Boolean insurerWorkersFlag) {
        this.insurerWorkersFlag = insurerWorkersFlag;
    }

    public Integer getTransportUsage() {
        return transportUsage;
    }

    public void setTransportUsage(Integer transportUsage) {
        this.transportUsage = transportUsage;
    }

    public Boolean getOtherMultidriveFlag() {
        return otherMultidriveFlag;
    }

    public void setOtherMultidriveFlag(Boolean otherMultidriveFlag) {
        this.otherMultidriveFlag = otherMultidriveFlag;
    }

    public Integer getMultidriveType() {
        return multidriveType;
    }

    public void setMultidriveType(Integer multidriveType) {
        this.multidriveType = multidriveType;
    }

    public Boolean getOtherWorkersFlag() {
        return otherWorkersFlag;
    }

    public void setOtherWorkersFlag(Boolean otherWorkersFlag) {
        this.otherWorkersFlag = otherWorkersFlag;
    }
}
