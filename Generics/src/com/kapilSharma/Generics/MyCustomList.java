package com.kapilSharma.Generics;

import java.util.ArrayList;

public class MyCustomList<T> { // If wants to block some datatype to be used in place of T, we can use t extends Number, it will only allow the user to put a number type of data
	ArrayList<T> list = new ArrayList<>();
	public void addElement(T element) {
		list.add(element);
	}
	
	public void removeElement(T element) {
		list.remove(element);
	}
	
	public String toString() {
		return list.toString();
	}

	public T get(int index) {
		return list.get(index);
	}
}
