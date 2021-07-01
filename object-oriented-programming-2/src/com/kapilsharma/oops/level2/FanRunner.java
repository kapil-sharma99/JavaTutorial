package com.kapilsharma.oops.level2;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Bajaj", 0.3434, "Green");
		fan.switchOn();
		fan.setSpeed((byte)3);
		System.out.println(fan);
	}

}
