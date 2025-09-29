package constructor.parameterizeconstructor.staticvalues.parameterizefour;

public class Student {
    private String name;
    private int rollNo;

    public Student(String name,  int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void display() {
        System.out.println("Name: " + name + ", Roll: " + rollNo);
    }
}
