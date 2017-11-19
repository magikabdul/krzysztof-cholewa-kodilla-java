package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

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
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("krzysztof", text -> text.toUpperCase());
        poemBeautifier.beautify("in the", text -> "ABC " + text + " ABC");
        poemBeautifier.beautify("                         a b c d e f g h", text -> text.trim());
        poemBeautifier.beautify("password", text -> text.substring(4,8));
        poemBeautifier.beautify("I've no ideas", text -> text.substring(0, 5) + "many" + text.substring(7, 13));
    }
}
