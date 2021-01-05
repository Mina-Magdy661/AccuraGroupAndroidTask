package com.example.accuragroup_androidtask.UI.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.accuragroup_androidtask.R;
import com.example.accuragroup_androidtask.UI.adpter.AvailableMealsAdapter;
import com.example.accuragroup_androidtask.databinding.ActivityAvailableMealsBinding;
import com.example.accuragroup_androidtask.pojo.RestaurantModel;
import com.example.accuragroup_androidtask.pojo.RestaurantName;
import com.example.accuragroup_androidtask.viewModel.AvailableMealViewModel;

import java.util.ArrayList;

public class AvailableMeals extends AppCompatActivity {

    private ActivityAvailableMealsBinding binding ;

    AvailableMealViewModel availableMealViewModel;
    AvailableMealsAdapter availableMealsAdapter ;
    String getId ;
    int id ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAvailableMealsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_right);
        binding.viewExpand.setAnimation(animation);


        Intent intent = getIntent();
        getId = intent.getStringExtra("id");
        id = ( Integer.parseInt(getId) - 1 ) ;



        availableMealViewModel = ViewModelProviders.of(this).get(AvailableMealViewModel.class);
        availableMealViewModel.getResturant();

        binding.recycle.setLayoutManager(new LinearLayoutManager(this));



        availableMealViewModel.restaurantModelMutableLiveData.observe(this, new Observer<RestaurantModel>() {
            @Override
            public void onChanged(RestaurantModel restaurantModel) {

                ArrayList<RestaurantName> listName = restaurantModel.getRestaurantName();

                availableMealsAdapter =new AvailableMealsAdapter(restaurantModel.getRestaurantName().get(id).getProducts() , AvailableMeals.this);
                binding.recycle.setAdapter(availableMealsAdapter);

                Log.d("test",listName.get(id).getProducts().get(0).getProd_name());

            }
        });


    }


}