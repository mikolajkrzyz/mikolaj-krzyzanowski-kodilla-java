package com.kodilla.testing.forum.statistics;

class statisticsCalculator { //klasa, która liczy statystyki

    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public statisticsCalculator(int usersQuantity, int postsQuantity, int commentsQuantity, double averagePostsPerUser, double averageCommentsPerUser, double averageCommentsPerPost) {
        this.usersQuantity = usersQuantity;
        this.postsQuantity = postsQuantity;
        this.commentsQuantity = commentsQuantity;
        this.averagePostsPerUser = averagePostsPerUser;
        this.averageCommentsPerUser = averageCommentsPerUser;
        this.averageCommentsPerPost = averageCommentsPerPost;
    }

    public statisticsCalculator() {

    }


    public int getUsersQuantity() { // ilość użytkowników

        return usersQuantity;
    }

    public int getPostsQuantity() { // ilość postów

        return postsQuantity;
    }

    public int getCommentsQuantity() { // ilość komentarzy

        return commentsQuantity;
    }

    public double getAveragePostsPerUser() { // srednia liczba postów na uzytkownika

        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() { // srednia liczba komentarzy na uzytkownika

        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() { // srednia liczba komentarzy na post

        return averageCommentsPerPost;
    }

    private double calculateAveragePostsPerUser() { //obliczanie sredniej postow na uzytkownika
        if (usersQuantity > 0) {
            return postsQuantity / usersQuantity;
        } else {
            return 0;
        }
    }

    private double calculateAverageCommentsPerUser() { // obliczanie sredniej komentarzy na uzytkownika
        if (usersQuantity>0) {
            return commentsQuantity/usersQuantity;
        } else {
            return 0;
        }
    }

    private double calculateAverageCommentsPerPost () { // obliczania sredniej komentarzy na post
        if (postsQuantity>0) {
            return commentsQuantity/postsQuantity;
        } else {
            return 0;
        }
    }

    public void calculateAdvStatistics ( Statistics statistics) { //oblicza podane wartości i zapamiętuje w (polach) klasy.
         usersQuantity = statistics.usersNames().size();
         postsQuantity = statistics.postsCount();
         commentsQuantity = statistics.commentsCount();
         averagePostsPerUser = calculateAveragePostsPerUser();
         averageCommentsPerUser = calculateAverageCommentsPerUser();
         averageCommentsPerPost = calculateAverageCommentsPerPost();
    }

    public void showStatistics() { // wyświetla zapamiętane rzeczy
        System.out.println(usersQuantity);
        System.out.println(postsQuantity);
        System.out.println(commentsQuantity);
        System.out.println(calculateAveragePostsPerUser());
        System.out.println(calculateAverageCommentsPerUser());
        System.out.println(calculateAverageCommentsPerPost());
    }
}

