package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.auto.secondLayers.thirdLayers.Alarms;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Alarms {

    @JsonProperty("alarm_type_name")
    private String alarm_type_name;

    @JsonProperty("alarm_type_id")
    private Integer alarm_type_id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private Integer id;

    public Alarms() {
    }

    public String getAlarm_type_name() { return alarm_type_name; }

    public void setAlarm_type_name(String alarm_type_name) { this.alarm_type_name = alarm_type_name; }

    public Integer getAlarm_type_id() { return alarm_type_id; }

    public void setAlarm_type_id(Integer alarm_type_id) { this.alarm_type_id = alarm_type_id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

}
