package com.buturlia.hm8;



public class Library_runner {
    public static void main(String[] args) {
        LibrarryConnector librarryConnector;
        try {
            System.out.println("Trying to get libraryConnector");
            librarryConnector = LibrarryConnector.getInstance();
            System.out.println(librarryConnector.getBook(2).getBookName());

        }catch (Exception e)
        {
            System.out.println("Error!");
            e.printStackTrace();
        }


    }

}
