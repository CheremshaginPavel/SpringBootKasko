package com.example.KaskoWebClient.Model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.io.Serializable;

@JsonAutoDetect
public class Kasko {
    private long id;
    private String name;
    public Kasko (long id, String name) {
        this.id = id;
        this.name = name;
    }
    public long getId() { return id; }
    public String getName() { return name; }
}
