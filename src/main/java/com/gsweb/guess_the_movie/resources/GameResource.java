package com.gsweb.guess_the_movie.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gsweb.guess_the_movie.services.GameService;

@RestController
@RequestMapping(value = "/game")
public class GameResource {
	
	private GameService gameService;
	
	
	
}
