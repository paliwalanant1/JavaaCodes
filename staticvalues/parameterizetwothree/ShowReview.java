package constructor.parameterizeconstructor.staticvalues.parameterizetwothree;

public class ShowReview {
    public static void main(String[] args) {
        Review r = new Review("Anant", 5);
        System.out.println(r.getReviewer() + " - " + r.getRating());
    }
}
