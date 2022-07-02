package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class driversDescription {

    @JsonProperty("transport_usage")
    private Integer transport_usage;

    @JsonProperty("insurer_workers_flag")
    private Boolean insurer_workers_flag;

    @JsonProperty("flag_multidrive")
    private Boolean flag_multidrive;

    @JsonProperty("other_workers_flag")
    private Boolean other_workers_flag;

    @JsonProperty("other_multidrive_flag")
    private Boolean other_multidrive_flag;

    @JsonProperty("multidrive")
    private Boolean multidrive;

    @JsonProperty("multidrive_type")
    private Integer multidrive_type;

    public driversDescription() {
    }

    public Integer getTransport_usage() { return transport_usage; }

    public void setTransport_usage(Integer transport_usage) { this.transport_usage = transport_usage; }

    public Boolean getInsurer_workers_flag() { return insurer_workers_flag; }

    public void setInsurer_workers_flag(Boolean insurer_workers_flag) { this.insurer_workers_flag = insurer_workers_flag; }

    public Boolean getFlag_multidrive() { return flag_multidrive; }

    public void setFlag_multidrive(Boolean flag_multidrive) { this.flag_multidrive = flag_multidrive; }

    public Boolean getOther_workers_flag() { return other_workers_flag; }

    public void setOther_workers_flag(Boolean other_workers_flag) { this.other_workers_flag = other_workers_flag; }

    public Boolean getOther_multidrive_flag() { return other_multidrive_flag; }

    public void setOther_multidrive_flag(Boolean other_multidrive_flag) { this.other_multidrive_flag = other_multidrive_flag; }

    public Boolean getMultidrive() { return multidrive; }

    public void setMultidrive(Boolean multidrive) { this.multidrive = multidrive; }

    public Integer getMultidrive_type() { return multidrive_type; }

    public void setMultidrive_type(Integer multidrive_type) { this.multidrive_type = multidrive_type; }

}
