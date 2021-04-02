package com.example.paging__roomdatabase__retrofit___livedata__viewmodel__databinding.Network;



import com.example.paging__roomdatabase__retrofit___livedata__viewmodel__databinding.Modal.MoviesDetail;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DetailsApi {

    @GET("movies-detail.php")
    Call<List<MoviesDetail>> getAllMoviesDetails();
}
