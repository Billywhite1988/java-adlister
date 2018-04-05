package com.codeup.adlister.controller;

public class Config {
    private String url = "jdbc:mysql://localhost/adlist_db?serverTimezone=UTC&useSSL=false";
    private String username = "adlist";
    private String password = "adlistP@ass123";

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}