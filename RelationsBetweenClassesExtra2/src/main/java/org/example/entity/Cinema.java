package org.example.entity;

public class Cinema {

    private Movie movie;
    private MovieViewer movieViewer;
    private int room;


    public Cinema() {
    }

    public Cinema(Movie movie, MovieViewer movieViewer, int room) {
        this.movie = movie;
        this.movieViewer = movieViewer;
        this.room = room;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public MovieViewer getMovieViewer() {
        return movieViewer;
    }

    public void setMovieViewer(MovieViewer movieViewer) {
        this.movieViewer = movieViewer;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

}
