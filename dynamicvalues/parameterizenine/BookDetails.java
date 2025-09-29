package constructor.parameterizeconstructor.dynamicvalues.parameterizenine;

public class BookDetails {
    private String title;
    private String author;

    public BookDetails(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void show() {
        System.out.println("Book: " + title + " by " + author);
    }
}
