package com.kapilsharma.oops.level2;

public class Recipe1 extends AbstractRecipe{
	@Override
	void getReady() {
		System.out.println("Get the Raw Material!!");
		System.out.println("Get the Utensils");
	}
	
	@Override
	void doTheDish() {
		System.out.println("Do the Dish!!");
	}
	
	@Override
	void cleanup() {
		System.out.println("Clean up the Utensils and cooking area!!");
	}
}
