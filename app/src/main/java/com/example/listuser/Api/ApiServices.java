package com.example.listuser.Api;

import com.example.listuser.Model.ResponceModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;

public interface ApiServices
{
    
       @GET("unknown")
       Call<List<ResponceModel>>getData();
}
