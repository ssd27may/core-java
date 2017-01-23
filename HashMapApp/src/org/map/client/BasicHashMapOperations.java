package org.map.client;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.map.model.Country;

public class BasicHashMapOperations {
 
	public static void main(String[] args) {
		
		// adding and removing elements from hashmap
		Country au = new Country("Australia", 1093002);
		Country us = new Country("America", 1093002);
		Country uk = new Country("England", 5093002);

		HashMap<Country, String> countryMap = new HashMap<>();
		countryMap.put(us, "America");
		countryMap.put(au, "Australia");
		countryMap.put(uk, "Europe");

		countryMap.remove(uk);
		
		System.out.println(countryMap.size());
		
		// iterating through hash map
		Set<Country> countryKeys = countryMap.keySet();
		Iterator<Country> countryIter = countryKeys.iterator();
		
		while (countryIter.hasNext()) {
			System.out.println(countryMap.get(countryIter.next()));
		}
		
		Set<Entry<Country, String>> countrySet = countryMap.entrySet();
		for(Entry entry : countrySet){
			entry.getKey();
		}
		
		
		
	}
}
