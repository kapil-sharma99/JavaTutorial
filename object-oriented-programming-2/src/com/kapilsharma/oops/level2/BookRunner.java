package com.kapilsharma.oops.level2;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "Object Oriented Programming with Java", "Kapil Sharma");
		book.addReview(new Review(10, "Greak Book", 5));
		book.addReview(new Review(101, "Awesome", 5));
		
		System.out.println(book);

	}

}
