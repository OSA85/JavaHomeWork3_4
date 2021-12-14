package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {

    private Movie[] movies = new Movie[0];
    private int shouldMovieInPoster = 10;


    public MovieManager() {
    }

    public MovieManager(int shouldMovieInPoster) {
        this.shouldMovieInPoster = shouldMovieInPoster;
    }

    public int getShouldMovieInPoster() {
        return shouldMovieInPoster;
    }

    public void setShouldMovieInPoster(int shouldMovieInPoster) {
        this.shouldMovieInPoster = shouldMovieInPoster;
    }

    public Movie[] getMovies() {
        return movies;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }

    public void save(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] findAll() {
        return movies;
    }


    public void removeMovieId(int id) {
        int length = movies.length - 1;
        Movie[] tmp = new Movie[length];
        int index = 0;
        for (Movie movie : movies) {
            if (movie.getId() != id) {
                tmp[index] = movie;
                index++;
            }
            movies = tmp;
        }
    }

    public Movie[] shouldPoster() {
        int newLength;
        if (movies.length > shouldMovieInPoster) {
            newLength = shouldMovieInPoster;
        } else {
            newLength = movies.length;
        }
        Movie[] poster = new Movie[newLength];
        for (int i = 0; i < poster.length; i++) {
            int index = movies.length - i - 1;
            poster[i] = movies[index];
        }
        return poster;
    }


}
