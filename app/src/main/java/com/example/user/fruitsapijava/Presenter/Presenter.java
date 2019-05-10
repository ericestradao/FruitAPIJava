package com.example.user.fruitsapijava.Presenter;

import com.example.user.fruitsapijava.Model.ConnectApi;
import com.example.user.fruitsapijava.Model.FruitInterface;
import com.example.user.fruitsapijava.Model.FruitPojo;
import com.example.user.fruitsapijava.View.ViewContract;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Presenter implements PresenterContract{
    final String TAG = Presenter.class.getSimpleName();
    ViewContract viewContract;

    public Presenter(ViewContract viewContract) {
        this.viewContract = viewContract;
    }

    @Override
    public void getFruit() {
        Retrofit retrofit = ConnectApi.getInstance().initRetrofit();
        FruitInterface chuckNorrisApiInterface = retrofit.create(FruitInterface.class);
        chuckNorrisApiInterface.getData().enqueue(new Callback<FruitPojo>() {
            @Override
            public void onResponse(Call<FruitPojo> call, Response<FruitPojo> response) {
                viewContract.populateData(response.body());

            }

            @Override
            public void onFailure(Call<FruitPojo> call, Throwable t) {

            }
        });
    }
}
