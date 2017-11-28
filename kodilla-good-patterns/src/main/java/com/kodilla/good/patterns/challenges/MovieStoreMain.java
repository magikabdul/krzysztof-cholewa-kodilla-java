package com.kodilla.good.patterns.challenges;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieStoreMain {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String singleStringWithExclamations =  movieStore.getMovies().values().stream()
                .map(strings -> strings.get(0) + "!" + strings.get(1))
                .collect(Collectors.joining("!"));

        System.out.println(singleStringWithExclamations);
    }
}
