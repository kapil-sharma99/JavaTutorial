package com.datesinjava;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateAndLocalTimeAndLocalDateTime {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getDayOfYear());
		System.out.println(now.getDayOfWeek());
		System.out.println(now.isLeapYear());
		System.out.println(now.plusDays(100));
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);
		System.out.println(now2.getHour());
	}
}
