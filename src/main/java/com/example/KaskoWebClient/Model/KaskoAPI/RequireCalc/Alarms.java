package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc;

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

    public String getAlarm_type_name() { return alarmTypeName; }

    public void setAlarm_type_name(String alarmTypeName) { this.alarmTypeName = alarmTypeName; }

    public Integer getAlarm_type_id() { return alarmTypeId; }

    public void setAlarm_type_id(Integer alarmTypeId) { this.alarmTypeId = alarmTypeId; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

}
