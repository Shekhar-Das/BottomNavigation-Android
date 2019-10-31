package com.das.shortcutandroidstudo.Api;

import android.text.TextUtils;
import android.util.Log;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class ServiceGenerator  {
    
    

    public static final String API_BASE_URL = "https://gorest.co.in/public-api/users";
    private static OkHttpClient.Builder httpclicnt = new OkHttpClient.Builder();


    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createService(Class<S> serviceClass) {
        return createService(serviceClass, null);
    }


    

    private static <S> S createService(
            
            Class<S> serviceClass, final String authToken) {
       // String retorfit;
        if (!TextUtils.isEmpty(authToken)) {
            AuthenticationInterceptor interceptor = new AuthenticationInterceptor(authToken);

            Log.d("Das", "createService: "+interceptor);

            if (!httpclicnt.interceptors().contains(interceptor)) {
                httpclicnt.addInterceptor(interceptor);

                builder.client(httpclicnt.build());

               // retorfit = String.valueOf(builder.build());
            }
        }

        return null;// retorfit.create(serviceClass);
    }


}
