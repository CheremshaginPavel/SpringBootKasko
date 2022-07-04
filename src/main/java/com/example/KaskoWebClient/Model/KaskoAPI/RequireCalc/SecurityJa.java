package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc;

import com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.Alarms;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SecurityJa {

    @JsonProperty("recommended_puu")
    private Boolean recommendedPuu;

    @JsonProperty("alarms")
    private Alarms alarms;

    public SecurityJa() {
    }

    public Boolean getRecommendedPuu() {
        return recommendedPuu;
    }

    public void setRecommendedPuu(Boolean recommendedPuu) {
        this.recommendedPuu = recommendedPuu;
    }

    public Alarms getAlarms() {
        return alarms;
    }

    public void setAlarms(Alarms alarms) {
        this.alarms = alarms;
    }
}
