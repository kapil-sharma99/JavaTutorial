package com.kapilsharma.concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {
		//Map<Character, LongAdder> occurances = new Hashtable<>(); map are not thread safe
		ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap<>(); //thread safe and contains all methods that a typical map had
		String str = "ABCD ABCD ABCD";
		for(char character:str.toCharArray()) {
			occurances.computeIfAbsent(character, ch -> new LongAdder()).increment();
//			LongAdder longAdder = occurances.get(character);
//			if(longAdder == null) {
//				longAdder = new LongAdder();
//			}
//			longAdder.increment();
//			occurances.put(character, longAdder);
		}
		System.out.println(occurances);
	}

}
