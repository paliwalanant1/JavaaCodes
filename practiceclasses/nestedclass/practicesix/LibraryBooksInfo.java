package com.practiceclasses.nestedclass.practicesix;

import java.util.Scanner;
public class LibraryBooksInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Book: ");
        String book1 = sc.nextLine();
        System.out.print("Author: ");
        String author1 = sc.nextLine();
        System.out.print("Available: ");
        String availability1 = sc.nextLine();

        System.out.print("Book: ");
        String book2 = sc.nextLine();
        System.out.print("Author: ");
        String author2 = sc.nextLine();
        System.out.print("Available: ");
        String availability2 = sc.nextLine();

        Library.Book inner1 = new Library.Book(book1, author1, availability1);
        System.out.println("Book: " + inner1.getBook() + ", Author: " + inner1.getAuthor() + ", Available: " + inner1.getAvailability());

        Library.Book inner2 = new Library.Book(book2, author2, availability2);
        System.out.println("Book: " + inner2.getBook() + ", Author: " + inner2.getAuthor() + ", Available: " + inner2.getAvailability());

        System.out.println("Total Books: " + Library.Book.bookCount);

        sc.close();
    }
}
