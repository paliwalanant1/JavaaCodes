package com.tweentythree;

public class Movie {
    public String title;
    public String director;
    public float rating;

    public Movie(String title, String director, float rating){
        this.title = title;
        this.director = director;
        this.rating = rating;
    }
    public void showMovieDetails(){
        System.out.println("Title: " + title + ", Director: " + director + ", Rating: " + rating);
    }
}