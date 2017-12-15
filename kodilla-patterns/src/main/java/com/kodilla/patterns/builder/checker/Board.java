package com.kodilla.patterns.builder.checker;

public class Board {
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 9;
    private Figure[][] board = new Figure[10][];

    public Board() {
        for (int i = 0; i < 10; i++) {
            board[i] = new Figure[10];
        }
    }

    public Figure getFigure(int x, int y) {
        return board[x][y];
    }

    public void setFigure(Figure figure, int x, int y) {
        board[x][y] = figure;
    }

    @Override
    public String toString() {
        String result = "";

        for (int i = MIN_INDEX; i <= MAX_INDEX; i++) {
            result += "|";
            for (int k = MIN_INDEX; k <= MAX_INDEX; k++) {
                if (board[i][k] == null) {
                    result += "  ";
                } else {
                    result += (board[i][k]).getColor().equals(Figure.BLACK) ? "b" : "w";
                    result += (board[i][k]) instanceof Pawn ? "P" : "Q";
                }
                result += "|";
            }
            result += "\n";
        }
        return result;
    }
}
