package com.example.KaskoWebClient.model.KaskoAPI.RequireCalc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InsuranceDescription {

    @JsonProperty("kv_size")
    private String kvSize;

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("contract_id")
    private Integer contractId;

    @JsonProperty("term_insurance")
    private Integer termInsurance;

    @JsonProperty("special_program;")
    private Boolean specialProgram;

    @JsonProperty("risks")
    private Risks risks;

    @JsonProperty("options")
    private Options options;

    @JsonProperty("franchise_id")
    private Integer franchiseId;

    @JsonProperty("deprecation")
    private Boolean deprecation;

    @JsonProperty("region")
    private String region;

    @JsonProperty("reimbursement")
    private Integer reimbursement;

    @JsonProperty("payment_plan_id;")
    private Integer paymentPlanId;

    @JsonProperty("franchise")
    private String franchise;

    public InsuranceDescription() {
    }

    public String getKvSize() {
        return kvSize;
    }

    public void setKvSize(String kvSize) {
        this.kvSize = kvSize;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public Integer getTermInsurance() {
        return termInsurance;
    }

    public void setTermInsurance(Integer termInsurance) {
        this.termInsurance = termInsurance;
    }

    public Boolean getSpecialProgram() {
        return specialProgram;
    }

    public void setSpecialProgram(Boolean specialProgram) {
        this.specialProgram = specialProgram;
    }

    public Risks getRisks() {
        return risks;
    }

    public void setRisks(Risks risks) {
        this.risks = risks;
    }

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    public Integer getFranchiseId() {
        return franchiseId;
    }

    public void setFranchiseId(Integer franchiseId) {
        this.franchiseId = franchiseId;
    }

    public Boolean getDeprecation() {
        return deprecation;
    }

    public void setDeprecation(Boolean deprecation) {
        this.deprecation = deprecation;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getReimbursement() {
        return reimbursement;
    }

    public void setReimbursement(Integer reimbursement) {
        this.reimbursement = reimbursement;
    }

    public Integer getPaymentPlanId() {
        return paymentPlanId;
    }

    public void setPaymentPlanId(Integer paymentPlanId) {
        this.paymentPlanId = paymentPlanId;
    }

    public String getFranchise() {
        return franchise;
    }

    public void setFranchise(String franchise) {
        this.franchise = franchise;
    }
}
