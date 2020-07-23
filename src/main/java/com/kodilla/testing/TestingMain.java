package com.kodilla.testing;
import com.kodilla.testing.calculator.SimpleCalculator;


public class TestingMain {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        System.out.println(simpleCalculator.add(3,5));
        System.out.println(simpleCalculator.subtract(12,4));
    }
}
