package constructor.parameterizeconstructor.staticvalues.parameterizetwothree;

public class Review {
    private String reviewer;
    private int rating;

    public Review(String reviewer, int rating) {
        this.reviewer = reviewer;
        this.rating = rating;
    }
    public String getReviewer() {
        return reviewer;
    }
    public int getRating() {
        return rating;
    }
}
