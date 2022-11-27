package com.rvproject.angryflappybird;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rvproject.angryflappybird.R;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void startGame(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}