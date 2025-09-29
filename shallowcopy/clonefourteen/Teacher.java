package object.cloneobject.shallowcopy.clonefourteen;

public class Teacher implements Cloneable{
    private String subject;
    private int experience;

    public Teacher(String subject, int experience) {
        this.subject = subject;
        this.experience = experience;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void profile() {
        System.out.println("Teacher: " + subject + ", Experience: " + experience + " years");
    }
}
