package com.queue.service;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.queue.threads.Consumer;
import com.queue.threads.Producer;

public class ProducerConsumerService {
	public static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

	public static void main(String[] args) {

		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);

		producerThread.start();
		consumerThread.start();

	}

}
