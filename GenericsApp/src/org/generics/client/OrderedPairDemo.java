package org.generics.client;

import org.generics.model.BoxGeneric;
import org.generics.model.OrderedPair;

public class OrderedPairDemo {

	public static void main(String[] args) {

		BoxGeneric<String> box = new BoxGeneric<>();
		box.setT("testing ordered pair");
		OrderedPair<Integer, BoxGeneric<String>> pair = new OrderedPair<Integer, BoxGeneric<String>>(1, box);
		System.out.println(pair.getKey());
		System.out.println(pair.getValue().getT());
		
	}

}
