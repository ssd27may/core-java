package org.generics.util;

import java.util.Collection;
import java.util.List;

public class GenericsUtil {

	public static void addItemIntoCollection(List<String> list, String str) {
		list.add(str);
	}

	public static <T> void addItemIntoCollectionWithGeneric(List<T> list, T t) {
		list.add(t);
	}

	public static boolean isContains(List<String> list, String searchElem) {
		return list.contains(searchElem);
	}

	// we need to specify the type parameter name in angle bracket
	// between modifier and return type
	public static <Item> boolean isContainsGeneric(List<Item> list, Item item) {
		return list.contains(item);
	}

	public static <T> void fromArrayToCollection(T[] a, Collection<T> c) {

	}

	/**
	 * Exchange position in array
	 * 
	 * @param array
	 * @param i
	 * @param j
	 */
	public static <T> void exchangeElementsInArray(T[] arr, int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
