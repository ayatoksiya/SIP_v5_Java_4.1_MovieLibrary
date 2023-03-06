package org.example;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;


public class Movie {

    @JsonProperty("title")
    private String title;
    @JsonProperty("date")
    private int date;
    @JsonProperty("genre")
    private Genre genre;
    @JsonProperty("director")
    private Director director;
    @JsonProperty("actors")
    private List<Actor> actors = new ArrayList<>();

    public Movie(String title, int date, Genre genre, Director director, ArrayList<Actor> actors) {
        this.title = title;
        this.date = date;
        this.genre = genre;
        this.director = director;
        this.actors = actors;
    }

    public Movie() {
    }

    @Override
    public String toString() {
        return "title: " + this.title + "\n" +
               "director: " + this.director + "\n" +
               "genre: " + this.genre + "\n" +
               "date: " + this.date + "\n" +
               "actors: " + this.actors.toString();
    }

    public String getTitle() {
        return title;
    }

    public int getDate() {
        return date;
    }

    public Genre getGenre() {
        return genre;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

}
