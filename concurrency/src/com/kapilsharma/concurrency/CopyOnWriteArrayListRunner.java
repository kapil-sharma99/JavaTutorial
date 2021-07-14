package com.kapilsharma.concurrency;

import java.util.concurrent.CopyOnWriteArrayList;

import java.util.List;

public class CopyOnWriteArrayListRunner {

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		
		//thread - 3
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");
		
		//thread - 10000
		for(String element:list) {
			System.out.println(element);
		}
	}

}
