package com.kapilsharma.oops.level2.interfaces;

public class GameRunner {

	public static void main(String[] args) {
		GamingConsole mario = new MarioGame();
		GamingConsole chess = new ChessGame();
		
		System.out.println("Mario Game Consoles: ");
		mario.up();
		mario.down();
		mario.left();
		mario.right();
		
		System.out.println("Chess Game Consoles: ");
		chess.up();
		chess.down();
		chess.left();
		chess.right();
	}

}
