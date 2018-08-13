package com.buturlia.hm8;

public class LibraryBook  {
    private int bookId;
    private String bookName;
    private static LibrarryConnector librarryConnector;


    public LibraryBook(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
        librarryConnector = LibrarryConnector.getInstance();
    }


    public static boolean addNewBookToLibrary()
    {


        return false;
    }





    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
