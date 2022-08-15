package com.org.tav.day1;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter ur name:");
		String name = sc.next();
		System.out.println("hai "+name);
		
		System.out.println("enter ur mat,sci,eng,comp marks:");
        int mat = sc.nextInt();
        int sci = sc.nextInt();
        int eng = sc.nextInt();
        int comp = sc.nextInt();
        
        int tot = mat+sci+eng+comp;
        System.out.println("your total:"+tot);
        int grd=tot/4;
       
        if(grd>=90) {
        	System.out.println("your grade:A+");
        }
        else if(grd>=85 && grd<90) {
        	System.out.println("your grade:A");
        }
        else {
        	System.out.println("your grade:B");
        }
	}

}

