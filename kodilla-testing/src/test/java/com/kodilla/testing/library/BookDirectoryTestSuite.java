package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    @Test
        public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
        }

        @Test
        public void testListBooksWithConditionsReturnList() {
            // Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOfBooks = new ArrayList<Book>();
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
            Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
            resultListOfBooks.add(book1);
            resultListOfBooks.add(book2);
            resultListOfBooks.add(book3);
            resultListOfBooks.add(book4);
            when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                    .thenReturn(resultListOfBooks);

            // When
            List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

            // Then
            assertEquals(4, theListOfBooks.size());
        }

        private List<Book> generateListOfNBooks(int booksQuantity) {
            List<Book> resultList = new ArrayList<Book>();
            for(int n = 1; n <= booksQuantity; n++){
                Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
                resultList.add(theBook);
            }
            return resultList;
        }

        @Test
        public void testListBooksWithConditionMoreThan20() {
            // Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf0Books = new ArrayList<Book>();
            List<Book> resultListOf15Books = generateListOfNBooks(15);
            List<Book> resultListOf40Books = generateListOfNBooks(40);
            when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                    .thenReturn(resultListOf15Books);
            when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                    .thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                    .thenReturn(resultListOf40Books);

            // When
            List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
            List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
            List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
            // Then

            assertEquals(0, theListOfBooks0.size());
            assertEquals(15, theListOfBooks15.size());
            assertEquals(0, theListOfBooks40.size());
        }
    @Test
    public void testlistBooksInHandsOfUserNoBorrowBooks(){
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class); //tworze mocka interfejsu LibraryDatabase,
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);//tutaj go wstrzykuje

        List<Book> noBorrowBooksByUser = generateListOfNBooks(0); // tworze liste wypożyczonych książek ( w tym przyp 0 )

        when(libraryDatabaseMock.listBooksInHandsOf(anyObject())).thenReturn(noBorrowBooksByUser);

        //When
        LibraryUser libraryUserMk = new LibraryUser("Mikolaj", "Krzyz", "980607");

        List<Book> noBorrowBooksByUserMikolajKrzyz = bookLibrary.listBooksInHandsOf(libraryUserMk);

        // Then
        assertEquals(0, noBorrowBooksByUserMikolajKrzyz.size());
    }

    @Test
        public void testlistBooksInHandsOfUserOneBorrowBook() {
            // Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class); //tworzę mocka interfejsu LibraryDatabase,
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock); //tutaj go wstrzykuję

            List<Book> oneBorrowBookByUser = generateListOfNBooks(1); //tutaj tworzę liste wypozyczonych ksiazek, tu 1

            when(libraryDatabaseMock.listBooksInHandsOf(anyObject())).thenReturn(oneBorrowBookByUser);
            //When
            LibraryUser libraryUserRadoslawGer = new LibraryUser("Radoslaw", "Ger", "123456");

            List<Book> oneBorrowBookByUserRadoslawger = bookLibrary.listBooksInHandsOf(libraryUserRadoslawGer);

            // Then
            assertEquals(1, oneBorrowBookByUserRadoslawger.size());
        }

            @Test
            public void testlistBooksInHandsOfUserFiveBorrowBooks(){
                // Given
                LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
                BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

                List<Book> fiveBorrowBooksByUser = generateListOfNBooks(5);

                when(libraryDatabaseMock.listBooksInHandsOf(anyObject())).thenReturn(fiveBorrowBooksByUser);
                //When
                LibraryUser libraryUserMarcinLask = new LibraryUser("Marcin", "Lask", "654321");

                List<Book> fiveBorrowBooksByUserMarcinLask = bookLibrary.listBooksInHandsOf(libraryUserMarcinLask);

                // Then
                assertEquals(5, fiveBorrowBooksByUserMarcinLask.size());

            }

    }



