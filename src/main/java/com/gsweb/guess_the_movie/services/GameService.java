package com.gsweb.guess_the_movie.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsweb.guess_the_movie.entities.Movie;
import com.gsweb.guess_the_movie.entities.Player;
import com.gsweb.guess_the_movie.repositories.MovieRepository;

@Service
public class GameService {
	
	private MovieService movieService;
	
	private Movie movieDrawn = null;
	private Player p;
	
	public void startGame(String name) {
		p.setName(name);
		
		movieDrawer();
		 
	 }
	
	public void movieDrawer() {
		List<Movie> movies = new ArrayList<>();
		Random random = new Random();
		
		movies = movieService.findAll();
		
		int randomIndex = random.nextInt(movies.size());
		
		movieDrawn = movies.get(randomIndex);
	}
	
	
}
