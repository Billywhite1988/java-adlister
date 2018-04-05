package com.codeup.adlister.controller.dao;


import com.codeup.adlister.controller.models.User;

public interface Users {
    User findByUsername(String username);
    Long insert(User user);
}