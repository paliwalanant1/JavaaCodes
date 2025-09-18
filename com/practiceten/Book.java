package com.practiceten;

public class Book {
    public String title;
    public String author;
    public int price;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
    }

    public void displayBookingInfo(){
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}
