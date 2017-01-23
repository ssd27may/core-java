import java.util.LinkedList;
import java.util.Queue;

import com.thread.Consumer;
import com.thread.Producer;


public class ProducerConsumerApp {

	public static void main(String[] args) {
		
		Queue<Integer> sharedQueue = new LinkedList<>();
		Producer producer = new Producer(sharedQueue, "Producer Thread");
		Consumer consumer = new Consumer(sharedQueue, "Consumer Thread");
		
		producer.start();
		consumer.start();
		
	}
}
