package com.example.omdbapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.omdbapi.model.Movie;
import com.example.omdbapi.service.OmdbService;

@RestController
@RequestMapping("/api/movies")
@CrossOrigin(origins = "*") // Allow frontend to call
public class MovieController {

    @Autowired
    private OmdbService omdbService;

    @GetMapping("/search")
    public List<Movie> searchMovies(@RequestParam String query) {
        return omdbService.searchMovies(query);
    }
}
