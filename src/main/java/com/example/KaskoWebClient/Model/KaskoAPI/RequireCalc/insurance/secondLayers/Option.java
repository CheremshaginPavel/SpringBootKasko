package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.insurance.secondLayers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Option {

    @JsonProperty("option_id")
    private Integer option_id;

    @JsonProperty("option_name")
    private String option_name;

    @JsonProperty("risk_id")
    private Integer risk_id;

    @JsonProperty("option_group_id")
    private Integer option_group_id;

    @JsonProperty("group_option_required")
    private Boolean group_option_required;

    @JsonProperty("group_option_ex")
    private Boolean group_option_ex;

    @JsonProperty("option_number")
    private Integer option_number;

    @JsonProperty("option_value")
    private Integer option_value;

    public Option() {
    }

    public Integer getOption_id() { return option_id; }

    public void setOption_id(Integer option_id) { this.option_id = option_id; }

    public String getOption_name() { return option_name; }

    public void setOption_name(String option_name) { this.option_name = option_name; }

    public Integer getRisk_id() { return risk_id; }

    public void setRisk_id(Integer risk_id) { this.risk_id = risk_id; }

    public Integer getOption_group_id() { return option_group_id; }

    public void setOption_group_id(Integer option_group_id) { this.option_group_id = option_group_id; }

    public Boolean getGroup_option_required() { return group_option_required; }

    public void setGroup_option_required(Boolean group_option_required)
    { this.group_option_required = group_option_required; }

    public Boolean getGroup_option_ex() { return group_option_ex; }

    public void setGroup_option_ex(Boolean group_option_ex) { this.group_option_ex = group_option_ex; }

    public Integer getOption_number() { return option_number; }

    public void setOption_number(Integer option_number) { this.option_number = option_number; }

    public Integer getOption_value() { return option_value; }

    public void setOption_value(Integer option_value) { this.option_value = option_value; }

}
