package classes.singletonclass.singlethree;

public enum CheckEnum {
    INSTANCE;

    public void show() {
        System.out.println("Hello from Enum Singleton");
    }
}
