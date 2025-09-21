package classes.ConcreteClass.practicefive;

public class Student {
    public int rollNo;
    public String name;
    public String gender;

    public Student(int rollNo, String name, String gender){
        this.rollNo = rollNo;
        this.name = name;
        this.gender = gender;
    }
    public void displayStudentDetail(){
        System.out.println("RollNo: " + rollNo +  ", Name: " + name + ", Gender: " + gender);
    }
}