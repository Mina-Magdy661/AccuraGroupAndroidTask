package com.example.accuragroup_androidtask.UI.adpter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.accuragroup_androidtask.R;
import com.example.accuragroup_androidtask.UI.main.AvailableMeals;
import com.example.accuragroup_androidtask.pojo.RestaurantName;
import com.example.accuragroup_androidtask.pojo.ResturantProudct;

import java.util.List;

public class AvailableMealsAdapter extends RecyclerView.Adapter<AvailableMealsAdapter.RestrunatNameViewHolder> {

    private List<ResturantProudct> resturantProudcts ;
    Context context;

    public AvailableMealsAdapter(List<ResturantProudct> resturantProudcts, Context context) {
        this.resturantProudcts = resturantProudcts;
        this.context = context;
    }

    @NonNull
    @Override
    public RestrunatNameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RestrunatNameViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.available_meal_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RestrunatNameViewHolder holder, int position) {

        holder.txtNameProudct.setText(resturantProudcts.get(position).getProd_name());
        holder.txtPriceProudct.setText(resturantProudcts.get(position).getProd_price());

        String imgURL = resturantProudcts.get(position).getProd_image();


        Glide.with(context).load(imgURL).circleCrop().into(holder.imgMeal);


    }

    @Override
    public int getItemCount() {
        return resturantProudcts.size();
    }

    public class RestrunatNameViewHolder extends RecyclerView.ViewHolder {

        TextView txtNameProudct , txtPriceProudct ;
        ImageView imgMeal ;

        public RestrunatNameViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNameProudct = itemView.findViewById(R.id.txtNameProudct);
            txtPriceProudct = itemView.findViewById(R.id.txtProudctPrice);
            imgMeal = itemView.findViewById(R.id.imgProudct);
        }
    }
}
