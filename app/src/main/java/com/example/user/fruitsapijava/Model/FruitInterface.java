package com.example.user.fruitsapijava.Model;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FruitInterface {
    @GET("data.json")
    Call<FruitPojo> getData ();
}
