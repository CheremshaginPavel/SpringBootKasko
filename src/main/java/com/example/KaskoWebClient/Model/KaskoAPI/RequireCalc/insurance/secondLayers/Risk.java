package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.insurance.secondLayers;

import com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.insurance.secondLayers.thirdLayers.InsuredSumm;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Risk {

    @JsonProperty("risk_id")
    private Integer risk_id;

    @JsonProperty("bank_required")
    private Boolean bank_required;

    @JsonProperty("code_required")
    private Boolean code_required;

    @JsonProperty("insured_summ")
    private InsuredSumm insured_summ;

    public Risk() {
    }

    public Integer getRisk_id() { return risk_id; }

    public void setRisk_id(Integer risk_id) { this.risk_id = risk_id; }

    public Boolean getBank_required() { return bank_required; }

    public void setBank_required(Boolean bank_required) { this.bank_required = bank_required; }

    public Boolean getCode_required() { return code_required; }

    public void setCode_required(Boolean code_required) { this.code_required = code_required; }

    public InsuredSumm getInsured_summ() { return insured_summ; }

    public void setInsured_summ(InsuredSumm insured_summ) { this.insured_summ = insured_summ; }
}
