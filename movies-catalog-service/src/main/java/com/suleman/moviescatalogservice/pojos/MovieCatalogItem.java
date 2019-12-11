package com.suleman.moviescatalogservice.pojos;

public class MovieCatalogItem {
	
	private String name;
	private String description;
	private int rating;
	
	public MovieCatalogItem() {
		// TODO Auto-generated constructor stub
	}

	public MovieCatalogItem(String name, String description, int rating) {
		super();
		this.name = name;
		this.description = description;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
