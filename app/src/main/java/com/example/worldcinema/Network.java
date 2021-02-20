package com.example.worldcinema;

import android.app.Activity;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Network {
    private static Network mInstance;
    private static Retrofit retrofit;
    private static final String BASE_URL="https://petstore.swagger.io/v2/";//"https://jsonplaceholder.typicode.com/";



    private Network() {
        //Log'ироване
        /*HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder client = new OkHttpClient.Builder()
                .addInterceptor(interceptor);*/

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static Network getInstance() {
        if (mInstance == null) {
            mInstance = new Network();
        }
        return mInstance;
    }

    public static Rest getApi(){
        return retrofit.create(Rest.class);
    }


}
