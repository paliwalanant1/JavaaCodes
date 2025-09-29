package object.cloneobject.shallowcopy.cloneeight;

public class Student implements Cloneable {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display() {
        System.out.println("Student: " + name + ", Roll: " + rollNo);
    }
}
