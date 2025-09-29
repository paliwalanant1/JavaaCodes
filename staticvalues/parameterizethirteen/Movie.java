package constructor.parameterizeconstructor.staticvalues.parameterizethirteen;

public class Movie {
    private String title;
    private int durationMinutes;

    public Movie(String title, int durationMinutes) {
        this.title = title;
        this.durationMinutes = durationMinutes;
    }

    public String getTitle() {
        return title;
    }
    public int getDurationMinutes() {
        return durationMinutes;
    }
}
