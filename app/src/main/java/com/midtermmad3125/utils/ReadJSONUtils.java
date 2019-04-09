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


}
