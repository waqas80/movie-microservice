package com.codesample.movielist.controller;

import com.codesample.movielist.model.MovieWrapper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovieList {

    @RequestMapping(value = "/movielist", method = RequestMethod.POST)
    public String movieList(@RequestBody MovieWrapper movieWrapper){

        return "Hello";
    }

}
