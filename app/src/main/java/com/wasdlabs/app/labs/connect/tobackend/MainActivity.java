package com.wasdlabs.app.labs.connect.tobackend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wasdlabs.app.labs.connect.tobackend.model.Book;
import com.wasdlabs.app.labs.connect.tobackend.model.Item;
import com.wasdlabs.app.labs.connect.tobackend.retrofit.ApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements Callback<Book> {
    String BASE_URL = "https://www.googleapis.com/books/v1/";
    String API_KEY = "AIzaSyARrAP9jrxZu5SFt8zIe4YayohQp6Rhh98";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start();
    }

    public void start() {
        //bikin gsonnya
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        //bikin retrofitnya
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        //bikin objek interfacenya
        ApiService apiService= retrofit.create(ApiService.class);

        //panggil api
        Call<Book> call = apiService.getBook(API_KEY, "flower");
        call.enqueue(this);

    }

    @Override
    public void onResponse(Call<Book> call, Response<Book> response) {
        if(response.isSuccessful()) {
            Book book = response.body();

            List<Item> items = book.getItems();
            Log.e("Total Item", "total item:"+ book.getTotalItems());
        } else {
            Log.e("ERROR", response.errorBody().toString());
        }
    }

    @Override
    public void onFailure(Call<Book> call, Throwable t) {
        t.printStackTrace();
    }
}
