package com.suleman.ratingdataservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.suleman.ratingdataservice.pojos.Rating;
import com.suleman.ratingdataservice.pojos.UserRating;

@RestController
public class MovieRatingController {
	
	@GetMapping("/api/ratings/{id}")
	public Rating getRating(@PathVariable int id)
	{
		return new Rating(id, 4);
	}
	
	@GetMapping("/api/users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId)
	{
		List<Rating> ratings = Arrays.asList(new Rating(1232,4),new Rating(4534,3));
		UserRating userrating = new UserRating();
		userrating.setRatings(ratings);
		return userrating;
	}
}
