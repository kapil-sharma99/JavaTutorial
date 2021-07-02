package com.kapilsharma.oops.level2.interfaces;

public class MarioGame implements GamingConsole{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("JUMP!!");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Goes into Hole!!");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Move Forward!!");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Move Backward!!");		
	}

}
