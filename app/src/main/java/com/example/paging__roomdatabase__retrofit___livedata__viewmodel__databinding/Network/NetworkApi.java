package com.example.paging__roomdatabase__retrofit___livedata__viewmodel__databinding.Network;

import androidx.paging.PagedList;


import com.example.paging__roomdatabase__retrofit___livedata__viewmodel__databinding.Modal.Movies;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NetworkApi {

    @GET("/movies.php")
    Call<List<Movies>> getAllMovies();
}
