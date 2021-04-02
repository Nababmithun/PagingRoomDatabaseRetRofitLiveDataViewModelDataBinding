package com.example.paging__roomdatabase__retrofit___livedata__viewmodel__databinding.Dao;

import androidx.lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.paging.PagedList;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;


import com.example.paging__roomdatabase__retrofit___livedata__viewmodel__databinding.Modal.Movies;
import com.example.paging__roomdatabase__retrofit___livedata__viewmodel__databinding.Modal.MoviesDetail;

import java.util.List;

@Dao
public interface MoviesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(List<Movies> moviesList);

    @Query("DELETE FROM movies")
    void deleteAll();

    @Query("SELECT * FROM movies ORDER BY database_id ASC")
    DataSource.Factory<Integer,Movies> getAllMovies();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert_movies_details(List<MoviesDetail> moviesDetailList);

    @Query("SELECT * FROM movies_detail")
    LiveData<List<MoviesDetail>> getAllMoviesDetails();
}
