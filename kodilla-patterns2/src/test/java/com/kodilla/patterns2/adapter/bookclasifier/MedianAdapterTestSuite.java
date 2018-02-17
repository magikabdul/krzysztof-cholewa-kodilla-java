package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void testMedianAdapter() {
        //Given
        Set<Book> bookSet = new HashSet<>();

        bookSet.add(new Book("Duhigg", "Siła nawyku", 2016, "997-52-544-654"));
        bookSet.add(new Book("Duhigg", "Siła nawyku", 1955, "997-52-544-654"));
        bookSet.add(new Book("Duhigg", "Siła nawyku", 1975, "997-52-544-654"));
        bookSet.add(new Book("Duhigg", "Siła nawyku", 1999, "997-52-544-654"));
        bookSet.add(new Book("Duhigg", "Siła nawyku", 2008, "997-52-544-654"));

        MedianAdapter adapter = new MedianAdapter();

        //When
        int median = adapter.publicationYearMedian(bookSet);

        //Then
        Assert.assertEquals(1999, median);
    }
}
