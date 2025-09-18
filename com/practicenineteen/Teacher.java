package com.practicenineteen;

public class Teacher {
    public String name;
    public String subject;

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    public void showDetails(){
        System.out.println("Name: " + name + ", Subject: " + subject);
    }
}
