package com.example.paging__roomdatabase__retrofit___livedata__viewmodel__databinding.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;


import com.example.paging__roomdatabase__retrofit___livedata__viewmodel__databinding.Modal.MoviesDetail;
import com.example.paging__roomdatabase__retrofit___livedata__viewmodel__databinding.Respository.MoviesDetailRepository;

import java.util.List;

public class MoviesDetailViewModel extends AndroidViewModel {

    private LiveData<List<MoviesDetail>> moviesDetailLiveData;
    private MoviesDetailRepository moviesRepository;

    public MoviesDetailViewModel(@NonNull Application application) {
        super(application);
        moviesRepository=new MoviesDetailRepository(application);
        moviesDetailLiveData=moviesRepository.getAllMovieDetails();
    }

    public LiveData<List<MoviesDetail>> getAllMoviesDetail()
    {
        return moviesDetailLiveData;
    }
}
