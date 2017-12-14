package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype{
    //final String name;
    String name;
    //final Set<Book> books = new HashSet<>();
    Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException{
        Library deepCopy = (Library) super.clone();
        deepCopy.books = new HashSet<>();

        for (Book book : books) {
            deepCopy.getBooks().add(book);
        }

        return deepCopy;
    }
}
