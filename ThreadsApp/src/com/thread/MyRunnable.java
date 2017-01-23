package com.thread;

public class MyRunnable implements Runnable {
	
	private int count = 0;
	private final Object MUTEX_OBJ = new Object();

	@Override
	public void run() {

		synchronized (MUTEX_OBJ) {
			for(int i=0;i<5;i++) {
				count++;
				System.out.println("Running thread : " +Thread.currentThread().getName() +": "+i);
				System.out.println("count value" +count);
			}
		}
		
	}

}
