package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Clasifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Clasifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> signatureBookMap = new HashMap<>();

//        for (Book book: bookSet) {
//            BookSignature signature = new BookSignature(book.getSignature());
//
//            com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book booka =
//                    new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(
//                            book.getAuthor(),
//                            book.getTitle(),
//                            book.getPublicationYear());
//
//            signatureBookMap.put(signature, booka);
//        }

        signatureBookMap = bookSet.stream()
                .collect(Collectors.toMap(o -> new BookSignature(o.getSignature()),
                        o -> new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(
                                o.getAuthor(),
                                o.getTitle(),
                                o.getPublicationYear()
                        )));

        return medianPublicationYear(signatureBookMap);
    }
}
