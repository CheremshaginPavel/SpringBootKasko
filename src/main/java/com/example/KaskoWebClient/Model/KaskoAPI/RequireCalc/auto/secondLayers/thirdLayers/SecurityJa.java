package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.auto.secondLayers.thirdLayers;

import com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.auto.secondLayers.thirdLayers.Alarms.Alarms;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SecurityJa {

    @JsonProperty("recommended_puu")
    private Boolean recommended_puu;

    @JsonProperty("alarms")
    private Alarms alarms;

    public SecurityJa() {
    }

    public Boolean getRecommended_puu() { return recommended_puu; }

    public void setRecommended_puu(Boolean recommended_puu) { this.recommended_puu = recommended_puu; }


    public Alarms getAlarms() { return alarms; }

    public void setAlarms(Alarms alarms) { this.alarms = alarms; }
}
