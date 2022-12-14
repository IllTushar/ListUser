package com.example.listuser.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient
{
  public static String baseurl ="https://reqres.in/api/";
  public static Retrofit retrofit;
  public static Retrofit getRetrofit(){
    if (retrofit==null){
      retrofit = new Retrofit.Builder()
              .baseUrl(baseurl)
              .addConverterFactory(GsonConverterFactory.create())
              .build();
    }
    return retrofit;
  }
}
