package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

public class Insurer {

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("date_of_birth")
    private Date dateOfBirth;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("middle_name")
    private String middleName;

    public Insurer() {
    }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public Date getDate_of_birth() { return dateOfBirth; }

    public void setDate_of_birth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getFirst_name() { return firstName; }

    public void setFirst_name(String firstName) { this.firstName = firstName; }

    public String getLast_name() { return lastName; }

    public void setLast_name(String lastName) { this.lastName = lastName; }

    public String getMiddle_name() { return middleName; }

    public void setMiddle_name(String middleName) { this.middleName = middleName; }

}
