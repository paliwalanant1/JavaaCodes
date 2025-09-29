package constructor.parameterizeconstructor.dynamicvalues.parameterizethree;

public class TeacherSubject {
    private String teacher;
    private String subject;

    public TeacherSubject(String teacher, String subject) {
        this.teacher = teacher;
        this.subject = subject;
    }

    public void show() {
        System.out.println("Teacher: " + teacher + ", Subject: " + subject);
    }
}
