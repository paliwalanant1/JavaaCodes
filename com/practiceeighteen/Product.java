package com.practiceeighteen;

public class Product {
    public int productId;
    public String productName;
    public int price;

    public Product(int productId, String productName, int price){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    public void showDetail(){
        System.out.println("ProductId: " + productId + ", ProductName: " + productName + ", Price: " + price);
    }
}