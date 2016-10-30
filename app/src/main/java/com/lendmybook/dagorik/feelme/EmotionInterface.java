package com.lendmybook.dagorik.feelme;

import com.lendmybook.dagorik.feelme.models.Face;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Dagorik on 29/10/2016.
 */

public interface EmotionInterface {

    @FormUrlEncoded
    @Headers("Ocp-Apim-Subscription-Key: 862f90751d0f4b7ca9ec4ee4eed2a601")
    @POST("/emotion/v1.0/recognize")
    Call<Face>getFace(@Field("url") String url);

}
