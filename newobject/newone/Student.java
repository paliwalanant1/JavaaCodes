package object.newobject.newone;

public class Student {
    private String name;
    private int roll;

    public Student() {
        this.name = "Anant";
        this.roll = 101;
    }

    public void display() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
