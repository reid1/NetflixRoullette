package com.example.rarnold.netflixroulette;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
    }

    //Method called when button is clicked to take user to the InputActivity
    public void getStarted(View view){
        Intent intent = new Intent(this,InputActivity.class);
        startActivity(intent);
    }
}
