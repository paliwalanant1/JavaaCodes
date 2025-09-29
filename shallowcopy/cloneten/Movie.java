package object.cloneobject.shallowcopy.cloneten;

public class Movie implements Cloneable{
    private String title;
    private String director;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void showMovie() {
        System.out.println("Movie: " + title + ", Director: " + director);
    }
}
