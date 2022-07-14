package com.example.KaskoWebClient.model.api.requests.CalcRequest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.springframework.util.ResourceUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("autoCalcRq")
public class AutoCalcRq {

    @JsonProperty("partner_pin")
    private String partnerPin;

    @JsonProperty("calc_type")
    private String calcType;

    @JsonProperty("calc_date")
    private String calcDate;

    @JsonProperty("model_selection")
    private Boolean modelSelection;

    @JsonProperty("factor")
    private String factor;

    @JsonProperty("express_quotation_id")
    private String expressQuotationId;

    @JsonProperty("region_id")
    private String regionId;

    @JsonProperty("auto")
    private AutoDescription auto;

    @JsonProperty("insurance")
    private InsuranceDescription insurance;

    @JsonProperty("drivers")
    private DriversDescription drivers;

    @JsonProperty("insurer")
    private Insurer insurer;

    private final Map<String, String> mapMark = new HashMap<>();

    private final Map<String, String> mapHyundai = new HashMap<>();

    private final Map<String, String> mapAcura = new HashMap<>();

    private final Map<String, String> mapAlfaRomeo = new HashMap<>();

    private final Map<String, String> mapAudi = new HashMap<>();

    private final Map<String, String> mapBentley = new HashMap<>();

    public AutoCalcRq() {
    }

    private final Map<String, String> mapBmw = new HashMap<>();

    public String getPartnerPin() {
        return partnerPin;
    }

    public void setPartnerPin(String partnerPin) {
        this.partnerPin = partnerPin;
    }

    public String getCalcType() {
        return calcType;
    }

    public void setCalcType(String calcType) {
        this.calcType = calcType;
    }

    public String getCalcDate() {
        return calcDate;
    }

    public void setCalcDate(String calcDate) {
        this.calcDate = calcDate;
    }

    public Boolean getModelSelection() {
        return modelSelection;
    }

    public void setModelSelection(Boolean modelSelection) {
        this.modelSelection = modelSelection;
    }

    public String getFactor() {
        return factor;
    }

    public void setFactor(String factor) {
        this.factor = factor;
    }

    public String getExpressQuotationId() {
        return expressQuotationId;
    }

    public void setExpressQuotationId(String expressQuotationId) {
        this.expressQuotationId = expressQuotationId;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public AutoDescription getAuto() {
        return auto;
    }

    public void setAuto(AutoDescription auto) {
        this.auto = auto;
    }

    public InsuranceDescription getInsurance() {
        return insurance;
    }

    public void setInsurance(InsuranceDescription insurance) {
        this.insurance = insurance;
    }

    public DriversDescription getDrivers() {
        return drivers;
    }

    public void setDrivers(DriversDescription drivers) {
        this.drivers = drivers;
    }

    public Insurer getInsurer() {
        return insurer;
    }

    public void setInsurer(Insurer insurer) {
        this.insurer = insurer;
    }

    public Map<String, String> getMapMark() {
        mapMark.put("1", "ACURA");
        mapMark.put("2", "ALFA ROMEO");
        mapMark.put("7", "AUDI");
        mapMark.put("11", "BENTLEY");
        mapMark.put("15", "BMW");
        mapMark.put("73", "HYUNDAI");
        return mapMark;
    }

    public Map<String, String> getMapAcura() {
        mapAcura.put("2049", "RDX");
        mapAcura.put("2051", "RSX");
        mapAcura.put("3689", "MDX 3,5");
        return mapAcura;
    }

    public Map<String, String> getMapAlfaRomeo() {
        mapAlfaRomeo.put("5719", "GIULIETTA 1,4T");
        mapAlfaRomeo.put("4223", "MITO 1,4T");
        mapAlfaRomeo.put("2053", "BRERA 2,2");
        return mapAlfaRomeo;
    }

    public Map<String, String> getMapAudi() {
        mapAudi.put("269", "S8");
        mapAudi.put("335", "A4 1,9 TDI");
        mapAudi.put("342", "A2 1,4");
        return mapAudi;
    }

    public Map<String, String> getMapBentley() {
        mapBentley.put("1768", "CONTINENTAL GT 6,0");
        mapBentley.put("6904", "CONTINENTAL GT 4,0");
        mapBentley.put("6910", "FLYING SPUR 6,0");
        return mapBentley;
    }

    public Map<String, String> getMapBmw() {
        mapBmw.put("26", "320 CABRIO (E93)");
        mapBmw.put("61", "530XI (E60)");
        mapBmw.put("807", "535D (E60)");
        return mapBmw;
    }

    public Map<String, String> getMapHyundai() {
        mapHyundai.put("1188", "AVANTE 1,6");
        mapHyundai.put("3198", "COUPE 2,0");
        mapHyundai.put("4758", "SOLARIS 1,4");
        return mapHyundai;
    }
}
