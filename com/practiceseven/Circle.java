package com.practiceseven;

public class Circle {
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public void area(){
        System.out.println("Area: " + Math.PI * (radius * radius));
    }
    public void circumference(){
        System.out.println("Circumference: " + 2 * Math.PI * radius);
    }

}
