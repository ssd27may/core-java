import com.thread.FooRunnable;

public class FooThreadApp {

	public static void main(String[] args) {

		FooRunnable runnable1 = new FooRunnable();
		FooRunnable runnable2 = new FooRunnable();
		Thread thread1 = new Thread(runnable1, "Foo Thread1");
		Thread thread2 = new Thread(runnable1, "Foo Thread2");
		Thread thread3 = new Thread(runnable2, "Foo Thread3");

		thread1.start();
		thread2.start();
		thread3.start();

	}

}
