package classes.singletonclass.singleone;

public class Eager{
    private static final Eager eager = new Eager();
    private Eager(){
        System.out.println("Private Constructor");
    }
    public static Eager getEager(){
        return eager;
    }
}