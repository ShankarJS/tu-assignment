package com.tu;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new MyRunnable(), "T1");
		Thread t2 = new Thread(new MyRunnable(), "T2");
		Thread t3 = new Thread(new MyRunnable(), "T3");
		Thread t4 = new Thread(new MyRunnable(), "T4");
		Thread t5 = new Thread(new MyRunnable(), "T5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		t5.start();
	}
	
	static class MyRunnable implements Runnable{

		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Thread "+ Thread.currentThread().getName() + " is running");
		}
		
		
	}

}
