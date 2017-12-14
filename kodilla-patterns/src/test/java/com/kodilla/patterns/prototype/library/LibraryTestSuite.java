package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library number 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(12)
                .forEach(n -> library.getBooks().add(new Book("Title of " + n, "Author", LocalDate.now())));

        //shallow copy
        Library shallowCopyLibrary = null;
        try {
            shallowCopyLibrary = library.shallowCopy();
            shallowCopyLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deep copy
        Library deepCopyLibrary = null;
        try {
            deepCopyLibrary = library.deepCopy();
            deepCopyLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().clear();

        //Then
        System.out.println(library.getBooks());
        System.out.println(shallowCopyLibrary.getBooks());
        System.out.println(deepCopyLibrary.getBooks());
        Assert.assertEquals(0, library.getBooks().size());
        Assert.assertEquals(0, shallowCopyLibrary.getBooks().size());
        Assert.assertEquals(12, deepCopyLibrary.getBooks().size());
    }
}
