package com.kapilsharma.functionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		System.out.println("Using Basic print function: ");
		printBasic(list);
		System.out.println("Using FP function: ");
		printWithFP(list);
		System.out.println("Using BasicWithFiltering function: ");
		printBasicWithFiltering(list);
		System.out.println("Using FP Filtering function: ");
		printWIth
	}

	private static void printBasic(List<String> list) {
		for(String string:list) {
			System.out.println(string);
		}
	}
	
	private static void printBasicWithFiltering(List<String> list) {
		for(String string:list) {
			if(string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}
	
	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
	}
	
	private static void printWithFPWithFiltering(List<String> list) {
		list.stream()
			.filter(
					element -> element.endsWith("at"))
			.forEach(
				element -> System.out.println(element));
	}

}
