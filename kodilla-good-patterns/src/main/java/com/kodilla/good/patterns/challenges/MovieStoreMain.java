package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreMain {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

         String singleStringWithExclamations = movieStore.getMovies().entrySet().stream()
                .flatMap(stringListEntry -> stringListEntry.getValue().stream())
                //.map(s -> s.substring(0, s.length()))
                .collect(Collectors.joining("!"));

         System.out.println(singleStringWithExclamations);
    }
}
