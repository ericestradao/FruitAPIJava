package com.example.user.fruitsapijava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FruitInformation extends AppCompatActivity {
    TextView infoFruit;
    TextView priceFruit;
    TextView weightFruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_information);

        Intent intent = getIntent();
        String info = intent.getStringExtra("type");
        Integer price = intent.getIntExtra("price", 0);
        Integer weight = intent.getIntExtra("weight", 0);

        infoFruit = findViewById(R.id.tv_info);
        infoFruit.setText(info);

        priceFruit = findViewById(R.id.tv_price);
        priceFruit.setText(Integer.toString(price));

        weightFruit = findViewById(R.id.tv_weight);
        weightFruit.setText(Integer.toString(weight));


    }


}
