package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    private static int testNumber = 0;

    @BeforeClass
    public static void beginTestSuite(){
        System.out.println("Begin test for Class - ShapeCollect ");
    }

    @Before
    public void beginTest(){
        testNumber++;
        System.out.println("Begin test #" + testNumber);
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(10);

        //When
        boolean result = shapeCollector.addFigure(square);
        Shape resultShape = shapeCollector.getFigure(0);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(square, resultShape);
    }

    @Test
    public void testRemoveFigureNotExisting(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(10);

        //When
        boolean result = shapeCollector.removeFigure(square);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(10);
        shapeCollector.addFigure(square);

        //When
        boolean result = shapeCollector.removeFigure(square);

        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testGetFigureNotExisting(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Shape resultShape = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(null, resultShape);
    }

    @Test
    public void testGetFigureWithNegativeIndex(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Shape resultShape = shapeCollector.getFigure(-1);

        //Then
        Assert.assertEquals(null, resultShape);
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(10);
        shapeCollector.addFigure(square);

        //When
        Shape resultShape = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(square, resultShape);
    }

    @Test
    public void testShowFiguresWhenNoFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        List<Shape> expectedList = new ArrayList<>();
        boolean isExpectedListEmpty = expectedList.isEmpty();

        //When
        List<Shape> resultList = shapeCollector.showFigures();
        boolean isResultListEmpty = resultList.isEmpty();

        //Then
        Assert.assertEquals(isExpectedListEmpty, isResultListEmpty);
    }

    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(10);
        Shape circle = new Circle(10);
        Shape triangle = new Triangle(10,5);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);

        List<Shape> expectedFigures = new ArrayList<Shape>();
        expectedFigures.add(square);
        expectedFigures.add(circle);
        expectedFigures.add(triangle);
        int expectedSize = expectedFigures.size();

        //When
        List<Shape> resultFigures = shapeCollector.showFigures();
        int resultSize = resultFigures.size();

        //Then
        Assert.assertEquals(expectedFigures, resultFigures);
        Assert.assertEquals(expectedSize, resultSize);
    }
}
