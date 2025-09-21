package classes.singletonclass.singlefive;

public class ShowLazyTwo {
    public static void main(String[] args)
    {
        LazyTwo obj1 = LazyTwo.getinstance();
        System.out.println(obj1.hashCode());

        LazyTwo obj2 = LazyTwo.getinstance();
        System.out.println(obj2.hashCode());

        System.out.println(obj1 == obj2);
    }
}
