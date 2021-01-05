package com.example.accuragroup_androidtask.UI.adpter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public class ResturnatNameAdapter extends RecyclerView.Adapter<ResturnatNameAdapter.RestrunatNameViewHolder> {

    private List<RestaurantName> restaurantNameList ;
    Context context;

    public ResturnatNameAdapter(List<RestaurantName> restaurantNameList, Context context) {
        this.restaurantNameList = restaurantNameList;
        this.context = context;
    }

    @NonNull
    @Override
    public RestrunatNameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RestrunatNameViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_restaurants_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RestrunatNameViewHolder holder, int position) {

        holder.txtNameResturant.setText(restaurantNameList.get(position).getRest_name());
        String imgURL = restaurantNameList.get(position).getRest_img();


        Glide.with(context).load(imgURL).circleCrop().into(holder.imgResturant);

        holder.btnArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context , AvailableMeals.class);
                intent.putExtra("id" , restaurantNameList.get(position).getRest_id());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return restaurantNameList.size();
    }

    public class RestrunatNameViewHolder extends RecyclerView.ViewHolder {

        TextView txtNameResturant ;
        ImageView imgResturant ;
        ImageView btnArrow ;

        public RestrunatNameViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNameResturant = itemView.findViewById(R.id.txtNameResturant);
            imgResturant = itemView.findViewById(R.id.imgResturant);
            btnArrow = itemView.findViewById(R.id.btnArrow);
        }
    }
}
