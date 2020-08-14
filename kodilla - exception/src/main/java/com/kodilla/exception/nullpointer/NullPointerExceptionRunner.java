package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {
        public static void main(String[] args) {
            User user = null;
            MessegeSender messageSender = new MessegeSender();

            try {
                messageSender.sendMessegeTo(user, "Hello!");
            } catch (MessageNotSentException e) {
                System.out.println("Message is not send," +
                        "but my program still running very well!");
            }

            System.out.println("Processing other logic!");
        }
}
