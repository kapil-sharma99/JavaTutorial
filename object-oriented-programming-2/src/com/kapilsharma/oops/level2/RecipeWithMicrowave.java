package com.kapilsharma.oops.level2;

public class RecipeWithMicrowave extends AbstractRecipe{
	@Override
	void getReady() {
		System.out.println("Get the Raw Material!!");
		System.out.println("Switch on the Microwave");
	}
	
	@Override
	void doTheDish() {
		System.out.println("Get the stuffs ready!!");
		System.out.println("Put it in the Microwave");
	}
	
	@Override
	void cleanup() {
		System.out.println("Clean up the Utensils and cooking area!!");
		System.out.println("Switch off the Microwave");
	}
}
