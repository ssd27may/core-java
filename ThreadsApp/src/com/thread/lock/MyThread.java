package com.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

	private int count = 0;
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {

		try {
			lock.lock();
			count++;
			Thread.currentThread().sleep(10000);
			System.out.println("Current thread"
					+ Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}

	}
}
