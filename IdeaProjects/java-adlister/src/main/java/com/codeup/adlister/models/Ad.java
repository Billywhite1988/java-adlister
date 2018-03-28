package com.codeup.adlister.models;


public class Ad {
    private long id;
    private long userId;
    private long catId;
    private String title;
    private String description;
    private String date;
    private String location;

    public Ad(long id, long userId,long catID, String title, String description, String location, String date) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.date = date;
        this.location = location;
        this.catId = catID;
    }

    public Ad(long userId, long catID, String title, String description, String date, String location) {
        this.userId = userId;
        this.catId = catID;
        this.title = title;
        this.description = description;
        this.date = date;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getCatId() {
        return catId;
    }

    public void setCatId(long catId) {
        this.catId = catId;
    }
}