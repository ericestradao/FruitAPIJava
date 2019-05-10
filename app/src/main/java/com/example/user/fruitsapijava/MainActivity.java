package com.example.user.fruitsapijava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.user.fruitsapijava.Model.FruitPojo;
import com.example.user.fruitsapijava.Presenter.Presenter;
import com.example.user.fruitsapijava.View.Adapter;
import com.example.user.fruitsapijava.View.ViewContract;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements ViewContract {
    final String TAG = MainActivity.class.getSimpleName();
    Presenter presenter;
    Adapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ButterKnife.bind(this);
        presenter = new Presenter(this);
        presenter.getFruit();

    }

    public void populateData(FruitPojo fruitPojo) {
        adapter = new Adapter(fruitPojo, this);
        recyclerView = findViewById(R.id.rv_fruit_list);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

}
