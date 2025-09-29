package constructor.copyconstructor.copythirteen;

public class Comment {
    private String author;
    private String text;

    public Comment(String author, String text) {
        this.author = author;
        this.text = text;
    }
    public Comment(Comment other) {
        this.author = other.author;
        this.text = other.text;
    }
    public String toString(){
        return author + " " + text;
    }
}
