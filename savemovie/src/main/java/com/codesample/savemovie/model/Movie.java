package com.codesample.savemovie.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    private int movieId;
    private String movieName;
    private String movieDescription;
    private String movieDirectory;
    private String movieWriter;
    private String movieCategory;
    private String movieReleaseYear;
}
