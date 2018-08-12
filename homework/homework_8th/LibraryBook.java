public class LibraryBook {
    private int bookId;
    private String bookName;


    public LibraryBook(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
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
