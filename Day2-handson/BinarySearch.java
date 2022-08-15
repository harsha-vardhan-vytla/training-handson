package com.org.tav.day2;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= { {2,4,6,8},{1,3,5,7},{2,3,5,7} };
		
		System.out.println("enter the position(r,c) to find element:");
		
		Scanner sc = new Scanner(System.in);
		int tr=sc.nextInt();
		int tc=sc.nextInt();
		
		System.out.println("element at position ("+tr+","+tc+") is :"+arr[tr-1][tc-1]);

	}

}
