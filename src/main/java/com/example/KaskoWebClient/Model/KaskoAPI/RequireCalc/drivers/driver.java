package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.drivers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class driver {

    @JsonProperty("age")
    private String age;

    @JsonProperty("experience")
    private String experience;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("region_registration_id")
    private String region_registration_id;

    @JsonProperty("resident")
    private Boolean resident;

    public driver() {
    }

    public String getAge() { return age; }

    public void setAge(String age) { this.age = age; }

    public String getExperience() { return experience; }

    public void setExperience(String experience) { this.experience = experience; }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public String getRegion_registration_id() { return region_registration_id; }

    public void setRegion_registration_id(String region_registration_id)
    { this.region_registration_id = region_registration_id; }

    public Boolean getResident() { return resident; }

    public void setResident(Boolean resident) { this.resident = resident; }
}
