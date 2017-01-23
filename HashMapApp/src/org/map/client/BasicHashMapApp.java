package org.map.client;

import java.util.HashMap;

public class BasicHashMapApp {

	public static void main(String[] args) {
		HashMap<String, Integer> empAge = new HashMap<>();
		
		String str = "Sidhesh";
		String str2 = new String("Ani");
		String str3 = "Ani";
		
		empAge.put(str, 27);
		empAge.put(str2, 32);
		
		str="ashish";
		
		System.out.println(empAge.get(str));
		System.out.println(empAge.get(str2));
		System.out.println(empAge.get("Ani"));
		System.out.println(empAge.get("Sidhesh"));
		
		System.out.println(str2 == str3);
		System.out.println(str2.equals(str3));
		
		
		
	}
}
