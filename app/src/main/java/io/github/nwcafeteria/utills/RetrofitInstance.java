package io.github.nwcafeteria.utills;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    //defining and declaring base url
    private static Retrofit retrofit;
    private static final String ZOMATO_BASE_URL = "https://developers.zomato.com/api/v2.1/";

    public static Retrofit getRetrofitInst() {
        //initializing instance
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(ZOMATO_BASE_URL)
                    .build();
        }

        return retrofit;
    }
}
