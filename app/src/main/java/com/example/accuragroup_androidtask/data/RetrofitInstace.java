package com.example.accuragroup_androidtask.data;


import com.example.accuragroup_androidtask.pojo.LoginRequest;
import com.example.accuragroup_androidtask.pojo.LoginResponse;
import com.example.accuragroup_androidtask.pojo.RestaurantModel;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstace {

    private static final String BASE_URL = "http://otlob.accuragroup-eg.net/api/";
    private ResturantInterface resturantInterface;
    private static RetrofitInstace INSTANCE ;

    public RetrofitInstace() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        resturantInterface = retrofit.create(ResturantInterface.class);
    }

    public static RetrofitInstace getINSTANCE() {
        if(INSTANCE == null){

            INSTANCE = new RetrofitInstace();
        }
        return INSTANCE;
    }



    public Call<RestaurantModel> CallgetData(){

            return resturantInterface.getResturant();
    }

    public Call<LoginResponse> getUserInfo(LoginRequest loginRequest){

        return  resturantInterface.gerUserInfro(loginRequest);
    }


}

