package com.kodilla.testing.shape;

 class Rectangle implements Shape {

    private double y;
    private double x;

    public Rectangle(double y, double x) {
       this.y = y;
       this.x = x;
    }

    @Override
    public String getShapeName() {
       return "Rectangle";
    }

    @Override
    public double getArea() {
       return x*y;
    }
 }
