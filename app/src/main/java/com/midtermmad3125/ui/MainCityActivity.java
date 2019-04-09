package com.midtermmad3125.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.midtermmad3125.R;
import com.midtermmad3125.utils.ReadJSONUtils;

import org.json.JSONObject;


public class MainCityActivity extends AppCompatActivity
    {
        private TextView cityname;
        private TextView lati;
        private TextView longi;
        private TextView population;
        private Button btnDisplay;


        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            cityname=findViewById(R.id.cityname);
            lati=findViewById(R.id.latitude);
            longi=findViewById(R.id.longitude);
            population=findViewById(R.id.population);
            btnDisplay=findViewById(R.id.btnDisplay);
            ProcessData();

            btnDisplay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent i=new Intent(MainCityActivity.this,WeatherListActivity.class);
                    i.putExtra("name","jagmeet");
                    startActivity(i);

                }
            });




        }
        public void ProcessData (){
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





    }

