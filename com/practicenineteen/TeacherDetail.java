package com.practicenineteen;
import java.util.Scanner;
public class TeacherDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Subject: ");
        String subject = sc.nextLine();

        Teacher obj = new Teacher(name, subject);
        obj.showDetails();
    }
}
