package com.example.paging__roomdatabase__retrofit___livedata__viewmodel__databinding.Respository;

import android.app.Application;

import androidx.lifecycle.LiveData;


import com.example.paging__roomdatabase__retrofit___livedata__viewmodel__databinding.Database.MoviesDatabase;
import com.example.paging__roomdatabase__retrofit___livedata__viewmodel__databinding.Modal.MoviesDetail;

import java.util.List;

public class MoviesDetailRepository {

    private MoviesDatabase moviesDatabase;
    private LiveData<List<MoviesDetail>> getAllMoviesDetail;

    public MoviesDetailRepository(Application application)
    {
      moviesDatabase=MoviesDatabase.getInstance(application);
      getAllMoviesDetail=moviesDatabase.moviesDao().getAllMoviesDetails();
    }

    public LiveData<List<MoviesDetail>> getAllMovieDetails()
    {
        return getAllMoviesDetail;
    }
}
