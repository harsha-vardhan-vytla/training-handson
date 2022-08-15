package com.org.tav.day1;

import java.util.Scanner;


public class PrintPress {

	static void bill(int c){
		System.out.println("for copies   0-99   price per copy:30ps");
		System.out.println("for copies 100-499  price per copy:28ps");
		System.out.println("for copies 500-799  price per copy:27ps");
		System.out.println("for copies 800-1000 price per copy:26ps");
		System.out.println("for copies  >1000   price per copy:25ps");
		if(c<=99) {
			System.out.println("total bill:"+ 30*c +"ps");
		}
		else if(c>=100 && c<500) {
			System.out.println("total bill:"+ 28*c +"ps");
		}
		else if(c>=500 && c<800) {
			System.out.println("total bill:"+ 27*c +"ps");
		}
		else if(c>=800 && c<=1000) {
			System.out.println("total bill:"+ 26*c +"ps");
		}
		else {
			System.out.println("total bill:  25ps x "+c +" = " + 25*c +"ps");
		}
	}
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter copies req:");
	int copies = sc.nextInt();
	
	bill(copies);

	}

}
