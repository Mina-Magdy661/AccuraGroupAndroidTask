package com.example.accuragroup_androidtask.UI.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.accuragroup_androidtask.UI.adpter.ResturnatNameAdapter;
import com.example.accuragroup_androidtask.databinding.ActivityListRestaurantsBinding;
import com.example.accuragroup_androidtask.pojo.RestaurantModel;
import com.example.accuragroup_androidtask.viewModel.ResturantNameViewModel;

public class ListRestaurants extends AppCompatActivity {

    ResturantNameViewModel resturantNameViewModel;
    ResturnatNameAdapter resturnatNameAdapter ;

    private ActivityListRestaurantsBinding binding ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListRestaurantsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        resturantNameViewModel = ViewModelProviders.of(this).get(ResturantNameViewModel.class);
        resturantNameViewModel.getResturant();

        binding.recycle.setLayoutManager(new LinearLayoutManager(this));

        resturantNameViewModel.restaurantModelMutableLiveData.observe(this, new Observer<RestaurantModel>() {
            @Override
            public void onChanged(RestaurantModel restaurantModel) {

                resturnatNameAdapter =new ResturnatNameAdapter(restaurantModel.getRestaurantName() , ListRestaurants.this);
                binding.recycle.setAdapter(resturnatNameAdapter);
            }
        });


    }
}