package com.gsweb.guess_the_movie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gsweb.guess_the_movie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
