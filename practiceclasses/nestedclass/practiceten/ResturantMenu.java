package com.practiceclasses.nestedclass.practiceten;

public class ResturantMenu {
    public class Category{
        public String category;
        public int items;

        public Category(String category, int items){
            this.category = category;
            this.items = items;
        }
        public void displayInfo(){
            System.out.println("Category: " + category + "\n" + "Items: " + items);
        }
    }
}
