package classes.nestedclass.practiceeleven;

public class MainClass {
    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}
