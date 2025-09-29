package object.newobject.newfour;

public class Book {
    private String title;
    private String author;

    public Book() {
        this.title = "Harry Porter";
        this.author = "J. K. Rowling";
    }

    public void details() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.details();
    }
}
