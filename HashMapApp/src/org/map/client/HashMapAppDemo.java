package org.map.client;

import java.util.HashMap;

import org.map.model.Country;

/**
 * Map to return continent name by name of country
 * 
 * When hashcode method is not overriden and equal method is overriden then all the elements of map will be stored in different buckets even if de r equal.
 * Retreaving elements will only work if the reference variable passed to get method is same as one used during put.
 * 
 * When hashcode method is overriden but equals method is not overriden then ideally duplicate objects will be put in the same bucket.
 * Here also retreaving will be done based on the reference variables.
 * 
 * @author Sidhesh
 *
 */
public class HashMapAppDemo {

	public static void main(String[] args) {

		Country au = new Country("Australia", 1093002);
		Country us = new Country("America", 1093002);
		Country uk = new Country("England", 5093002);
		Country uk2 = new Country("England", 5093002);

		HashMap<Country, String> countryMap = new HashMap<>();
		countryMap.put(us, "America");
		countryMap.put(au, "Australia");
		countryMap.put(uk, "Europe");
		countryMap.put(uk2, "Europe");
		
		// below code is very important in case of equals not overriden
		countryMap.put(uk2, "Europe1");
		countryMap.put(uk2, "Europe2");
		
		uk2.setPopulation(509);
		uk2.setName("England2");

		String countryName = countryMap.get(uk2);

		Country uk3 = new Country("England", 5093002);

		String countryName2 = countryMap.get(uk3);

		System.out.println("Size of the map " + countryMap.size());
		System.out.println(countryName);
		System.out.println(countryName2);

	}
}
