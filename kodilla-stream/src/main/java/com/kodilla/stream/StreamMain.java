package com.kodilla.stream;

import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;


public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = forum.getUserList().stream()
                .filter(f -> f.getSexUser() != 'F') //przepuszcza te różne od F
                .filter(f -> f.getDateOfBirth().getYear() < 2000)
                .filter(f -> f.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getPersonalId, f -> f));

        System.out.println("#elements" + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .forEach(System.out::println);

    }

}





