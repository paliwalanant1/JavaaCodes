package com.practiceseven;
import java.util.Scanner;
public class MainCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        double radius = sc.nextDouble();

        Circle obj = new Circle(radius);
        obj.area();
        obj.circumference();
    }
}
