package com.midtermmad3125.utils;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.Log;

import com.midtermmad3125.city;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

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

    public static String getDateFromTimeStamp(long time)
    {
        Calendar cal = Calendar.getInstance(Locale.ENGLISH);
        cal.setTimeInMillis(time * 1000L);
        String date = DateFormat.format("EEEE", cal).toString();
        date += "\n" + DateFormat.format("dd MMM yyyy", cal).toString();
        date += "\n" + DateFormat.format("hh:mm a", cal).toString();
        return date;
    }


}
