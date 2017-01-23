package com.thread;

public class Foo {

	public static int fooCount = 0;

	public void display() {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				fooCount++;
				if(i==3){
					try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("Inside Foo, Thread : "
						+ Thread.currentThread().getName());
				System.out.println(fooCount);
			}
		}
		
	}
}
