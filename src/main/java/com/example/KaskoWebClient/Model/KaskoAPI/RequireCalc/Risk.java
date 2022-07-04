package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Risk {

    @JsonProperty("risk_id")
    private Integer riskId;

    @JsonProperty("bank_required")
    private Boolean bankRequired;

    @JsonProperty("code_required")
    private Boolean codeRequired;

    @JsonProperty("insured_summ")
    private InsuredSumm insuredSumm;

    public Risk() {
    }

    public Integer getRiskId() {
        return riskId;
    }

    public void setRiskId(Integer riskId) {
        this.riskId = riskId;
    }

    public Boolean getBankRequired() {
        return bankRequired;
    }

    public void setBankRequired(Boolean bankRequired) {
        this.bankRequired = bankRequired;
    }

    public Boolean getCodeRequired() {
        return codeRequired;
    }

    public void setCodeRequired(Boolean codeRequired) {
        this.codeRequired = codeRequired;
    }

    public InsuredSumm getInsuredSumm() {
        return insuredSumm;
    }

    public void setInsuredSumm(InsuredSumm insuredSumm) {
        this.insuredSumm = insuredSumm;
    }
}
