package com.example.accuragroup_androidtask.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class RestaurantModel {

    private float status;
    private String sub_message;
    @SerializedName("return")
    ArrayList<RestaurantName> restaurantName = new ArrayList<> ();
    private String message;

    public ArrayList<RestaurantName> getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(ArrayList<RestaurantName> restaurantName) {
        this.restaurantName = restaurantName;
    }

    public RestaurantModel(float status, String sub_message, ArrayList<RestaurantName> restaurantName, String message) {
        this.status = status;
        this.sub_message = sub_message;
        this.restaurantName = restaurantName;
        this.message = message;
    }

    public RestaurantModel() {
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
