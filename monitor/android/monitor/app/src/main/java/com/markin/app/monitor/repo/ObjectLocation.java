package com.markin.app.monitor.repo;

import android.util.Log;

import com.google.gson.Gson;
import com.markin.app.monitor.model.Data;
import com.markin.app.monitor.util.RestClient;

/**
 * Created by salagumalai on 16-04-2016.
 */
public class ObjectLocation {

    private static final String TAG = "ObjectLocation";
    private static final String PRODUCT_WEB_SERVICE_URL = "http://appdatahandler.azurewebsites.net/Api/location";

    public Data getLocationByDevice(){
        //setting header to request for a JSON response
        RestClient client = new RestClient();
        String locationJSONStr = client.getHttpResponse();
        Log.d(TAG, "Response: " + locationJSONStr );
        return convertJson(locationJSONStr);
    }

    private Data convertJson(String productJSONStr) {
        Data data = null;
        if (productJSONStr != null && productJSONStr.length() > 0) {
            try {
                Gson gson = new Gson();
                data = gson.fromJson(productJSONStr, Data.class);
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
        return data;
    }
}
