package com.practicetweentyfive;

public class Order {
    public int id;
    public int amount;
    public String status;

    public Order(int id, int amount, String status){
        this.id = id;
        this.amount = amount;
        this.status = status;
    }
    public void displayOrder(){
        System.out.println("OrderID: " + id + ", Amount: " + amount + ", Status: " + status);
    }
}