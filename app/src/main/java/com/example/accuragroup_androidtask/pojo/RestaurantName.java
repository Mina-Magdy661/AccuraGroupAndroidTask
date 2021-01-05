package com.example.accuragroup_androidtask.pojo;

import java.util.ArrayList;

public class RestaurantName {

    private String rest_id;
    private String rest_name;
    private String rest_img;
    private String rest_location;
    private String rest_type;
    ArrayList < ResturantProudct > products = new ArrayList <> ();

    public RestaurantName(String rest_id, String rest_name, String rest_img, String rest_location, String rest_type, ArrayList<ResturantProudct> products) {
        this.rest_id = rest_id;
        this.rest_name = rest_name;
        this.rest_img = rest_img;
        this.rest_location = rest_location;
        this.rest_type = rest_type;
        this.products = products;
    }

    public RestaurantName() {
    }

    // Getter Methods

    public String getRest_id() {
        return rest_id;
    }

    public String getRest_name() {
        return rest_name;
    }

    public String getRest_img() {
        return rest_img;
    }

    public String getRest_location() {
        return rest_location;
    }

    public String getRest_type() {
        return rest_type;
    }

    // Setter Methods

    public void setRest_id(String rest_id) {
        this.rest_id = rest_id;
    }

    public void setRest_name(String rest_name) {
        this.rest_name = rest_name;
    }

    public void setRest_img(String rest_img) {
        this.rest_img = rest_img;
    }

    public void setRest_location(String rest_location) {
        this.rest_location = rest_location;
    }

    public void setRest_type(String rest_type) {
        this.rest_type = rest_type;
    }

    public ArrayList<ResturantProudct> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<ResturantProudct> products) {
        this.products = products;
    }
}