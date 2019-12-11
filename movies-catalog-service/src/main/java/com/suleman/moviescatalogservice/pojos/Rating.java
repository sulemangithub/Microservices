package com.suleman.moviescatalogservice.pojos;

public class Rating {
	
	private int id;
	private int rating;
	
	public Rating() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Rating(int id, int rating) {
		super();
		this.id = id;
		this.rating = rating;
	}

}
