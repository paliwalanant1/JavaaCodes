package classes.nestedclass.practicesix;

public class Animal {
    abstract class Inner{
        public abstract void animal();
    }
    public class Dog extends Inner{
        public void animal(){
            System.out.println("Dog barkk");
        }
    }
}
