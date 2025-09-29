package constructor.parameterizeconstructor.dynamicvalues.parameterizetwo;

public class StudentMarks {
    private String name;
    private int marks;

    public StudentMarks(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Student: " + name + ", Marks: " + marks);
    }
}

