package com.thread;

import java.util.Queue;

public class Consumer extends Thread {

	Queue<Integer> sharedQueue;

	public Consumer(Queue<Integer> sharedQueue, String name) {
		super(name);
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName()+" is running");
		
		synchronized (sharedQueue) {
			for(int i=0; i < sharedQueue.size(); i++) {
				System.out.println("Start consuming, element" +i);
				sharedQueue.poll();
			}
			sharedQueue.notify();
		}
	}
}
