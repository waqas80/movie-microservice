package com.codesample.movielist.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class SaveMovies {

    @Autowired
    private RestTemplate restTemplate;

    public void getMovies(MovieWrapper movieWrapper){
        for(Movie movie: movieWrapper.getMovies()){
            saveMovie(movie);
        }
    }

    public void saveMovie(Movie movie){
        restTemplate.postForObject("http://SAVE-MOVIE/savemovie",movie,Movie.class);
    }
}
