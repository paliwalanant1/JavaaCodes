package com.practiceeleven;
import java.util.Scanner;
public class LaptopDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Brand: ");
        String brand = sc.nextLine();
        System.out.print("RAM: ");
        int ramSize = sc.nextInt();

        Laptop obj = new Laptop(brand, ramSize);
        obj.showDetails();
    }
}
