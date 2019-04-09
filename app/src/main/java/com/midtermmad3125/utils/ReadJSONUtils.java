package com.midtermmad3125.utils;

import android.content.Context;
import android.util.Log;

import com.midtermmad3125.city;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadJSONUtils {
    private ArrayList<city> cityDetails;


    public static String loadJSONFromAsset(Context context, String moscow_weather) {
        String jsonString;
        try {
            InputStream is = context.getAssets().open("moscow_weather.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            int count = is.read(buffer);
            is.close();
            jsonString = new String(buffer, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return jsonString;
    }

    private void processJSON() {
        String js = loadJSONFromAsset();
        if (js != null) {
            // Log.d("json",js);
            try {
                JSONArray mJSONArray = new JSONArray(js);
                cityDetails = new ArrayList<>();
                for (int i = 0; i < mJSONArray.length(); i++) {

                    JSONObject mJSONObj = mJSONArray.getJSONObject(i);
                    //  Log.d("mjson", mJSONObj.toString());
                    if (mJSONObj.has("sid")) {
                        String name = mJSONObj.getString("name");
                        String longitude = mJSONObj.getString("longitude");
                        String latitude = mJSONObj.getString("latitude");
                        String population = mJSONObj.getString("population");
                        Log.d("mjson_name", String.valueOf(name));
                        Log.d("mjson_longitude", String.valueOf(longitude));
                        Log.d("mjson_latitude", String.valueOf(latitude));
                        Log.d("mjson_population", String.valueOf(population));
                        cityDetails.add(new city(String.valueOf(name), String.valueOf(longitude), String.valueOf(latitude), String.valueOf(population)));


                        for (city str : cityDetails) {
                            System.out.println(str.getCity());
                            // System.out.println(str.getS());


                            ;
                            Iterator<city> it = cityDetails.iterator();
                            while (it.hasNext()) {
                                System.out.println(it.next().getCity());
                            }
                        }
                    }
                }

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
