package com.practiceeight;
import java.util.Scanner;
public class PersonDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();

        Person obj = new Person();
        obj.setName(name);
        obj.setAge(age);

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }

}
