package classes.singletonclass.singletwo;

public class EagerTwo {
    private static final EagerTwo obj = new EagerTwo();

    private EagerTwo() {
        System.out.println("Singleton object created!");
    }

    public static EagerTwo getInstance() {
        return obj;
    }
}