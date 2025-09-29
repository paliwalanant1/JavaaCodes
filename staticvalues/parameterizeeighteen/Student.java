package constructor.parameterizeconstructor.staticvalues.parameterizeeighteen;

public class Student {
    private String name;
    private int roll;


    // Default constructor
    public Student() {
        this.name = "Anant";
        this.roll = 101;
    }


    public String getName() {
        return name;
    }
    public int getRoll() {
        return roll;
    }


    @Override
    public String toString() {
        return "Name: " + name + ", Roll: " + roll;
    }
}
