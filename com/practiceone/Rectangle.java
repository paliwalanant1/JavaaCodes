package com.practiceone;
//import java.util.Scanner;
public class Rectangle {
    public int length;
    public int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void area(){
        System.out.println("Area: " + (length*width));
        System.out.println("Perimeter: " + 2*(length+width));
    }
}
