package com.simplilearn.threads;

class Ram extends Thread {
	
	public void run() {
		for(int i = 0 ; i< 5;i++) {
			System.out.println("Ram : Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Sham extends Thread {
	
	public void run() {
		for(int i = 0 ; i< 5;i++) {
			System.out.println("Sham : Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		Ram t1 = new Ram();
		
		Sham t2 = new Sham();
		
		
		t1.start();
		t2.start();

	}

}
