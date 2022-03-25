package com.assignment.cg.IV;

public class MyThread extends Thread{
	MyThread(){
		super("Child Thread");
		start();
	}
	
	@Override
	public void run() {
		System.out.println("Child Thread is running");
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread Running for "+i+"th time");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
