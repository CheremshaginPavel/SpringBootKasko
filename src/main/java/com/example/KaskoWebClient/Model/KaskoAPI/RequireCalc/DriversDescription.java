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

    public Integer getTransport_usage() { return transportUsage; }

    public void setTransport_usage(Integer transportUsage) { this.transportUsage = transportUsage; }

    public Boolean getInsurer_workers_flag() { return insurerWorkersFlag; }

    public void setInsurer_workers_flag(Boolean insurerWorkersFlag) { this.insurerWorkersFlag = insurerWorkersFlag; }

//    public Boolean getFlag_multidrive() { return flag_multidrive; }
//
//    public void setFlag_multidrive(Boolean flag_multidrive) { this.flag_multidrive = flag_multidrive; }

    public Boolean getOther_workers_flag() { return otherWorkersFlag; }

    public void setOther_workers_flag(Boolean otherWorkersFlag) { this.otherWorkersFlag = otherWorkersFlag; }

    public Boolean getOther_multidrive_flag() { return otherMultidriveFlag; }

    public void setOther_multidrive_flag(Boolean otherMultidriveFlag) { this.otherMultidriveFlag = otherMultidriveFlag; }

    public Boolean getMultidrive() { return multidrive; }

    public void setMultidrive(Boolean multidrive) { this.multidrive = multidrive; }

    public Integer getMultidrive_type() { return multidriveType; }

    public void setMultidrive_type(Integer multidriveType) { this.multidriveType = multidriveType; }

}
