package com.kapilsharma.tips.anonmyous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o1.length(), o2.length());
	}
	
}

public class AnonymousClassRunner {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>(List.of("Ant", "Cat", "Ball", "Elephant", "Dragon"));
		//Collections.sort(animals, LengthComparator()); [This method can also be used whhich requires another new class]
		Collections.sort(animals, new Comparator<String>() { //Anonymous class: Doesnot have any name.
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
			
		});
		System.out.println(animals);
		
	}

}
