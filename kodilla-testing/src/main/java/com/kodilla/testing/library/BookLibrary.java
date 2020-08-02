package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
            List<Book> bookList = new ArrayList<>();
            if (titleFragment.length() < 3) return bookList;
            List<Book> resultList = libraryDatabase
                    .listBooksWithCondition(titleFragment);
            if (resultList.size() > 20) return bookList;
            bookList = resultList;
            return bookList;
        }

    public List <Book> listBooksInHandsOf(LibraryUser libraryUser) { //lista wypozyczonych ksiazek
            List<Book> resultListBooksInHandsOf = new ArrayList<Book>(); //zwrot listy wypozyczonych ksiazek
            resultListBooksInHandsOf = libraryDatabase.listBooksInHandsOf(libraryUser); //ksiazki z bazy danych wypozyczonych przez usera
            return resultListBooksInHandsOf;//zwrot listy wypozyczonych ksiazek
        }
    }



