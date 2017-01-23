package com.thread;

import java.util.Queue;

public class Producer extends Thread {

	Queue<Integer> sharedQueue;

	public Producer(Queue<Integer> sharedQueue, String name) {
		super(name);
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		System.out.println("Producer threda running:");
		synchronized (sharedQueue) {
			for (int i = 0; i < 5; i++) {
				System.out.println("Producing element : "+i);
				sharedQueue.add(i);
			}
			System.out.println(sharedQueue.size());
			try {
				System.out.println("Producer waiting");
				sharedQueue.wait();
			} catch (InterruptedException e) {
			}
		}

	}
}
