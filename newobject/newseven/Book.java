package object.newobject.newseven;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void info() {
        System.out.println("Book: " + title + " - Author: " + author);
    }
}
