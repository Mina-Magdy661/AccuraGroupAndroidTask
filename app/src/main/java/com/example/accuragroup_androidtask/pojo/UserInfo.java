package com.example.accuragroup_androidtask.pojo;

public class UserInfo {


    private float id;
    private float age;
    private String gender;
    private String mobile;
    private String password;


    // Getter Methods

    public float getId() {
        return id;
    }

    public float getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getMobile() {
        return mobile;
    }

    public String getPassword() {
        return password;
    }

    // Setter Methods

    public void setId(float id) {
        this.id = id;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}