package com.practicetwo;
import java.util.Scanner;
public class EmployeeDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Salary: ");
        int salary = sc.nextInt();

        Employee obj = new Employee(id, name, salary);
        obj.displayEmployeeDetails();
    }
}
