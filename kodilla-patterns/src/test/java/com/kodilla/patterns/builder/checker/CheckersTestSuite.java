package com.kodilla.patterns.builder.checker;

import org.junit.Assert;
import org.junit.Test;

public class CheckersTestSuite {
    @Test
    public void testCheckersBuilder() {
        //Given
        Checkers checkers = new Checkers.CheckersBuilder()
                .PlayerOne("John")
                .PlayerTwo("Theresa")
                .Figure(FigureFactory.PAWN, Figure.WHITE, 0, 3)
                .Figure(FigureFactory.PAWN, Figure.BLACK, 9, 7)
                .Figure(FigureFactory.QUEEN, Figure.WHITE, 0, 2)
                .build();

        System.out.println(checkers.getBoard());

        //When
        Figure figure1 = checkers.getBoard().getFigure(0,3);
        Figure figure2 = checkers.getBoard().getFigure(9,7);
        Figure figure3 = checkers.getBoard().getFigure(0,2);
        Figure figure4 = checkers.getBoard().getFigure(1,1);

        //Then
        Assert.assertEquals(Figure.WHITE, figure1.getColor());
        Assert.assertEquals(Pawn.class, figure2.getClass());
        Assert.assertEquals(Queen.class, figure3.getClass());
        Assert.assertNull(figure4);
    }
}
