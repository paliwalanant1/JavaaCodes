package constructor.parameterizeconstructor.staticvalues.parameterizetwo;

public class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("Peremeterize Constructor");
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + rollNo);
    }
}
