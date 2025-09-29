package object.newobject.newtwenty;

public class Movie {
    private String title;
    private double rating;

    public Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public void details() {
        System.out.println("Movie: " + title + ", Rating: " + rating);
    }
}
