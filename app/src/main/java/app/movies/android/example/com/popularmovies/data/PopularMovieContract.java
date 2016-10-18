package app.movies.android.example.com.popularmovies.data;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * DB contract. currently just a single table
 */
public class PopularMovieContract {

    public static final String CONTENT_AUTHORITY = "app.movies.android.example.com.popularmovies";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    public static  final String PATH_MOVIES = "movies";


//    public static  final String PATH_REVIEWS = "reviews";
//    public static  final String PATH_TRAILERS = "trailers";

    public static final class MovieEntry implements BaseColumns {

        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_MOVIES).build();

        public static final String CONTENT_TYPE =
                "vnd.android.cursor.dir/" + CONTENT_AUTHORITY + "/" + PATH_MOVIES;
        public static final String CONTENT_ITEM_TYPE =
                "vnd.android.cursor.item/" + CONTENT_AUTHORITY + "/" + PATH_MOVIES;

        public static final String TABLE_NAME = "movies";
        public static final String MOVIE_ID = "id";
        public static final String MOVIE_BACKDROP_URI = "backdrop_path";
        public static final String MOVIE_TITLE = "original_title";
        public static final String MOVIE_POSTER = "poster_path";
        public static final String MOVIE_OVERVIEW = "overview";
        public static final String MOVIE_VOTE_AVERAGE = "vote_average";
        public static final String MOVIE_RELEASE_DATE = "release_date";
        public static final String MOVIE_REVIEWS = "reviews";
        public static final String MOVIE_TRAILERS = "trailers";

        public static final String[] PROJECTION_ALL =
                {MOVIE_ID, MOVIE_BACKDROP_URI, MOVIE_TITLE, MOVIE_POSTER, MOVIE_OVERVIEW,
                        MOVIE_VOTE_AVERAGE, MOVIE_RELEASE_DATE, MOVIE_REVIEWS, MOVIE_TRAILERS};

        public static final String SORT_ORDER_DEFAULT =
                MOVIE_VOTE_AVERAGE + " ASC";

        public static Uri buildMovieUri(long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }
    }
}
