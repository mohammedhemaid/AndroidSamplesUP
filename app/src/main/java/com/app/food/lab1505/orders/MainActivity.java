package com.app.food.lab1505.orders;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.app.food.lab1505.R;

public class MainActivity extends AppCompatActivity {

    EditText orderEditText;
    Button increaseQuantityButton;
    Button decreaseQuantityButton;
    TextView quantityText;
    Button makeOrder;

    int quantityNumber = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        orderEditText = findViewById(R.id.order_name);
        increaseQuantityButton = findViewById(R.id.increase_quantity);
        decreaseQuantityButton = findViewById(R.id.decrease_quantity);
        quantityText = findViewById(R.id.quantity);
        makeOrder = findViewById(R.id.make_order);

        increaseQuantity();
        decreaseQuantity();
        makeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeOrder();
            }
        });


    }

    private void makeOrder() {
        if (TextUtils.isEmpty(orderEditText.getText())) {
            Toast.makeText(this, "edit is empty", Toast.LENGTH_SHORT).show();
            return;
        }
        String orderName = orderEditText.getText().toString();
        Intent intent = new Intent(MainActivity.this, OrderActivity.class);
        intent.putExtra("orderName", orderName);
        intent.putExtra("quantity", quantityNumber);
        startActivity(intent);
    }

    private void decreaseQuantity() {
        decreaseQuantityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quantityNumber < 2) {
                    Toast.makeText(MainActivity.this, "you order less than 0", Toast.LENGTH_SHORT).show();
                    return;
                }
                quantityText.setText(String.valueOf(--quantityNumber));
            }
        });
    }

    private void increaseQuantity() {
        increaseQuantityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantityText.setText(String.valueOf(++quantityNumber));
            }
        });
    }
}
