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

    public Integer getRisk_id() { return riskId; }

    public void setRisk_id(Integer riskId) { this.riskId = riskId; }

    public Boolean getBank_required() { return bankRequired; }

    public void setBank_required(Boolean bankRequired) { this.bankRequired = bankRequired; }

    public Boolean getCode_required() { return codeRequired; }

    public void setCode_required(Boolean codeRequired) { this.codeRequired = codeRequired; }

    public InsuredSumm getInsured_summ() { return insuredSumm; }

    public void setInsured_summ(InsuredSumm insuredSumm) { this.insuredSumm = insuredSumm; }
}
