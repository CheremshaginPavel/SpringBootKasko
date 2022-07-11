package com.example.KaskoWebClient.model.api.requests.CalcRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Driver {

    @JsonProperty("age")
    private String age;

    @JsonProperty("experience")
    private String experience;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("region_registration_id")
    private String regionRegistrationId;

    @JsonProperty("resident")
    private Boolean resident;

    @JsonProperty("flag_link")
    private Integer flagLink;

    public Driver() {
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRegionRegistrationId() {
        return regionRegistrationId;
    }

    public void setRegionRegistrationId(String regionRegistrationId) {
        this.regionRegistrationId = regionRegistrationId;
    }

    public Boolean getResident() {
        return resident;
    }

    public void setResident(Boolean resident) {
        this.resident = resident;
    }

    public Integer getFlagLink() {
        return flagLink;
    }

    public void setFlagLink(Integer flagLink) {
        this.flagLink = flagLink;
    }
}
