package org.example;

import java.util.Scanner;

public enum UserOptions {

    PROVIDE_DATES_RANGE(1),
    PRINT_RANDOM_MOVIE_INFO(2),
    PROVIDE_ACTOR_DATA(3);

    private final int value;

    UserOptions(final int newValue) {
        value = newValue;
    }

    public static UserOptions fromInteger(int number) {
        for (UserOptions option : UserOptions.values()) {
            if (option.value == number) {
                return option;
            }
        }
        return null;
    }

    public static UserOptions getOptionFromUser() {
        Scanner scanner = new Scanner(System.in);
        int selectedOptionNumber = scanner.nextInt();
        return UserOptions.fromInteger(selectedOptionNumber);
    }

    public static int getDateFromUser() {
        Scanner scanner = new Scanner(System.in);
        int selectedDate = scanner.nextInt();
        return selectedDate;
    }

    public static String getActorDataFromUser() {
        Scanner scanner = new Scanner(System.in);
        String selectedActorData = scanner.nextLine();
        return selectedActorData;
    }

}
