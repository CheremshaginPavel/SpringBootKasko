package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc.insurer;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

public class Insurer {

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("date_of_birth")
    private Date date_of_birth;

    @JsonProperty("first_name")
    private String first_name;

    @JsonProperty("last_name")
    private String last_name;

    @JsonProperty("middle_name")
    private String middle_name;

    public Insurer() {
    }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public Date getDate_of_birth() { return date_of_birth; }

    public void setDate_of_birth(Date date_of_birth) { this.date_of_birth = date_of_birth; }

    public String getFirst_name() { return first_name; }

    public void setFirst_name(String first_name) { this.first_name = first_name; }

    public String getLast_name() { return last_name; }

    public void setLast_name(String last_name) { this.last_name = last_name; }

    public String getMiddle_name() { return middle_name; }

    public void setMiddle_name(String middle_name) { this.middle_name = middle_name; }

}
