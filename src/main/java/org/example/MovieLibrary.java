package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Random;


public class MovieLibrary extends Movie {

    @JsonProperty("movies")
    private List<Movie> movies;

    public MovieLibrary() {
        super();
    }

    public List<Movie> getMovies() {
        return this.movies;
    }


    public void printRandomMovieInformation() {
        Movie randomMovie = movies.get(new Random().nextInt(movies.size()));
        System.out.println(randomMovie.toString());
    }

    public void printMoviesFromDateRange(int initialDate, int finalDAte) {
        movies.stream().
                filter(Movie -> Movie.getDate() > initialDate).
                filter(Movie -> Movie.getDate() < finalDAte).
                map(Movie -> Movie.getTitle() + " " + Movie.getDate()).
                forEach(System.out::println);
    }

    public void printMoviesFeaturingActor(String actorName, String actorSurname) {
        movies.stream().
                filter(Movie -> Movie.getActors().stream().anyMatch(a -> a.getFirstName().equals(actorName))).
                filter(Movie -> Movie.getActors().stream().anyMatch(a -> a.getLastName().equals(actorSurname))).
                forEach(System.out::println);
    }

}
