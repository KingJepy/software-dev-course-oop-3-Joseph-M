package org.example;

public class Movie extends LibraryItem{
    private int durationInMinutes;

    public Movie(String title, String author, int year, int duration){
        super(title, author, year);
        this.durationInMinutes = duration;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    @Override
    public String toString() {
        return "Movie: " + getTitle() + " by " + getAuthor() + " (" + getYear() + ") - " + durationInMinutes + " minutes";
    }
}
