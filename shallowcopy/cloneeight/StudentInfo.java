package object.cloneobject.shallowcopy.cloneeight;

public class StudentInfo {
    public static void main(String[] args)  {
        try {
            Student s1 = new Student("Anant", 101);
            Student s2 = (Student) s1.clone();
            s1.display();
            s2.display();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
    }
}
