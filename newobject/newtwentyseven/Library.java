package object.newobject.newtwentyseven;

public class Library {
    private String libraryName;
    private int totalBooks;

    public Library(String libraryName, int totalBooks) {
        this.libraryName = libraryName;
        this.totalBooks = totalBooks;
    }

    public void display() {
        System.out.println("Library: " + libraryName + ", Books: " + totalBooks);
    }
}
