package com.kodilla.stream;

//import com.kodilla.stream.beautifier.PoemBeautifier;
//import com.kodilla.stream.iterate.NumbersGenerator;
//import com.kodilla.stream.lambda.ExpressionExecutor;
//import com.kodilla.stream.lambda.Processor;
//import com.kodilla.stream.reference.FunctionalCalculator;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
//import com.kodilla.stream.people.People;
//
//import java.util.List;
//import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
//        Processor processor = new Processor();
//        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
//        processor.execute(executeSaySomething);

//        Executor codeToExecute = () -> System.out.println("This is an example text.");
//        processor.execute(codeToExecute);

//        processor.execute(() -> System.out.println("This is an example text."));

//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10,5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10,5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10,5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        //PoemDecorator - task 7.1
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//
//        poemBeautifier.beautify("krzysztof", text -> text.toUpperCase());
//        poemBeautifier.beautify("in the", text -> "ABC " + text + " ABC");
//        poemBeautifier.beautify("                         a b c d e f g h", text -> text.trim());
//        poemBeautifier.beautify("password", text -> text.substring(4,8));
//        poemBeautifier.beautify("I've no ideas", text -> text.substring(0, 5) + "many" + text.substring(7, 13));

//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);

//        People.getList().stream()
//                .map(s -> s.toUpperCase())
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + '.')
//                .filter(s -> s.substring(0, 1).equals("M"))
//                .forEach(System.out::println);

//        BookDirectory bookDirectory = new BookDirectory();
//        List<Book> theResultListOfBooks = bookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toList());
//
//        System.out.println("#Elements: " + theResultListOfBooks.size());
//        theResultListOfBooks.stream()
//                .forEach(System.out::println);

//

        BookDirectory bookDirectory = new BookDirectory();
        String theResultStringsOfBooks = bookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringsOfBooks);
    }
}
