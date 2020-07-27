package com.kodilla.testing.shape;

 class Circle implements Shape {


    private double r;

    public Circle(double r) {
       this.r = r;
    }

    @Override
    public String getShapeName() {
       return "Circle";
    }

    @Override
    public double getArea() {
       return Math.PI*r*r;
    }
 }



