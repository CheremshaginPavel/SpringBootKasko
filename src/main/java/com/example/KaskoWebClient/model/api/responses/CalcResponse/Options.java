package com.example.KaskoWebClient.model.api.responses.CalcResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Options {

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

    @JsonProperty("value_option")
    private Integer valueOption;

    public Options() {
    }

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public Integer getRiskId() {
        return riskId;
    }

    public void setRiskId(Integer riskId) {
        this.riskId = riskId;
    }

    public Integer getOptionGroupId() {
        return optionGroupId;
    }

    public void setOptionGroupId(Integer optionGroupId) {
        this.optionGroupId = optionGroupId;
    }

    public Boolean getGroupOptionRequired() {
        return groupOptionRequired;
    }

    public void setGroupOptionRequired(Boolean groupOptionRequired) {
        this.groupOptionRequired = groupOptionRequired;
    }

    public Boolean getGroupOptionEx() {
        return groupOptionEx;
    }

    public void setGroupOptionEx(Boolean groupOptionEx) {
        this.groupOptionEx = groupOptionEx;
    }

    public Integer getOptionNumber() {
        return optionNumber;
    }

    public void setOptionNumber(Integer optionNumber) {
        this.optionNumber = optionNumber;
    }

    public Integer getValueOption() {
        return valueOption;
    }

    public void setValueOption(Integer valueOption) {
        this.valueOption = valueOption;
    }
}
