package com.org.tav.day2;

public class ThreadCourse extends Thread {

	String task;
	
	public ThreadCourse (String task){
		super();
		this.task = task;
	}
	
	public void run() {
			System.out.println(task);
			try { 
				Thread.sleep(2000);
			}catch(Exception e) {
				//
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadCourse t1 = new ThreadCourse("Task1:Core Java");
		ThreadCourse t2 = new ThreadCourse("Task2:Adv Java");
		ThreadCourse t3 = new ThreadCourse("Task3:Spring");
		ThreadCourse t4 = new ThreadCourse("Task4:JDBC");
		
		Thread tt  = new Thread(t1);
		Thread tt1 = new Thread(t2);
		Thread tt2 = new Thread(t3);
		Thread tt3 = new Thread(t4);
		
		tt.start();
		tt1.start();
		tt2.start();
		tt3.start();
	}

}

