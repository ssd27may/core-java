package com.thread;

public class FooRunnable implements Runnable {

	Foo foo = new Foo();

	@Override
	public void run() {
		foo.display();
	}

}
