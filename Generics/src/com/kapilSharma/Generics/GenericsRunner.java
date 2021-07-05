package com.kapilSharma.Generics;

public class GenericsRunner {

	public static void main(String[] args) {
		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Kapil Sharma");
		list.addElement("Pushpam Sinha");
		System.out.println(list);
		
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(100));
		list2.addElement(Integer.valueOf(200));
		System.out.println(list2);
	}

}
