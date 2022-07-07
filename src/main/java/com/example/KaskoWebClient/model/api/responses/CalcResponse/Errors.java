package com.example.KaskoWebClient.model.api.responses.CalcResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Errors {

    @JsonProperty("message_id")
    private Integer messageId;

    @JsonProperty("message")
    private String message;

    public Errors() {
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
