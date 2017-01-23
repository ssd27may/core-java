package org.generics.util;

import java.util.Collection;

public class GenericsWildcardUtil {

	public static <T> void addToCollections(Collection<? super T> t, T item) {
		t.add(item);
	}
	
	// below method wont work
	public static <T> void addToCollections2(Collection<? extends T> t, T item) {
		//t.add(item);
	}
	
	public static <T> T searchElement(Collection<T> coll, T itemToSearc) {
		boolean hasElement = coll.contains(itemToSearc);
		if(hasElement)
			return itemToSearc;
		else
			return null;
	}
	
	public static <T> T searchElementWithUpperBoundWildcard(Collection<? extends T> coll, T itemToSearc) {
		boolean hasElement = coll.contains(itemToSearc);
		if(hasElement)
			return itemToSearc;
		else
			return null;
	}
	
	public static <T> T searchElementWithLowerBoundWildcard(Collection<? super T> coll, T itemToSearc) {
		boolean hasElement = coll.contains(itemToSearc);
		if(hasElement)
			return itemToSearc;
		else
			return null;
	}
	
}
