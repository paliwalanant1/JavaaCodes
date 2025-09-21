package classes.singletonclass.singlesix;

public class ShowLazyOne {
    public static void main(String[] args) {
        LazyOne obj1 = LazyOne.getSingle();
        LazyOne obj2 = LazyOne.getSingle();

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        obj1.methodMsg();
        obj2.methodMsg();
    }
}
