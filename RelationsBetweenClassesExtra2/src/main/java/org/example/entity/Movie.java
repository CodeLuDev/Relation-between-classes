package org.example.entity;

public class Movie {

    private String title;
    private int durationMovie;
    private int minimumAge;
    private String director;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Movie() {
    }

    public Movie(String title, int durationMovie, int minimumAge, String director, int price) {
        this.title = title;
        this.durationMovie = durationMovie;
        this.minimumAge = minimumAge;
        this.director = director;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationMovie() {
        return durationMovie;
    }

    public void setDurationMovie(int durationMovie) {
        this.durationMovie = durationMovie;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
