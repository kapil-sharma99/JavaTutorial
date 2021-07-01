package com.kapilsharma.oops.level2;

public class Fan {
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;
	
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}
	
	public String toString() {
		return String.format("make: %s, Radius: %f, color: %s, isOn: %b, speed: %d", make, radius, color, isOn, speed);
	}
	
	public void switchOff() {
		this.isOn = false;
		this.speed = 0;
	}
	
	public void switchOn() {
		this.isOn = true;
	}
	
	public void setSpeed(byte speed) {
		this.speed = speed;
	}
}
