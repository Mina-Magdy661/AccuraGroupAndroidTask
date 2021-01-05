package com.example.accuragroup_androidtask.pojo;

public class LoginRequest {


    private String mobile;
    private String password;
    private String access_key;
    private String access_password;

    public LoginRequest(String mobile, String password, String access_key, String access_password) {
        this.mobile = mobile;
        this.password = password;
        this.access_key = access_key;
        this.access_password = access_password;
    }


    // Getter Methods

    public String getMobile() {
        return mobile;
    }

    public String getPassword() {
        return password;
    }

    public String getAccess_key() {
        return access_key;
    }

    public String getAccess_password() {
        return access_password;
    }

    // Setter Methods

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAccess_key(String access_key) {
        this.access_key = access_key;
    }

    public void setAccess_password(String access_password) {
        this.access_password = access_password;
    }
}
