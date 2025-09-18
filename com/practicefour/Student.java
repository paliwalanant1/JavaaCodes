package com.practicefour;

public class Student {
    public int rollNo;
    public String name;
    public int marks;

    public Student(int rollNo, String name, int marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    public void displayDetail(){
        System.out.println("Students Details ");
        System.out.print("RollNo: " + rollNo + ",Name: " + name + ", Marks: " + marks);
    }
}
