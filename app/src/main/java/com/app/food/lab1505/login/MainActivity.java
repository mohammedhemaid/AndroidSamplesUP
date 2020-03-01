package com.app.food.lab1505.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.app.food.lab1505.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String food = intent.getExtras().getString("food");
        Toast.makeText(this,food,Toast.LENGTH_LONG).show();
    }
}
