package classes.pojoclass.pojoone;

public class StudentInfo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Anant");
        s.setAge(20);
        System.out.println("Name: " + s.getName() + ", Age: " + s.getAge());
    }
}
