package com.practiceseventeen;
import java.util.Scanner;

public class MainDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student st = new Student();
        System.out.print("College Name: ");
        College.collegeName = sc.nextLine();

        System.out.print("Name: ");
        st.name = sc.nextLine();

        System.out.print("RollNo: ");
        st.rollNo = sc.nextInt();

        st.studentDetails();
    }
}
