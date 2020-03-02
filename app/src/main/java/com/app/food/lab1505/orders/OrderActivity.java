package com.app.food.lab1505.orders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.app.food.lab1505.R;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String orderName = intent.getExtras().getString("orderName");
        int quantityNumber = intent.getExtras().getInt("quantity");

       // Toast.makeText(this, orderName, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, String.valueOf(quantityNumber), Toast.LENGTH_SHORT).show();

    }
}
