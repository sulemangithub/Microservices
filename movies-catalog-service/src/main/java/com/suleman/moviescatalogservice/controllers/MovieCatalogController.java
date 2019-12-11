package com.suleman.moviescatalogservice.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.suleman.moviescatalogservice.pojos.Movie;
import com.suleman.moviescatalogservice.pojos.MovieCatalogItem;
import com.suleman.moviescatalogservice.pojos.Rating;
import com.suleman.moviescatalogservice.pojos.UserRating;

@RestController
public class MovieCatalogController {
	
	@Autowired
	RestTemplate restTemplate;
	
	/*@Autowired
	WebClient.Builder webClientBuilder;*/
	
	@GetMapping("/api/catalog/{userid}")
	public List<MovieCatalogItem> getMovieCatalogs(@PathVariable("userid")String userid)
	{
		UserRating userRatings = restTemplate.getForObject("http://rating-data-service/api/users/"+userid, UserRating.class);
		
		List<Rating> ratings = userRatings.getRatings();
		
		List<MovieCatalogItem> list = ratings.stream().map(rating->{
			Movie movie = restTemplate.getForObject("http://movie-info-service/api/movies/"+rating.getId(), Movie.class);
			return new MovieCatalogItem(movie.getName(), "Description", rating.getRating());
		}).collect(Collectors.toList()); 
						
		return list;
	}

}
