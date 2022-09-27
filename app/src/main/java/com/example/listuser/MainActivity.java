package com.example.listuser;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.listuser.Api.ApiServices;
import com.example.listuser.Api.RetrofitClient;
import com.example.listuser.Model.ResponceModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
TextView txt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.text);
        txt.setText("");
        try {
            ApiServices api = RetrofitClient.getRetrofit().create(ApiServices.class);
            Call<List<ResponceModel>>call = api.getData();
            call.enqueue(new Callback<List<ResponceModel>>() {
                @Override
                public void onResponse(Call<List<ResponceModel>> call, Response<List<ResponceModel>> response) {

                    List<ResponceModel>data = response.body();
                    for (int i =0;i<data.size();i++)
                    {
                        txt.append("name: "+data.get(i).getName()+"\ncolor: "+data.get(i).getColor());
                    }

                }

                @Override
                public void onFailure(Call<List<ResponceModel>> call, Throwable t) {
                    Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                }
            });
        }catch (Exception e){
            Log.d("##Error",e.getMessage());
        }

    }
}