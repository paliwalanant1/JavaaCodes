package object.newobject.newseven;

public class BookInfo {
    public static void main(String[] args) {
        Book b1 = new Book("Harry porter", "J. K. Rowling");
        Book b2 = new Book("Java Programming", "James Gosling");

        b1.info();
        b2.info();
    }
}
