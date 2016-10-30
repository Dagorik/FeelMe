package com.lendmybook.dagorik.feelme;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.lendmybook.dagorik.feelme.models.Face;
import com.lendmybook.dagorik.feelme.models.FaceRectangle;
import com.lendmybook.dagorik.feelme.models.Scores;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.HTTP;
import retrofit2.http.Url;

public class MainActivity extends AppCompatActivity {

    private String urlString = "http://www.soyvisual.org/sites/default/files/styles/augmentative_resource_lightbox/public/images/photos/personas.jpg?itok=zoIftjz0";
    private RecyclerView recyclerViewFaces;
    private FacesAdapter facesAdapter;
    private List<Face> faceAdapterList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFeelings(urlString);
        faceAdapterList = new ArrayList<>();


        setupRecycler();

    }

    private void loadFeelings(final String urlString) {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
                .addInterceptor(logging);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.projectoxford.ai")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        EmotionInterface client = retrofit.create(EmotionInterface.class);

        client.getFace(new com.lendmybook.dagorik.feelme.models.Url(urlString)).enqueue(new Callback<List<Face>>() {
            @Override
            public void onResponse(Call<List<Face>> call, Response<List<Face>> response) {
                Log.e("MyLogResult", "code:" + response.code());
                String json = response.body().toString();

                Log.e("MyLogResult", json);
            }

            @Override
            public void onFailure(Call<List<Face>> call, Throwable t) {
                Log.e("ErrorOnFilure", t.getMessage());
            }
        });
    }

    public void setupRecycler(){
        recyclerViewFaces= (RecyclerView) findViewById(R.id.recycler_faces);
        recyclerViewFaces.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerViewFaces.setHasFixedSize(true);
        facesAdapter = new FacesAdapter(faceAdapterList);
        recyclerViewFaces.setAdapter(facesAdapter);


    }

}
