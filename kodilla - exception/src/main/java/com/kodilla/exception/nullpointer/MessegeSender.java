package com.kodilla.exception.nullpointer;

public class MessegeSender {

    public void sendMessegeTo(User user, String messege) throws MessageNotSentException {
        if (user != null) {
            System.out.println("Sending message: " + messege + " to: " + user.getName());
        } else {
            throw new MessageNotSentException("Object User was null");
        }
    }
    }

