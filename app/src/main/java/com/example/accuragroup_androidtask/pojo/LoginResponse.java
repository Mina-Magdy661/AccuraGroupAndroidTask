package com.example.accuragroup_androidtask.pojo;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {


    private float status;
    private String sub_message;
    private String message;

    public LoginResponse(float status, String sub_message, String message) {
        this.status = status;
        this.sub_message = sub_message;
        this.message = message;
    }



    // Getter Methods

    public float getStatus() {
        return status;
    }

    public String getSub_message() {
        return sub_message;
    }


    public String getMessage() {
        return message;
    }

    // Setter Methods

    public void setStatus(float status) {
        this.status = status;
    }

    public void setSub_message(String sub_message) {
        this.sub_message = sub_message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}