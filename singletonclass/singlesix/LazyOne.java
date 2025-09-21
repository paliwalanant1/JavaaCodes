package classes.singletonclass.singlesix;

public class LazyOne {
    private static LazyOne instance;
    private LazyOne(){}

    public static LazyOne getSingle(){
        if(instance == null){
            instance = new LazyOne();
        }
        return instance;
    }
    public void methodMsg(){
        System.out.println("Hello from Lazy Singleton class!");
    }
}
