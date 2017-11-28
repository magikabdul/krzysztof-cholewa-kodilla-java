package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class MovieStore {

    public final Map<String, List<String>> getMovies() {

        final List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny człowiek");
        ironManTranslations.add("Iron Man");

        final List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        final List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        final Map<String, List<String>> bookTitlesWithTranslation = new HashMap<>();
        bookTitlesWithTranslation.put("IM", ironManTranslations);
        bookTitlesWithTranslation.put("AV", avengersTranslations);
        bookTitlesWithTranslation.put("FL", flashTranslations);

        return bookTitlesWithTranslation;
    }
}
