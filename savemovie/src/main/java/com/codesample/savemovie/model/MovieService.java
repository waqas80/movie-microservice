package com.codesample.savemovie.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public void saveOrUpdate(Movie movie) {
        movieRepository.save(movie);
    }

}
