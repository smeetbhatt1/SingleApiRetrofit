package com.example.smeetbhatt.retrofitname;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Instance of Retrofit
 * Created by smeetbhatt on 12/09/17.
 */

public class ApiClient {

    public static final String BASE_URL = "http://192.168.1.5/retrofit1/";
    public static Retrofit retrofit = null;

    public static Retrofit getApiClient(){
        if(retrofit == null)
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;
    }
}
