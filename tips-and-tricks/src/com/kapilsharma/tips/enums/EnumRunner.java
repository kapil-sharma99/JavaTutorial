package com.kapilsharma.tips.enums;

import java.util.Arrays;

enum Season {
	WINTER, SUMMER, SPRING, FALL;
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
