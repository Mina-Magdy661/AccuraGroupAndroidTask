package com.example.accuragroup_androidtask.data;

import com.example.accuragroup_androidtask.pojo.LoginRequest;
import com.example.accuragroup_androidtask.pojo.LoginResponse;
import com.example.accuragroup_androidtask.pojo.RestaurantModel;


import retrofit2.Call;

import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ResturantInterface {

    @POST("getResturants")

    public Call<RestaurantModel> getResturant();

    @POST("login")

    public Call<LoginResponse> gerUserInfro(@Body LoginRequest loginRequest);

}
