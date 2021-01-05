package com.example.accuragroup_androidtask.viewModel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.accuragroup_androidtask.data.RetrofitInstace;
import com.example.accuragroup_androidtask.pojo.RestaurantModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AvailableMealViewModel extends ViewModel {

  public MutableLiveData<RestaurantModel> restaurantModelMutableLiveData = new MutableLiveData<>();

    public void getResturant(){

        RetrofitInstace.getINSTANCE().CallgetData().enqueue(new Callback<RestaurantModel>() {
            @Override
            public void onResponse(Call<RestaurantModel> call, Response<RestaurantModel> response) {

                restaurantModelMutableLiveData.setValue(response.body());

                Log.d("test", response.body().getMessage());

            }

            @Override
            public void onFailure(Call<RestaurantModel> call, Throwable t) {

                Log.d("test", "FAIL");
            }
        });

    }

}
