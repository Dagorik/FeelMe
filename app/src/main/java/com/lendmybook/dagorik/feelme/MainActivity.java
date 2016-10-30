package com.lendmybook.dagorik.feelme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.lendmybook.dagorik.feelme.models.Face;
import com.lendmybook.dagorik.feelme.models.FaceRectangle;
import com.lendmybook.dagorik.feelme.models.Scores;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.HTTP;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFeelings("http://blog.stranijezici.com/wp-content/uploads/2012/03/Fotolia_4713529_M.jpg");
    }

    private void loadFeelings(final String url) {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
                .addInterceptor(logging);



        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.projectoxford.ai")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        EmotionInterface client = retrofit.create(EmotionInterface.class);

        client.getFace(url).enqueue(new Callback<Face>() {
            @Override
            public void onResponse(Call<Face> call, Response<Face> response) {
                Log.e("MyLogResult","code:"+ response.code());
                String json = response.body().toString();

                Log.e("MyLogResult", json);
            }

            @Override
            public void onFailure(Call<Face> call, Throwable t) {
                Log.e("MyLog", t.getMessage());
            }
        });
    }
}
