package com.example.moviedemo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
    private int id;
    private String title;
    private String genre;

}