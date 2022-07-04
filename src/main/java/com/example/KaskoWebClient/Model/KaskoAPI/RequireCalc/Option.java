package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Option {

    @JsonProperty("option_id")
    private Integer optionId;

    @JsonProperty("option_name")
    private String optionName;

    @JsonProperty("risk_id")
    private Integer riskId;

    @JsonProperty("option_group_id")
    private Integer optionGroupId;

    @JsonProperty("group_option_required")
    private Boolean groupOptionRequired;

    @JsonProperty("group_option_ex")
    private Boolean groupOptionEx;

    @JsonProperty("option_number")
    private Integer optionNumber;

    @JsonProperty("option_value")
    private Integer optionValue;

    public Option() {
    }

    public Integer getOption_id() { return optionId; }

    public void setOption_id(Integer optionId) { this.optionId = optionId; }

    public String getOption_name() { return optionName; }

    public void setOption_name(String optionName) { this.optionName = optionName; }

    public Integer getRisk_id() { return riskId; }

    public void setRisk_id(Integer riskId) { this.riskId = riskId; }

    public Integer getOption_group_id() { return optionGroupId; }

    public void setOption_group_id(Integer optionGroupId) { this.optionGroupId = optionGroupId; }

    public Boolean getGroup_option_required() { return groupOptionRequired; }

    public void setGroup_option_required(Boolean groupOptionRequired)
    { this.groupOptionRequired = groupOptionRequired; }

    public Boolean getGroup_option_ex() { return groupOptionEx; }

    public void setGroup_option_ex(Boolean groupOptionEx) { this.groupOptionEx = groupOptionEx; }

    public Integer getOption_number() { return optionNumber; }

    public void setOption_number(Integer optionNumber) { this.optionNumber = optionNumber; }

    public Integer getOption_value() { return optionValue; }

    public void setOption_value(Integer optionValue) { this.optionValue = optionValue; }

}
