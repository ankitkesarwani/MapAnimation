package com.example.kesar.mapanimation.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by kesar on 12/4/2017.
 */

public interface IGoogleApi {

    @GET
    Call<String> getDataFromGoogleApi(@Url String url);

}
