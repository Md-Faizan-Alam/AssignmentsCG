package com.assignment.cg.IV;

public class MyThreadDemo {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		MyThread parent = new MyThread();
		
		System.out.println("Main Thread is running");
		for(int i=0;i<10;i++) {
			System.out.println("The main thread is running for the "+i+"th time");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
