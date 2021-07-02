package com.kapilsharma.oops.level2;

import java.util.ArrayList;

public class Book {
	
	private int id;
	private String name;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>(); 

	public Book(int id, String name, String author) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public void addReview(Review review) {
		// TODO Auto-generated method stub
		this.reviews.add(review);
	}
	
	public String toString() {
		return String.format("id: %d, Name: %s, Author: %s, Reviews: [%s]", id, name, author, reviews);
	}

}
