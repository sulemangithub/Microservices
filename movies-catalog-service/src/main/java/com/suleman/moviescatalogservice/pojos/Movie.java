package com.suleman.moviescatalogservice.pojos;

public class Movie {

	private int id;
	private String name;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}
