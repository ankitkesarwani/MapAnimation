package com.example.kesar.mapanimation;

import com.example.kesar.mapanimation.Remote.IGoogleApi;
import com.example.kesar.mapanimation.Remote.RetrofitClient;

import retrofit2.Retrofit;

/**
 * Created by kesar on 12/4/2017.
 */

public class Common {

    public static final String baseURL = "http://googleapis.com";
    public static IGoogleApi getGoogleApi() {

        return RetrofitClient.getClient(baseURL).create(IGoogleApi.class);

    }

}
