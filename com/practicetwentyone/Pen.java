package com.practicetwentyone;

public class Pen {
    public String color;
    public int price;

    public Pen(String color, int price){
        this.color = color;
        this.price = price;
    }
    public void displayDetails(){
        System.out.println("Color: " + color + ", Price: " + price);
    }
}
