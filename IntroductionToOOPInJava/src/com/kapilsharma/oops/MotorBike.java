package com.kapilsharma.oops;

public class MotorBike {
	private int speed;
	
	void enterSpeed(int sp) {
		speed = sp;
	}
	
	int getSpeed() {
		return this.speed;
	}
	
	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}
	
	void start() {
		System.out.println("Bike has been started");
	}
}
