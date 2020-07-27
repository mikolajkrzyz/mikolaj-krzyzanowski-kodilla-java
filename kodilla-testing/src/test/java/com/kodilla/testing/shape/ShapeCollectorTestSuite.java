package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(5);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Shape result = shapeCollector.getFigure(0);
        Assert.assertEquals(circle,result);
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(5);
        Square square = new Square(4);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        //When
        shapeCollector.removeFigure(0);
        //Then
        Shape result = shapeCollector.getFigure(0);
        Assert.assertEquals(square,result);
    }
}
