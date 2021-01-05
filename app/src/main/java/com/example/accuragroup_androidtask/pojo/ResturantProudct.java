package com.example.accuragroup_androidtask.pojo;

public class ResturantProudct {

    private String prod_name;
    private float prod_id;
    private String prod_price;
    private String prod_image;

    public ResturantProudct(String prod_name, float prod_id, String prod_price, String prod_image) {
        this.prod_name = prod_name;
        this.prod_id = prod_id;
        this.prod_price = prod_price;
        this.prod_image = prod_image;
    }

    public ResturantProudct() {
    }

    // Getter Methods

    public String getProd_name() {
        return prod_name;
    }

    public float getProd_id() {
        return prod_id;
    }

    public String getProd_price() {
        return prod_price;
    }

    public String getProd_image() {
        return prod_image;
    }

    // Setter Methods

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public void setProd_id(float prod_id) {
        this.prod_id = prod_id;
    }

    public void setProd_price(String prod_price) {
        this.prod_price = prod_price;
    }

    public void setProd_image(String prod_image) {
        this.prod_image = prod_image;
    }


}

