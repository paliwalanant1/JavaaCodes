package constructor.defaultconstructor.defaultfour;

public class Student {
    private String name;
    private int roll;

    public Student() {
        this.name = "Unknown";
        this.roll = 101;
    }

    public void display() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
}
