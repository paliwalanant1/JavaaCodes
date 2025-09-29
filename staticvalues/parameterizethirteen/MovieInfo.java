package constructor.parameterizeconstructor.staticvalues.parameterizethirteen;

public class MovieInfo {
    public static void main(String[] args) {
        Movie m = new Movie("Inception", 148);
        System.out.println(m.getTitle() + " - " + m.getDurationMinutes() + " minutes");
    }
}
