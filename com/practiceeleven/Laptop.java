package com.practiceeleven;

public class Laptop {
    public String brand;
    public int ramSize;

    public Laptop(String brand, int ramSize){
        this.brand = brand;
        this.ramSize = ramSize;
    }
    public void showDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ramSize + "GB");
    }
}