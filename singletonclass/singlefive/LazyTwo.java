package classes.singletonclass.singlefive;

public class LazyTwo {
    private static LazyTwo instance;
    private LazyTwo(){}

    public static LazyTwo getinstance(){
        if(instance == null){
            instance = new LazyTwo();
        }
        return instance;
    }
}
