package com.tweentythree;
import java.util.Scanner;
public class MovieDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Director: ");
        String director = sc.nextLine();
        System.out.print("Rating: ");
        float rating = sc.nextFloat();

        Movie obj = new Movie(title, director, rating);
        obj.showMovieDetails();
    }
}
