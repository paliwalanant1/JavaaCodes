package object.newobject.newthirteen;

public class Teacher {
    private String subject;
    private int experience;

    public Teacher(String subject, int experience) {
        this.subject = subject;
        this.experience = experience;
    }

    public void display() {
        System.out.println("Subject: " + subject + ", Experience: " + experience + " years");
    }
}
