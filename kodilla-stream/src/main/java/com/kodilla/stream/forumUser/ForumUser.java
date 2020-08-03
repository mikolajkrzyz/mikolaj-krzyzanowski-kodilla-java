package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public final  class ForumUser {
    private final int personalId;
    private final String userName;
    private final char sexUser;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public ForumUser(int personalId, String userName, char sexUser, LocalDate dateOfBirth, int numberOfPosts) {
        this.personalId = personalId;
        this.userName = userName;
        this.sexUser = sexUser;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getPersonalId() {
        return personalId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSexUser() {
        return sexUser;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "personalId=" + personalId +
                ", userName='" + userName + '\'' +
                ", sexUser=" + sexUser +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
