package com.thread.lock;

public class LockingDemo {

	public static void main(String[] args) {

		Thread threadLock1 = new MyThread();
		threadLock1.setName("Locking thread 1");
		Thread threadLock2 = new MyThread();
		threadLock2.setName("Locking thread 2");
		Thread threadLock3 = new MyThread();
		threadLock3.setName("Locking thread 3");
		Thread threadLock4 = new MyThread();
		threadLock4.setName("Locking thread 4");

		threadLock1.start();
		threadLock2.start();
		threadLock3.start();
		threadLock4.start();

	}

}
