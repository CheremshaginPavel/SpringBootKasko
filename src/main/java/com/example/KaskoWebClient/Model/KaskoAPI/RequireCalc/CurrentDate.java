package com.example.KaskoWebClient.Model.KaskoAPI.RequireCalc;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CurrentDate {

    @JsonFormat(pattern="dd.MM.yyyy HH:mm:ss")
    private Date currentDate = new Date();

    public CurrentDate() {
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }
}
