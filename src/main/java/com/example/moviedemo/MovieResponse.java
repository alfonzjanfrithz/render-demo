package com.example.moviedemo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class MovieResponse {
    private List<Movie> movies;
}