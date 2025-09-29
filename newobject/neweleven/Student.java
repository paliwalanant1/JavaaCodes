package object.newobject.neweleven;

public class Student {
    private String name;
    private int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void show() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
}