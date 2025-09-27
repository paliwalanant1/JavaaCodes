package com.practiceclasses.nestedclass.practicefive;

public class Bill {
    public static class Item{
        public String itemOne;
        public int priceOne;
        public String itemTwo;
        public int priceTwo;
        public int  total = 0;

        public Item(String itemOne, int priceOne, String itemTwo, int priceTwo){
            this.itemOne = itemOne;
            this.priceOne = priceOne;
            this.itemTwo = itemTwo;
            this.priceTwo = priceTwo;
        }
        public void grandTotal(){
            System.out.println("Items:");
            System.out.println(itemOne + " - " + priceOne);
            System.out.println(itemTwo + " - " + priceTwo);
            System.out.println("Total: " + (priceOne+priceTwo));
        }
    }
}
