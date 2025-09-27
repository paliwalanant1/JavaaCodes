package com.practiceclasses.nestedclass.practiceeight;

public class OnlineStore {
    public class Discount{
        private float price;
        private float discount;

        public Discount(float price, float discount){
            this.price = price;
            this.discount = discount;
        }
        public float getPrice(){
            return price;
        }
        public float getDiscount(){
            return discount;
        }
        public void finalAmount(){
            float finalPrice = price * discount/100;
            System.out.println("Final Price: " + (price - finalPrice));
        }
    }
}
