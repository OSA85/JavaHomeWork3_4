package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {


    @Test
    public void shouldAddMovies() {
        MovieManager movieManager = new MovieManager();

        Movie movie1 = new Movie(1, "1", "боевик");
        Movie movie2 = new Movie(2, "2", "мультфильм");
        Movie movie3 = new Movie(3, "3", "комедия");
        Movie movie4 = new Movie(4, "4", "боевик");
        Movie movie5 = new Movie(5, "5", "ужасы");
        Movie movie6 = new Movie(6, "6", "мультфильм");

        movieManager.save(movie1);
        movieManager.save(movie2);
        movieManager.save(movie3);
        movieManager.save(movie4);
        movieManager.save(movie5);
        movieManager.save(movie6);
        Movie[] expected = {movie1, movie2, movie3, movie4, movie5, movie6};
        Movie[] actual = movieManager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldPoster() {
        MovieManager movieManager = new MovieManager();

        Movie movie1 = new Movie(1, "1", "боевик");
        Movie movie2 = new Movie(2, "2", "мультфильм");
        Movie movie3 = new Movie(3, "3", "комедия");
        Movie movie4 = new Movie(4, "4", "боевик");
        Movie movie5 = new Movie(5, "5", "ужасы");
        Movie movie6 = new Movie(6, "6", "мультфильм");

        movieManager.save(movie1);
        movieManager.save(movie2);
        movieManager.save(movie3);
        movieManager.save(movie4);
        movieManager.save(movie5);
        movieManager.save(movie6);


        Movie[] expected = {movie6, movie5, movie4, movie3, movie2, movie1};
        Movie[] actual = movieManager.shouldPoster();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldPosterMaxInStandardRange() {
        MovieManager movieManager = new MovieManager();

        Movie movie1 = new Movie(1, "1", "боевик");
        Movie movie2 = new Movie(2, "2", "мультфильм");
        Movie movie3 = new Movie(3, "3", "комедия");
        Movie movie4 = new Movie(4, "4", "боевик");
        Movie movie5 = new Movie(5, "5", "ужасы");
        Movie movie6 = new Movie(6, "6", "мультфильм");
        Movie movie7 = new Movie(7, "7", "боевик");
        Movie movie8 = new Movie(8, "8", "мультфильм");
        Movie movie9 = new Movie(9, "9", "комедия");
        Movie movie10 = new Movie(10, "10", "боевик");
        Movie movie11 = new Movie(11, "11", "ужасы");
        Movie movie12 = new Movie(12, "12", "мультфильм");

        movieManager.save(movie1);
        movieManager.save(movie2);
        movieManager.save(movie3);
        movieManager.save(movie4);
        movieManager.save(movie5);
        movieManager.save(movie6);
        movieManager.save(movie7);
        movieManager.save(movie8);
        movieManager.save(movie9);
        movieManager.save(movie10);
        movieManager.save(movie11);
        movieManager.save(movie12);


        Movie[] expected = {movie12, movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3};
        Movie[] actual = movieManager.shouldPoster();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldPosterMaxInRangeCut() {
        MovieManager movieManager = new MovieManager(7);

        Movie movie1 = new Movie(1, "1", "боевик");
        Movie movie2 = new Movie(2, "2", "мультфильм");
        Movie movie3 = new Movie(3, "3", "комедия");
        Movie movie4 = new Movie(4, "4", "боевик");
        Movie movie5 = new Movie(5, "5", "ужасы");
        Movie movie6 = new Movie(6, "6", "мультфильм");
        Movie movie7 = new Movie(7, "7", "боевик");
        Movie movie8 = new Movie(8, "8", "мультфильм");
        Movie movie9 = new Movie(9, "9", "комедия");
        Movie movie10 = new Movie(10, "10", "боевик");
        Movie movie11 = new Movie(11, "11", "ужасы");
        Movie movie12 = new Movie(12, "12", "мультфильм");

        movieManager.save(movie1);
        movieManager.save(movie2);
        movieManager.save(movie3);
        movieManager.save(movie4);
        movieManager.save(movie5);
        movieManager.save(movie6);
        movieManager.save(movie7);
        movieManager.save(movie8);
        movieManager.save(movie9);
        movieManager.save(movie10);
        movieManager.save(movie11);
        movieManager.save(movie12);


        Movie[] expected = {movie12, movie11, movie10, movie9, movie8, movie7, movie6};
        Movie[] actual = movieManager.shouldPoster();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldPosterMinInStandardRange() {
        MovieManager movieManager = new MovieManager();

//        Movie movie1 = new Movie(1, "1", "боевик");
//        Movie movie2 = new Movie(2, "2", "мультфильм");
//        Movie movie3 = new Movie(3, "3", "комедия");
//        Movie movie4 = new Movie(4, "4", "боевик");
//        Movie movie5 = new Movie(5, "5", "ужасы");
//        Movie movie6 = new Movie(6, "6", "мультфильм");
//        Movie movie7 = new Movie(7, "7", "боевик");
        Movie movie8 = new Movie(8, "8", "мультфильм");
//        Movie movie9 = new Movie(9, "9", "комедия");
//        Movie movie10 = new Movie(10, "10", "боевик");
//        Movie movie11 = new Movie(11, "11", "ужасы");
//        Movie movie12 = new Movie(12, "12", "мультфильм");

        movieManager.save(movie8);


        Movie[] expected = {movie8};
        Movie[] actual = movieManager.shouldPoster();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldPosterMinInCutRange() {
        MovieManager movieManager = new MovieManager(5);

//        Movie movie1 = new Movie(1, "1", "боевик");
//        Movie movie2 = new Movie(2, "2", "мультфильм");
//        Movie movie3 = new Movie(3, "3", "комедия");
//        Movie movie4 = new Movie(4, "4", "боевик");
//        Movie movie5 = new Movie(5, "5", "ужасы");
//        Movie movie6 = new Movie(6, "6", "мультфильм");
//        Movie movie7 = new Movie(7, "7", "боевик");
        Movie movie8 = new Movie(8, "8", "мультфильм");
//        Movie movie9 = new Movie(9, "9", "комедия");
//        Movie movie10 = new Movie(10, "10", "боевик");
//        Movie movie11 = new Movie(11, "11", "ужасы");
//        Movie movie12 = new Movie(12, "12", "мультфильм");

        movieManager.save(movie8);


        Movie[] expected = {movie8};
        Movie[] actual = movieManager.shouldPoster();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldPosterWithoutMovieInRange() {
        MovieManager movieManager = new MovieManager();

//        Movie movie1 = new Movie(1, "1", "боевик");
//        Movie movie2 = new Movie(2, "2", "мультфильм");
//        Movie movie3 = new Movie(3, "3", "комедия");
//        Movie movie4 = new Movie(4, "4", "боевик");
//        Movie movie5 = new Movie(5, "5", "ужасы");
//        Movie movie6 = new Movie(6, "6", "мультфильм");
//        Movie movie7 = new Movie(7, "7", "боевик");
        Movie movie8 = new Movie(8, "8", "мультфильм");
//        Movie movie9 = new Movie(9, "9", "комедия");
//        Movie movie10 = new Movie(10, "10", "боевик");
//        Movie movie11 = new Movie(11, "11", "ужасы");
//        Movie movie12 = new Movie(12, "12", "мультфильм");

        movieManager.save(movie8);
        movieManager.removeMovieId(8);

        Movie[] expected = {};
        Movie[] actual = movieManager.shouldPoster();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldPosterOneMovieInRange() {
        MovieManager movieManager = new MovieManager();

//        Movie movie1 = new Movie(1, "1", "боевик");
//        Movie movie2 = new Movie(2, "2", "мультфильм");
//        Movie movie3 = new Movie(3, "3", "комедия");
//        Movie movie4 = new Movie(4, "4", "боевик");
//        Movie movie5 = new Movie(5, "5", "ужасы");
//        Movie movie6 = new Movie(6, "6", "мультфильм");
//        Movie movie7 = new Movie(7, "7", "боевик");
        Movie movie8 = new Movie(8, "8", "мультфильм");
        Movie movie9 = new Movie(9, "9", "комедия");
//        Movie movie10 = new Movie(10, "10", "боевик");
//        Movie movie11 = new Movie(11, "11", "ужасы");
//        Movie movie12 = new Movie(12, "12", "мультфильм");

        movieManager.save(movie8);
        movieManager.save(movie9);
        movieManager.removeMovieId(8);

        Movie[] expected = {movie9};
        Movie[] actual = movieManager.shouldPoster();
        assertArrayEquals(expected, actual);
    }


}