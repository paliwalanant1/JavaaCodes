package com.practiceseventeen;

public class Student extends College{
    public String name;
    public int rollNo;

    public void studentDetails(){
        System.out.print("Name: " + name + ", RollNo: " + rollNo + ", College: " + College.collegeName);
    }
}