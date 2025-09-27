package com.practiceclasses.nestedclass.practicesix;

public class Library {
    public static class Book{
        public String book;
        public String author;
        public String availability;
        public static int bookCount = 0;

        public Book(String book, String author, String availability){
            this.book = book;
            this.author = author;
            this.availability = availability;
            bookCount++;
        }
        public String getBook(){
            return book;
        }
        public String getAuthor(){
            return author;
        }
        public String getAvailability(){
            return availability;
        }
    }
}