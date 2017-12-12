package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result1 = calculator.add(10, 5);
        double result2 = calculator.sub(10, 5);
        double result3 = calculator.mul(10, 5);
        double result4 = calculator.div(10, 5);

        //Then
        Assert.assertEquals(15, result1, 0);
        Assert.assertEquals(5, result2, 0);
        Assert.assertEquals(50, result3, 0);
        Assert.assertEquals(2, result4, 0);
    }
}
