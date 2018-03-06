package com.example.jeslin.retromyserver;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by JeSLiN on 17-11-2017.
 */

public interface APIInterface {
    @GET("AllStudentData.php")
    Call<ArrayList<Student>> getStudentList();
}

