package com.example.accuragroup_androidtask.viewModel;

import android.util.Log;
import android.view.View;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.accuragroup_androidtask.data.RetrofitInstace;
import com.example.accuragroup_androidtask.pojo.LoginRequest;
import com.example.accuragroup_androidtask.pojo.LoginResponse;
import com.example.accuragroup_androidtask.pojo.RestaurantModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginViewModel extends ViewModel {

    public MutableLiveData<LoginResponse> loginResponseMutableLiveData = new MutableLiveData<>();

    public void getUserInfo(LoginRequest loginRequest){

        RetrofitInstace.getINSTANCE().getUserInfo(loginRequest).enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {

                loginResponseMutableLiveData.setValue(response.body());
                Log.d("test1" , response.body().getMessage());

            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {

            }
        });

    }



}
