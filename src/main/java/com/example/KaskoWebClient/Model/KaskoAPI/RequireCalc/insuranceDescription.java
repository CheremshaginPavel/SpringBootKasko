package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class insuranceDescription {

    @JsonProperty("kv_size")
    private String kv_size;

    @JsonProperty("product_id")
    private String product_id;

    @JsonProperty("contract_id")
    private Integer contract_id;

    @JsonProperty("term_insurance")
    private Integer term_insurance;

    @JsonProperty("special_program;")
    private Boolean special_program;

    @JsonProperty("franchise_id")
    private String franchise_id;

    @JsonProperty("deprecation")
    private Boolean deprecation;

    @JsonProperty("region")
    private String region;

    @JsonProperty("reimbursement")
    private Integer reimbursement;

    @JsonProperty("payment_plan_id;")
    private Integer payment_plan_id;

    @JsonProperty("risks")
    private List<Risk> risks;

    public insuranceDescription() {
    }

    public String getKv_size() { return kv_size; }

    public void setKv_size(String kv_size) { this.kv_size = kv_size; }

    public String getProductId() { return product_id; }

    public void setProductId(String product_id) { this.product_id = product_id; }

    public Integer getContract_id() { return contract_id; }

    public void setContract_id(Integer contract_id) { this.contract_id = contract_id; }

    public Integer getTemp_insurance() { return term_insurance; }

    public void setTemp_insurance(Integer term_insurance) { this.term_insurance = term_insurance; }

    public Boolean getSpecial_program() { return special_program; }

    public void setSpecial_program(Boolean special_program) { this.special_program = special_program; }

    public String getFranchise_id() { return franchise_id; }

    public void setFranchise_id(String franchise_id) { this.franchise_id = franchise_id; }

    public Boolean getDeprecation() { return deprecation; }

    public void setDeprecation(Boolean deprecation) { this.deprecation = deprecation; }

    public String getRegion() { return region; }

    public void setRegion(String region) { this.region = region; }

    public Integer getReimbursement() { return reimbursement; }

    public void setReimbursement(Integer reimbursement) { this.reimbursement = reimbursement; }

    public Integer getPayment_plan_id() { return payment_plan_id; }

    public void setPayment_plan_id(Integer payment_plan_id) { this.payment_plan_id = payment_plan_id; }

    public List<Risk> getRisks() { return risks; }

    public void setRisks(List<Risk> risks) { this.risks = risks; }

}
