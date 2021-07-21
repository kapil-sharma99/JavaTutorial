package com.kapilsharma.tips.enums;

import java.util.Arrays;

enum Season {
	WINTER(0), SUMMER(1), SPRING(2), FALL(3);
	
	private int value;
	
	private Season(int value) {
		this.value = value;
	}
}

public class EnumRunner {

	public static void main(String[] args) {
		Season season = Season.WINTER;
		
		Season season1 = Season.valueOf("WINTER");
		System.out.println(season1);
		System.out.println(season1.ordinal());
		System.out.println(Arrays.toString(Season.values()));
	}

}
