package classes.nestedclass.practiceone;

public class ShowNestedClasses {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}
