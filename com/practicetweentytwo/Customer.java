package com.practicetweentytwo;

public class Customer {
    public int id;
    public String name;
    public String city;

    public Customer(int id, String name,String city){
        this.id = id;
        this.name = name;
        this.city = city;
    }
    public void displayDetails(){
        System.out.println("Id: " + id + ", Name: " + name + ", City: " + city);
    }
}
