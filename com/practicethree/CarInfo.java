package com.practicethree;
import java.util.Scanner;
public class CarInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car obj = new Car();
        System.out.print("Car Model: ");
        obj.model = sc.nextLine();
        System.out.print("Car Price: ");
        obj.price = sc.nextInt();
        obj.displayCarInfo();
    }
}
