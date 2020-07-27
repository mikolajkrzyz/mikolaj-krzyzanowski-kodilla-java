package com.kodilla.testing.shape;

 class Square implements Shape {

    private double x;

    public Square(double x) {
       this.x = x;
    }

    @Override
    public String getShapeName() {
       return "Square";
    }

    @Override
    public double getArea() {
       return x*x;
    }
 }
