package com.buturlia.hm8;

import java.util.ArrayList;

public interface InterfaceBooksRepository {
    public LibraryBook getBook(int book_id);
    public ArrayList<LibraryBook> getAllBooks();
    public ArrayList<LibraryBook> getAllBooksByAuthor();


}
