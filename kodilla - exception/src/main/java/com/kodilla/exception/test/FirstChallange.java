package com.kodilla.exception.test;

public class FirstChallange {

    public double divide(double a, double b) throws ArithmeticException {
            if(b == 0){
                throw new ArithmeticException();
            }
            return a / b;
        }

        public static void main(String[] args) {

            FirstChallange firstChallenge = new FirstChallange();
            try {
                double result = firstChallenge.divide(3, 0);
                System.out.println(result);
            } catch ( ArithmeticException ex) {
                System.out.println("Exception:" + ex);
            } finally {
                System.out.println("Ending program");
            }

        }
    }

