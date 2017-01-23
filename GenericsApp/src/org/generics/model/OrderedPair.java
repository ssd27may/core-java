package org.generics.model;

public class OrderedPair<K, V> {

	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

}
