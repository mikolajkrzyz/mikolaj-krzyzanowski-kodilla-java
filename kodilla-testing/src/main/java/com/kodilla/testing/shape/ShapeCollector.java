package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public Shape getFigure(int index) {
        return figures.get(index);
    }

    public void removeFigure(int index) {
        figures.remove(index);
    }


}
