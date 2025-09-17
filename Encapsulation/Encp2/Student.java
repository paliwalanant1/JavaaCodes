package Encapsulation.Encp2;

public class Student{
    private String name = "Anant Paliwal";
    private int age = 20;
    private int rollNumber = 233009;
    private String department = "BCA";

    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNumber(){
        return this.rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getDepartment(){
        return this.department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}