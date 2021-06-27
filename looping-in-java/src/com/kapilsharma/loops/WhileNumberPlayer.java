package com.kapilsharma.loops;

public class WhileNumberPlayer {
	
	private int limit;

	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	public void printSquareUptoLimit() {
		int i = 1;
		while(i*i < limit) {
			System.out.print("Sqaure: " + i*i + " ");
			i++;
		}
		System.out.println();
	}

	public void printCubeUptoLimit() {
		int i = 1;
		while(i*i*i < limit) {
			System.out.print("Cube: " + i*i*i + " ");
			i++;
		}
		System.out.println();
	}

}
