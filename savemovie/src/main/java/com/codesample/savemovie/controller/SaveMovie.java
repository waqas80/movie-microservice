package com.codesample.savemovie.controller;

import com.codesample.savemovie.model.Movie;
import com.codesample.savemovie.model.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaveMovie {

    @Autowired
    MovieService movieService;

    @PostMapping("/savemovie")
    private void saveMovie(@RequestBody Movie movie) {
        movieService.saveOrUpdate(movie);
    }
}
