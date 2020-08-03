package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> listOfForumUsers = new ArrayList<>();

    public Forum() {
        listOfForumUsers.add(new ForumUser(1, "Mikolaj", 'M', LocalDate.of(1992, 10, 6), 3));
        listOfForumUsers.add(new ForumUser(2, "Anna", 'F', LocalDate.of(2002, 12, 11), 13));
        listOfForumUsers.add(new ForumUser(3, "Marcin", 'M', LocalDate.of(1991, 11, 13), 23));
        listOfForumUsers.add(new ForumUser(4, "Malgosia", 'F', LocalDate.of(1999, 9, 24), 33));
        listOfForumUsers.add(new ForumUser(4, "Magda", 'F', LocalDate.of(2003, 8, 24), 33));
        listOfForumUsers.add(new ForumUser(4, "Kasia", 'F', LocalDate.of(2005, 7, 24), 33));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(listOfForumUsers);
    }
}
