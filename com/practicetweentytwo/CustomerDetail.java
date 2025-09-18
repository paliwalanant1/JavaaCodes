package com.practicetweentytwo;
import java.util.Scanner;
public class CustomerDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("City: ");
        String city = sc.nextLine();

        Customer obj = new Customer(id, name, city);
        obj.displayDetails();
    }
}
