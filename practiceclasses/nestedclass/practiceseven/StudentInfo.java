package com.practiceclasses.nestedclass.practiceseven;
import java.util.Scanner;
public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Department: ");
        String department1 = sc.nextLine();
        System.out.print("Students: ");
        int student1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Department: ");
        String department2 = sc.nextLine();
        System.out.print("Students: ");
        int student2 = sc.nextInt();

        University outer = new University();
        University.Department inner1 = outer.new Department(department1, student1);
        System.out.println("Department: " + inner1.getDepartment() + ", Student: " + inner1.getStudent());

        University.Department inner2 = outer.new Department(department2, student2);
        System.out.println("Department: " + inner2.getDepartment() + ", Student: " + inner2.getStudent());

        System.out.println("Total Department: " + University.Department.departmentCount);

        sc.close();
    }
}
