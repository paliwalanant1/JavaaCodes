package Inheritance;

class GrandParent {
    public void grandParent() {
        System.out.println("I am GrandParent");
    }
}

class Parent extends GrandParent {
    public void parent() {
        System.out.println("I am Parent");
    }
}

class Child extends Parent {
    public void child() {
        System.out.println("I am Child");
    }
}

public class MultLevel3 {
    public static void main(String[] args) {
        Child c = new Child();
        c.grandParent();
        c.parent();
        c.child();
    }
}


