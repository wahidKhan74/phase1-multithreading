package com.simplilearn.threads;

public class ThreadWithAnonymousClass {

	public static void main(String[] args) {
		
		Runnable obj1 = new Runnable() {			
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
		};
		
		Runnable obj2 = new Runnable() {			
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
		};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);	
		
		t1.start();
		try { Thread.sleep(10); } catch (InterruptedException e) {}
		t2.start();

	}

}
