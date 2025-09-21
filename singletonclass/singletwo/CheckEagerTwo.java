package classes.singletonclass.singletwo;

public class CheckEagerTwo {
    public static void main(String[] args) {
        EagerTwo sone = EagerTwo.getInstance();
        EagerTwo stwo = EagerTwo.getInstance();

        System.out.println(sone == stwo);
    }
}
