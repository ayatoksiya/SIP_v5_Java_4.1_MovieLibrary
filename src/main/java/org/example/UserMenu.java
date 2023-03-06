package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

import static org.example.UserOptions.*;

public class UserMenu {
    public static void chooseMenuOption() throws IOException {
        MovieLibrary movieLibrary = new ObjectMapper().readValue(new File("src/main/resources/movies.json"), MovieLibrary.class);
        switch (getOptionFromUser()) {
            case PROVIDE_DATES_RANGE -> movieLibrary.printMoviesFromDateRange(getDateFromUser(), getDateFromUser());
            case PRINT_RANDOM_MOVIE_INFO -> movieLibrary.printRandomMovieInformation();
            case PROVIDE_ACTOR_DATA -> movieLibrary.printMoviesFeaturingActor(getActorDataFromUser(), getActorDataFromUser());
            default -> printIncorrectDataInputInfo();
        }
    }

    public static void printMenuOptions() {
        System.out.println("""
                Please choose form the following options:
                1 - Display movies produced within provided data range
                2 - Display random movie information
                3 - Display movies featuring given actor
                """);
    }

    public static void printIncorrectDataInputInfo() {
        System.out.println("Incorrect input. Please provide required data.");
    }
}
