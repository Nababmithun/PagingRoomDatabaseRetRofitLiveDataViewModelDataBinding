package com.example.paging__roomdatabase__retrofit___livedata__viewmodel__databinding.Respository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;
import androidx.paging.PagedList;


import com.example.paging__roomdatabase__retrofit___livedata__viewmodel__databinding.Dao.MoviesDao;
import com.example.paging__roomdatabase__retrofit___livedata__viewmodel__databinding.Database.MoviesDatabase;
import com.example.paging__roomdatabase__retrofit___livedata__viewmodel__databinding.Modal.Movies;
import com.example.paging__roomdatabase__retrofit___livedata__viewmodel__databinding.Modal.MoviesDetail;

import java.util.List;

public class MoviesRepository {

    private MoviesDatabase moviesDatabase;
    private int id;

    public MoviesRepository(Application application)
    {
        moviesDatabase= MoviesDatabase.getInstance(application);
    }

   public void Insert(List<Movies> moviesList)
    {
        new InsertAsyncTask(moviesDatabase).execute(moviesList);
    }

    public void insertMoviesDetail(List<MoviesDetail> moviesDetailList){
        new InsertMoviesDetailAsyncTask(moviesDatabase).execute(moviesDetailList);
    }



    static class InsertAsyncTask extends AsyncTask<List<Movies>,Void,Void>
    {
        private MoviesDao moviesDao;

        private InsertAsyncTask(MoviesDatabase moviesDatabase)
        {
            moviesDao=moviesDatabase.moviesDao();
        }

        @Override
        protected Void doInBackground(List<Movies>... pagedLists) {
            moviesDao.insert(pagedLists[0]);
            return null;
        }
    }

    static class InsertMoviesDetailAsyncTask extends AsyncTask<List<MoviesDetail>,Void,Void>
    {
        private MoviesDao moviesDao;

        private InsertMoviesDetailAsyncTask(MoviesDatabase moviesDatabase)
        {
            moviesDao=moviesDatabase.moviesDao();
        }

        @Override
        protected Void doInBackground(List<MoviesDetail>... lists) {
            moviesDao.insert_movies_details(lists[0]);
            return null;
        }
    }
}
