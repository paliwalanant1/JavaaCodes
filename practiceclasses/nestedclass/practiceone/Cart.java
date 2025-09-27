package com.practiceclasses.nestedclass.practiceone;

public class Cart {
    public static class Item{
        public String item;
        public int quantity;
        public int price;

        public Item(String item, int quantity, int price){
            this.item = item;
            this.quantity = quantity;
            this.price = price;
        }
        public void itemDetail(){
            System.out.println("Item: " + item + " - " + quantity + " x " + price);
        }
        public int itemTotal(){
            return price * quantity;
        }
    }
}
