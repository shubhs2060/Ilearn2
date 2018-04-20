package com.ilearn.isdcgloballimited.ilearn.api.services;

import com.ilearn.isdcgloballimited.ilearn.api.model.Course;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by rubyeffect on 19/4/18.
 */

public interface CourseClient {

    @GET("/search?q={keyword}")
    Call<List<Course>>getCourse(@Path("keyword")String keyword);


}
