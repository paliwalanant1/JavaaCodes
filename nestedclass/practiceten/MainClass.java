package classes.nestedclass.practiceten;

public class MainClass {
    public static void main(String[] args) {

        MultiLevel obj1 = new MultiLevel();
        MultiLevel.Outer obj2 = obj1.new Outer();
        MultiLevel.Outer.Inner obj3 = obj2.new Inner();

        obj3.display();
    }
}
