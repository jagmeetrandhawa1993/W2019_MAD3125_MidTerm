package com.midtermmad3125.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.midtermmad3125.Adapter.WeatherAdapter;
import com.midtermmad3125.R;

import java.util.ArrayList;
import java.util.List;

public class WeatherListActivity extends AppCompatActivity
{
    private RecyclerView mRecyclerView;

    private List<Object> mRecyclerViewItems = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_list);



        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);


        RecyclerView.Adapter adapter = new WeatherAdapter(this, mRecyclerViewItems);
        mRecyclerView.setAdapter(adapter);






    }
}
