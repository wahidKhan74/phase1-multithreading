package com.simplilearn.threads;

class Krishna {
	public void show() {
		System.out.println(" I  am Krishna");
	}
}

class Ramu extends Krishna implements Runnable {
	
	private Thread referenceThread;
	
	public void run() {
		
		if(referenceThread !=null) {
			try { referenceThread.join(); } catch (InterruptedException e) { }
		}
		
		for(int i = 0 ; i< 5;i++) {
			System.out.println("Ram : Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void setReferenceThread(Thread t) {
		this.referenceThread = t;
	}
}

class Shamu implements Runnable {
	
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

public class ThreadDemo3 {

	public static void main(String[] args) throws Exception {
		
		Ramu obj1 = new Ramu();
		Runnable obj2 = new Shamu();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		
		t1.start();
		try { Thread.sleep(10); } catch (InterruptedException e) {}
		t2.start();
		
		/////to join t2 with t1
		obj1.setReferenceThread(t2);
		
		// t1 joins main method
		t1.join();
		
		
		System.out.println("Hello from : main");
	}

}
