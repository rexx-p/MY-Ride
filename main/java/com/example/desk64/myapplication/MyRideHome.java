package com.example.desk64.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MyRideHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_ride_home);
    }

    public void goto2(View view){
        Intent intent = new Intent(this,TakePhoto.class);
        startActivity(intent);

    }
    public void goToLogin(View view){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);

    }



}
