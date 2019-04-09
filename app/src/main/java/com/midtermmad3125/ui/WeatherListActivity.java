package com.midtermmad3125.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.midtermmad3125.Adapter.WeatherAdapter;
import com.midtermmad3125.R;
import com.midtermmad3125.utils.ReadJSONUtils;

import org.json.JSONObject;

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

  /*  public void ProcessData (){
        String JsonData = ReadJSONUtils.loadJSONFromAsset(this,"moscow_weather.json");

        try {
            JSONObject cityData = new JSONObject(JsonData);
            JSONObject cityObject= cityData.getJSONObject("city");
            cityname.setText(cityObject.getString("name"));

            JSONObject cityCoordObject= cityObject.getJSONObject("coord");

            lati.setText("Latitude: "+cityCoordObject.getString("lat"));
            longi.setText("Longitude: "+cityCoordObject.getString("lon"));

            //  citycode.setText("Country: "+cityObject.getString("country"));
            population.setText("population: "+cityObject.getString("population"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

*/

}
