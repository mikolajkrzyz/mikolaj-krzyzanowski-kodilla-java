package com.kodilla.good.patterns.challenges;

public class Main {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().entrySet().stream()
                .map(stringListEntry -> stringListEntry.getValue())
                .flatMap(stringList -> stringList.stream())
                .map(title -> title + "!")
                .forEach(System.out::print);
    }
}

