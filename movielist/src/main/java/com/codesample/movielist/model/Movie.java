package com.codesample.movielist.model;

public class Movie {

    private String movieName;
    private String movieDescription;
    private String movieDirectory;
    private String movieWriter;
    private String movieCategory;
    private String movieReleaseYear;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public String getMovieDirectory() {
        return movieDirectory;
    }

    public void setMovieDirectory(String movieDirectory) {
        this.movieDirectory = movieDirectory;
    }

    public String getMovieWriter() {
        return movieWriter;
    }

    public void setMovieWriter(String movieWriter) {
        this.movieWriter = movieWriter;
    }

    public String getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(String movieCategory) {
        this.movieCategory = movieCategory;
    }

    public String getMovieReleaseYear() {
        return movieReleaseYear;
    }

    public void setMovieReleaseYear(String movieReleaseYear) {
        this.movieReleaseYear = movieReleaseYear;
    }
}
