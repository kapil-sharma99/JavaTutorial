package com.kapilSharma.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {
	
	static <X> X doubleValue(X value) {
		return value;
	}
	
	static Number sumOfNumberList(List<? extends Number> numbers) { // <? is called as UpperBoundedWildCard. Allows every value under Number 
		double sum = 0.0;
		for(Number number:numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}
	
	static void addACoupleOfValues(List<? super Number> numbers) { // <? is called as LowerBoundedWildCard. Allows every value above Number 
		numbers.add(1);
		numbers.add(1.1);
		numbers.add(2.0f);
		numbers.add(1l);
	}

	public static void main(String[] args) {
		
		List emptyList = new ArrayList<Number>();
		addACoupleOfValues(emptyList);
		System.out.println(emptyList);
		
		System.out.println(sumOfNumberList(List.of(1, 2, 3, 4, 5, 6)));
		System.out.println(sumOfNumberList(List.of(1.1, 2.2, 3.3, 4.4, 5.5, 6.6)));
		System.out.println(sumOfNumberList(List.of(1l, 2l, 3l, 4l, 5l, 6l)));
		
		String stringValue = doubleValue(new String());	
		int integerValue = doubleValue(Integer.valueOf(5));
		ArrayList arrayListValue = doubleValue(new ArrayList());
		
		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Kapil Sharma");
		list.addElement("Pushpam Sinha");
		String value = list.get(0);
		System.out.println(value);
		System.out.println(list);
		
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(100));
		list2.addElement(Integer.valueOf(200));
		Integer value2 = list2.get(0);
		System.out.println(value2);
		System.out.println(list2);
	}

}
