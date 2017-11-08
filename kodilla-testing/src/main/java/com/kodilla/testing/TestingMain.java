package com.kodilla.testing;


import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        if (Calculator.add(12, 28) == 12 + 28) { System.out.println("Test for class Calculator, method \"add\" - ok"); }
        else { System.out.println("Test for class Calculator, method \"add\" - error"); }

        if (Calculator.subtract(12, 2) == 12 - 2) { System.out.println("Test for class Calculator, method \"subtract\" - ok"); }
        else { System.out.println("Test for class Calculator, method \"add\" - error"); }
    }
}
