package object.cloneobject.shallowcopy.cloneeleven;

public class Book implements Cloneable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void printBook() {
        System.out.println("Book: " + title + " by " + author);
    }
}