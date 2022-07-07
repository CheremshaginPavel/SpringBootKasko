package com.example.KaskoWebClient.model.KaskoAPI.RequireCalc;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Alarms {

    @JsonProperty("alarm_type_name")
    private String alarmTypeName;

    @JsonProperty("alarm_type_id")
    private Integer alarmTypeId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    private Integer id;

    public Alarms() {
    }

    public String getAlarmTypeName() {
        return alarmTypeName;
    }

    public void setAlarmTypeName(String alarmTypeName) {
        this.alarmTypeName = alarmTypeName;
    }

    public Integer getAlarmTypeId() {
        return alarmTypeId;
    }

    public void setAlarmTypeId(Integer alarmTypeId) {
        this.alarmTypeId = alarmTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
