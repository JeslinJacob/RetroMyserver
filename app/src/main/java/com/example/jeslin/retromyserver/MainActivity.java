package com.example.jeslin.retromyserver;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_retrofit;
    private Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_retrofit=(RecyclerView)findViewById(R.id.rview);
        rv_retrofit.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        APIInterface apiInterface= APIClient.getClient().create(APIInterface.class);
        Call<ArrayList<Student>> call= apiInterface.getStudentList();
        call.enqueue(new Callback<ArrayList<Student>>() {
            @Override
            public void onResponse(Call<ArrayList<Student>> call, Response<ArrayList<Student>> response) {



                Log.d("SIZE>>",52+" 333333333333333333**************())))))))))))"+response.body().size());
                adapter = new Adapter(getApplicationContext(),response.body());
                rv_retrofit.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ArrayList<Student>> call, Throwable t) {

            }
        });

    }
}
