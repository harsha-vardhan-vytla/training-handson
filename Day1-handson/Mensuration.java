package com.org.tav.day1;


class Circle
{
	private int r;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
}
class Rectangle
{
	private int l,b;

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public void area()
	{
		System.out.println("area of rect:" + l*b);
	}
}

public class Mensuration {

	public static void main(String[] args) {
		

		Circle c1 = new Circle();
		c1.setR(2);
		System.out.println("area of circle: "+ c1.getR()*c1.getR()*3.14);
		
		Rectangle r1 = new Rectangle();
		r1.setB(10);
		r1.setL(10);
		r1.area();
	}

}
