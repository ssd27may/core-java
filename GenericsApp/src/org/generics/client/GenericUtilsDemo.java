package org.generics.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.generics.model.Animal;
import org.generics.model.Dog;
import org.generics.util.GenericsUtil;

public class GenericUtilsDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("test");
		GenericsUtil.addItemIntoCollection(list, "test2");
		for(String str : list){
			System.out.println(str);
		}
		
		// search a element
		List<String> list2 = new ArrayList<>();
		list2.add("test");
		boolean flag = GenericsUtil.isContains(list2, "test");
		System.out.println(flag);
		
		// generic method to find an element from a list
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		boolean flag2 = GenericsUtil.isContainsGeneric(intList, 1);
		System.out.println(flag2);
		
		// save element from array to collections
		Integer[] intArr = new Integer[10];
		Float[] fArr = new Float[10];
		String[] strArr = new String[10];
		Number[] numArr = new Number[10];
		
		Collection<String> strColl = new ArrayList<>();
		Collection<Integer> intColl = new ArrayList<>();
		Collection<Float> floatColl = new ArrayList<>();
		Collection<Number> numColl = new ArrayList<>();
		
		GenericsUtil.fromArrayToCollection(intArr, intColl);
		//GenericsUtil.fromArrayToCollection(fArr, intColl);
		GenericsUtil.fromArrayToCollection(strArr, strColl);
		GenericsUtil.fromArrayToCollection(intArr, numColl);
		
		List<Integer> numList = new ArrayList<Integer>();
		addAll(numList);
		
		List<Dog> dogList = new ArrayList<Dog>();
		dogList.add(new Dog());
		addAnimal(dogList);
			
		Animal[] animalArray = new Animal[3];
		animalArray[0]= new Dog();
	}
	
	private static void addAll(List list) {
	 list.add(new String("Adding a string object"));   
	}
	
	private static void addAnimal(List<? extends Animal> animalList) {
	    
	} 
	
}
