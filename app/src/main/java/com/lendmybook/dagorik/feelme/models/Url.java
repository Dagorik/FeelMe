package com.lendmybook.dagorik.feelme.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Dagorik on 29/10/2016.
 */

public class Url {

    @SerializedName("url")
    String url;

    public Url(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
