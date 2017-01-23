package com.thread;

public class MyThread extends Thread {
	
	private int count = 0;

	public MyThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<3;i++) {
			count++;
			System.out.println("Running thread : " +Thread.currentThread().getName() +": "+i);
			System.out.println("count value is :" +count);
		}
	}
}
