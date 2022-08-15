package com.org.tav.test1;

import java.util.Scanner;

class employe{
	String name;
	int id;
	String sk;
	int exp;
	double sal;
	
	employe(String s,int i,double sl,String a,int e){
		name = s;
		id = i;
		sal = sl;
		sk = a;
		exp = e;
	}
}


public class JavaDev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		employe e[] = new employe[6];
		
		e[0]= new employe("harsha",1,100000,"java",3);
		e[1]= new employe("rithik",2,200000,"r",2);
		e[2]= new employe("anubhav",3,700000,"java",1);
		e[3]= new employe("shivam",4,100000,"kotlin",5);
		e[4]= new employe("dheraj",5,200000,"python",3);
		e[5]= new employe("shivesh",6,700000,"java",7);
		
		int cnt=0;
		for(int i=0;i<6;i++) {
			if(e[i].sk=="java") {
				System.out.println("name:"+e[i].name+" ,id:"+e[i].id+" ,sal:"+e[i].sal+" ,exp"+e[i].exp);
				cnt++;
			}
		}
		System.out.println("no:of java employes :"+cnt);
		
		System.out.println("------------------------------------------------");

		System.out.println("enter increment their salaries:");
		double ti = sc.nextInt();
		
		System.out.println("increased salaries :");
		for(int i=0;i<6;i++) {
			if(e[i].sk=="java") {
				e[i].sal = e[i].sal + ti;
				System.out.println("name:"+e[i].name+" ,id:"+e[i].id+" ,sal:"+e[i].sal+" ,exp"+e[i].exp);
			}
		}
	}

}
