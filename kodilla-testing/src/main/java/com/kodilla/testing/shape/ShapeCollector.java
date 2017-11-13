package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public boolean addFigure(Shape shape){
        shapes.add(shape);

        return shapes.contains(shape);
    }

    public boolean removeFigure(Shape shape){
        return shapes.remove(shape);
    }

    public Shape getFigure(int n){
        if(n >= 0 && shapes.size() > 0) {
            return shapes.get(n);
        }

        return null;
    }

    public ArrayList<Shape> showFigures(){
        return (ArrayList<Shape>) shapes;
    }
}
