package com.example.moviedemo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MovieService {

    public List<Movie> getMovies() {
        return Arrays.asList(
                new Movie(1, "Inception", "Sci-Fi"),
                new Movie(2, "Interstellar", "Sci-Fi"),
                new Movie(3, "The Dark Knight", "Action")
        );
    }
}