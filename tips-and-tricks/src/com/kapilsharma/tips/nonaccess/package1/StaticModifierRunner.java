package com.kapilsharma.tips.nonaccess.package1;

class Player {
	private String name;
	private static int count = 0;
	
	public Player(String name) {
		super();
		this.name = name;
		count++;
	}

	public int getCount() {
		return count;
	}
}

public class StaticModifierRunner {

	public static void main(String[] args) {
		Player player1 = new Player("Dhoni");
		Player player2 = new Player("Kholi");
		System.out.println(player1.getCount());
	}

}
