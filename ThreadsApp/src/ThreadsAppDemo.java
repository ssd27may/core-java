import com.thread.MyRunnable;
import com.thread.MyThread;


public class ThreadsAppDemo {

	public static void main(String[] args) {

		Thread t1 = new MyThread("t1");
		Thread t2 = new MyThread("t2");
		
		t1.start();
		
		// current thread will only execute once t1 is dead
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		
		MyRunnable runnable = new MyRunnable();
		
		Thread t3 = new Thread(runnable, "t3");
		t3.start();
		
		Thread t4 = new Thread(runnable, "t4");
		t4.start();
		
	}

}
