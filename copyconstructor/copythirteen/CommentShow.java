package constructor.copyconstructor.copythirteen;

public class CommentShow {
    public static void main(String[] args) {
        Comment c1 = new Comment("Anant", "Nice post");
        Comment c2 = new Comment(c1);
        System.out.println(c2);
    }
}

