package classes.singletonclass.singleseven;

public class ThreadSafe {
    public static void main(String[] args) {
        Check c = Check.getCheck();
        Check ch = Check.getCheck();

        System.out.println(c == ch);
    }
}
