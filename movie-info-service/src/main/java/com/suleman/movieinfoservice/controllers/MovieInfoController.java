package com.suleman.movieinfoservice.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.suleman.movieinfoservice.pojos.Movie;

@RestController
@CrossOrigin
public class MovieInfoController {
	
	@GetMapping("/api/movies/{id}")
	public Movie getMovie(@PathVariable("id")int id)
	{
		return new Movie(id, "Don");
	}

}
