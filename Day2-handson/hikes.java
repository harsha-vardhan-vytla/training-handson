package com.org.tav.day2;

class employe{
	String name;
	double sal;
	
	employe(String s,double sl){
		name = s;
		sal=sl;
	}
	void hike() {
		if(sal>50000 & sal<=100000) {
			sal=sal*1.20;
		}
		else if(sal>100000 & sal<=50000) {
			sal=sal*1.25;
		}
		else if(sal>500000 & sal<=1000000) {
			sal=sal*1.28;
		}
	}
}


public class hikes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		employe e[] = new employe[3];
		
		e[0]= new employe("harsha",100000);
		e[1]= new employe("sneha",200000);
		e[2]= new employe("raghavendra",700000);
		
		e[0].hike();
		e[1].hike();
		e[2].hike();
		
		System.out.println("sorted new salaries:");
		System.out.println("----------------------");
		for(int i=0;i<3;i++) {
			for(int j=i;j<3;j++) {
				if(e[i].sal<=e[j].sal) {
					String tem=e[i].name;
					double temp=e[i].sal;
					e[i].sal=e[j].sal;
					e[i].name=e[j].name;
					e[j].sal=temp;
					e[j].name=tem;
				}
				
			}
		}
		
		for(int i=0;i<3;i++) {
			System.out.println("name :"+e[i].name+" , sal :"+e[i].sal);
		}
		System.out.println("-----------------------");
		System.out.println("maximum hiked salary :"+e[0].sal+" of "+e[0].name);
		System.out.println("maximum hiked salary :"+e[2].sal+" of "+e[2].name);
		
		
		
	}

}
