package com.example.KaskoWebClient.model.api.responses.CalcResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Risks {

    @JsonProperty("risk_id")
    private Integer riskId;

    @JsonProperty("risk_name")
    private String riskName;

    @JsonProperty("bank_required")
    private Boolean bankRequired;

    @JsonProperty("code_required")
    private Boolean codeRequired;

    @JsonProperty("insured_summ")
    private InsuredSumm insuredSumm;

    @JsonProperty("insured_premium")
    private InsuredPremium insuredPremium;

    public Risks() {
    }

    public Integer getRiskId() {
        return riskId;
    }

    public void setRiskId(Integer riskId) {
        this.riskId = riskId;
    }

    public String getRiskName() {
        return riskName;
    }

    public void setRiskName(String riskName) {
        this.riskName = riskName;
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

    public InsuredPremium getInsuredPremium() {
        return insuredPremium;
    }

    public void setInsuredPremium(InsuredPremium insuredPremium) {
        this.insuredPremium = insuredPremium;
    }
}
