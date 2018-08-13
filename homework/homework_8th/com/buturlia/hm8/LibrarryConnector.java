package com.buturlia.hm8;

import java.sql.*;
import java.util.ArrayList;

public class LibrarryConnector implements InterfaceBooksRepository{
    private static String databaseLocation = "jdbc:mysql://192.168.75.128:3306";
    private static String dataBaseConnectionName = "admin";
    private static String getDataBaseConnectionpassword = "nu4AcDot";
    private Connection connection;
    private static LibrarryConnector librarryConnector;

    static {
        librarryConnector = new LibrarryConnector();
    }

    private LibrarryConnector() {
        this.connectToDatabase();
    }

    public static LibrarryConnector getInstance()
    {
        return librarryConnector;
    }

    public void connectToDatabase(){




        System.out.println("Trying to connect to database");
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("com.mysql.jdbc.Driver not found");
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(  databaseLocation, dataBaseConnectionName, getDataBaseConnectionpassword);
            //here sonoo is database name, root is username and password

            System.out.println("Connection is " + !connection.isClosed());
//            System.out.println(con.createStatement().executeQuery("SELECT library"));

            System.out.println(connection.createStatement().executeUpdate("USE library;") + " up! ");

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM library.books;");
            rs.next();
            System.out.println("1-st book id is " + rs.getInt(1) + " and name is " + rs.getString(2));
            System.out.println();



        } catch (SQLException e) {
            System.out.println("Can't connect to database");
            e.printStackTrace();
        }


    }

    @Override
    public LibraryBook getBook(int book_id) {
        System.out.println("Starting method getbook");
        LibraryBook libraryBook;
        try {

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM library.books WHERE book_id = " + book_id + ";");
            if(rs.isBeforeFirst())
            {
                rs.next();
                libraryBook = new LibraryBook(rs.getInt(1), rs.getString(2));
                System.out.println("Getted book from database");
                return libraryBook;

            }


        } catch (SQLException e) {
            System.out.println("Can't get book by ID");
            e.printStackTrace();
        } catch ( Exception e)
        {
            System.out.println("Can't get book by ID");
            e.printStackTrace();
        }
        return new LibraryBook(-1,"Error");
    }

    @Override
    public ArrayList<LibraryBook> getAllBooks() {
        ArrayList libraryBook;
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM library.books;");



//			if(rs.isBeforeFirst()) {
//				while (rs.next()) {
//					Book book = new Book();
//
//					book.setId(rs.getInt(1));
//					book.setName(rs.getString(2));
//					book.setAuthorId(rs.getInt(3));
//					book.setGenreId(rs.getInt(4));
//					book.setIsbn(rs.getString(5));
//
//					booksList.add(book);
//				}
//			}


//            libraryBook = new LibraryBook(rs.getInt(1), rs.getString(2));
            return null;


        } catch (SQLException e) {
            System.out.println("Can't get book by ID");
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<LibraryBook> getAllBooksByAuthor() {
        return null;
    }
}
