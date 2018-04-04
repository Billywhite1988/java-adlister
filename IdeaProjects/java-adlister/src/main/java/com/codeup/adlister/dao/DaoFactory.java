package com.codeup.adlister.dao;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = (Ads) new ListAdsDao();
        }
        return adsDao;
    }
}