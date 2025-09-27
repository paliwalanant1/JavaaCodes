package com.practiceclasses.nestedclass.practicefour;
import java.util.Scanner;
public class EmployeeAttendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Attendance: ");
        String attendance = sc.nextLine();

        Attendance att = new Attendance() {
            @Override
            public void mark(String name, String attendance) {
                System.out.println("Employee: " + name);
                System.out.println("Attendance Marked: " + attendance);
            }
        };
        att.mark(name, attendance);

        sc.close();
    }
}
