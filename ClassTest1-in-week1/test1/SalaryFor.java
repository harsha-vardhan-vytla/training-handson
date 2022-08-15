package com.org.tav.test1;

class employ extends Thread{
	String dept;
	double hsal;
	double hr;
	String esf;
	
	public employ(String s,double d,double d2,String f){
		dept = s;
		hsal = d;
		hr = d2;
		esf = f;
	}
	
	synchronized public void run()
    {
        System.out.println("Salary formulae for "+dept+"  "+esf);
    }
}


public class SalaryFor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        employ e1 = new employ("harsha",300000,100000,"bsal*1.24+ha+oa+ins");
		employ e2 = new employ("dheeraj",400000,120000,"bsal+1800+ha+oa+ins");
		employ e3 = new employ("rajendra",500000,130000,"bsal*1.24+ha+oa+ins");
		
        Thread t1=new Thread(e1);
        Thread t2=new Thread(e2);
        Thread t3=new Thread(e3);
        
        t1.start();
        t2.start();
        t3.start();
		
		

	}

}

