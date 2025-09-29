package object.newobject.newtwentyone;

public class TeacherAssistant {
    private String name;
    private int assignedClass;

    public TeacherAssistant(String name, int assignedClass) {
        this.name = name;
        this.assignedClass = assignedClass;
    }

    public void showDetails() {
        System.out.println("Teacher Assistant: " + name + ", Class Assigned: " + assignedClass);
    }
}
