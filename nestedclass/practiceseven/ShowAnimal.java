package classes.nestedclass.practiceseven;

public class ShowAnimal {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Cat obj = outer.new Cat();
        obj.sound();
    }
}
