package constructor.parameterizeconstructor.dynamicvalues.parameterizeeleeven;

public class MovieInfo {
    private String title;
    private int year;

    public MovieInfo(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public void display() {
        System.out.println("Movie: " + title + " (" + year + ")");
    }
}
