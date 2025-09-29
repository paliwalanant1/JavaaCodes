package constructor.defaultconstructor.defaulttwo;

public class Student {
    private String name;
    private int age;

    public Student() {
        super();
        name = "Anant";
        age = 18;
        System.out.println("Default Constructor");
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}



