package com.example.myretrofitlibrary;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyRetroInstance {

    public static Retrofit retrofit;

    public static Retrofit getMyRetrofitInstance(String baseUrl){

        retrofit = new retrofit2.Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
