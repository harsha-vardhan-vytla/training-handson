package com.org.tav.day1;


class stud{
	
	String stuname;
	
	stud(){
		stuname="unknown";
	}
	stud(String sn){
		stuname=sn;
	}
	void disp() {
		System.out.println("name of stu:"+ stuname);
	}
}

public class StudentName {

	public static void main(String[] args) {
		
		stud s1 = new stud();
		stud s2 = new stud("harsha");
		s1.disp();
		s2.disp();
		
	}

}
