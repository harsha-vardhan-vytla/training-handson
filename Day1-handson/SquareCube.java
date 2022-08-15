package com.org.tav.day1;

public class SquareCube {
	
	static int val;
	void square() {
		System.out.println("square of "+val+": "+ val*val);
	}
	void cube() {
		System.out.println("square of "+val+": "+ val*val*val);
	}

	public static void main(String[] args) {
		
		SquareCube sc1 = new SquareCube();
		val=3;
		sc1.square();
		sc1.cube();

	}

}
