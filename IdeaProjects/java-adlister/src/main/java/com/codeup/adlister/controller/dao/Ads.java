package com.codeup.adlister.controller.dao;

import com.codeup.adlister.controller.models.Ad;

import java.util.List;

public interface Ads {
    // get a list of all the ads
    List<Ad> all();
    // insert a new ad and return the new ad's id
    Long insert(Ad ad);
    // update an ad an return updated ad
    Long updateAd(Ad ad);

    List<Ad> search(String input);
    List<Ad> searchByCat(int catId);
    List<Ad> searchByAdId(int id);
    List<Ad> searchByUserId(long userId);
}

