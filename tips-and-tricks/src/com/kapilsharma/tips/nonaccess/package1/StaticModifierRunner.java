package com.kapilsharma.tips.nonaccess.package1;

class Player {
	private String name;
	private static int count = 0; //Static variable doesn't belongs to a particular object, it belongs to a particular class.
	
	public Player(String name) {
		super();
		this.name = name;
		count++;
	}	

	public String getName() { //This is an instace method, means can only be called by an instance(Object).
		return name; //In instance method we can use static variable.
	}

	public void setName(String name) {
		this.name = name;
	}

	static public int getCount() { //Inside static method we cannot use any nonstatic variable.
		return count;
	}
}

public class StaticModifierRunner {

	public static void main(String[] args) {
		Player player1 = new Player("Dhoni");
		Player player2 = new Player("Kholi");
		//System.out.println(player1.getCount()); this a also a method to call a static method
		System.out.println(Player.getCount());
	}

}
