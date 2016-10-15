package app.movies.android.example.com.popularmovies;

/**
 * Created by Mahesh on 9/22/2016.
 */

import java.util.List;

/*
*
* Custom interface to implement a call back function that returns results
* from an async task
*
* */

public interface AsyncResponse {

    void onTaskCompleted(List<Movie> results);

}