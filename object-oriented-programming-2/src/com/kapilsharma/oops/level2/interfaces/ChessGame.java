package com.kapilsharma.oops.level2.interfaces;

public class ChessGame implements GamingConsole{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Move Piece up!!");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Move Piece down!!");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Move piece forward!!");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Move Piece backward!!");		
	}

}
