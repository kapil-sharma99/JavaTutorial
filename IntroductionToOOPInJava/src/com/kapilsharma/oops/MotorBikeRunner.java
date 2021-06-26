package com.kapilsharma.oops;

public class MotorBikeRunner {
	
	public static void main(String args[]) {
		MotorBike Honda = new MotorBike();
		MotorBike Ducati = new MotorBike();
		
		Honda.start();
		Ducati.start();
		
		Honda.enterSpeed(180);
		Ducati.enterSpeed(230);
		
		Ducati.increaseSpeed(100);
		
		System.out.println(Ducati.getSpeed());
	}

}
