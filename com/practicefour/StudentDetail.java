package com.practicefour;
import java.util.Scanner;
public class StudentDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("RollNo: ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Marks: ");
        int marks = sc.nextInt();

        Student obj = new Student(rollNo, name, marks);
        obj.displayDetail();
    }
}
