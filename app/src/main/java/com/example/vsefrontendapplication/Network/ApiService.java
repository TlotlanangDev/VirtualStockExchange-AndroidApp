package com.example.vsefrontendapplication.Network;

import com.example.vsefrontendapplication.Model.login;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("api/v1/stockExchange/company/login")
    Call<login> loginCompany(
            @Query("email") String email,
            @Query("password") String password
    );
}
