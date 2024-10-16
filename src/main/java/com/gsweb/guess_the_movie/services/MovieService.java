package com.gsweb.guess_the_movie.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gsweb.guess_the_movie.entities.Movie;
import com.gsweb.guess_the_movie.repositories.MovieRepository;

public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	public List<Movie> findAll() {
		return movieRepository.findAll();
	}
}
