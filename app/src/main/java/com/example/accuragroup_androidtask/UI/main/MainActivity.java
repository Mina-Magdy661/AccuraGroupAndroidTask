package com.example.accuragroup_androidtask.UI.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.accuragroup_androidtask.R;
import com.example.accuragroup_androidtask.UI.adpter.ResturnatNameAdapter;
import com.example.accuragroup_androidtask.databinding.ActivityListRestaurantsBinding;
import com.example.accuragroup_androidtask.databinding.ActivityMainBinding;
import com.example.accuragroup_androidtask.pojo.LoginRequest;
import com.example.accuragroup_androidtask.pojo.LoginResponse;
import com.example.accuragroup_androidtask.viewModel.LoginViewModel;
import com.example.accuragroup_androidtask.viewModel.ResturantNameViewModel;

public class MainActivity extends AppCompatActivity {



        private ActivityMainBinding binding ;
        LoginRequest loginRequest ;
        String mobile ;
        String password ;
        String access_key = "Gdka52DASWE3DSasWE742Wq";
        String access_password = "yH52dDDF85sddEWqPNV7D12sW5e";
        LoginViewModel loginViewModel ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);



        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                loginRequest = new LoginRequest
                        (binding.editMobile.getText().toString() , binding.editPassword.getText().toString() , access_key , access_password);
                loginViewModel.getUserInfo(loginRequest);

                loginViewModel.loginResponseMutableLiveData.observe(MainActivity.this, new Observer<LoginResponse>() {
                    @Override
                    public void onChanged(LoginResponse loginResponse) {


                        if(loginResponse.getSub_message().equals("success")){

                            Intent intent = new Intent(MainActivity.this , ListRestaurants.class);
                            startActivity(intent);

                        }else if(loginResponse.getSub_message().equals("failure")) {
                            Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                        }

                    }
                });



            }
        });
    }
}