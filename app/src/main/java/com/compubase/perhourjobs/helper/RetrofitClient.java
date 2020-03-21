package com.compubase.perhourjobs.helper;

import com.compubase.perhourjobs.BuildConfig;
import com.ihsanbal.logging.Level;
import com.ihsanbal.logging.LoggingInterceptor;
import okhttp3.OkHttpClient;
import okhttp3.internal.platform.Platform;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitClient {


    private static OkHttpClient.Builder getInterceptor() {

        return new OkHttpClient.Builder()
                .addInterceptor(new LoggingInterceptor.Builder()
                        .loggable(BuildConfig.DEBUG)
                        .setLevel(Level.BASIC)
                        .log(Platform.INFO)
                        .request("Request")
                        .response("Response")
                        .addHeader("version", BuildConfig.VERSION_NAME)
                        .addQueryParam("query", "0")
                        .build());
    }


    public static Retrofit getInstant() {
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.baseUrl("http://trip.technowow.net/triping.asmx/");
        builder.addConverterFactory(ScalarsConverterFactory.create());
        builder.client(getInterceptor().build());
        Retrofit retrofit = builder.build();

        return retrofit;
    }
}