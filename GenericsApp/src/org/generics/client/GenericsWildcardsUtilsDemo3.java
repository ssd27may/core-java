package org.generics.client;

import java.util.ArrayList;
import java.util.List;

import org.generics.model.Animal;
import org.generics.model.Dog;
import org.generics.util.GenericsWildcardUtil;


public class GenericsWildcardsUtilsDemo3 {

	public static void main(String[] args) {
		
		List<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog());
		
		List<Animal> animals = new ArrayList<>();
		
		GenericsWildcardUtil.searchElement(dogs, new Dog());
		
		//below code will not work as type variable defers
		//GenericsWildcardUtil.searchElement(animals, new Dog());
		
		// in order to make above code work we can use Upper bounded wildcars
		GenericsWildcardUtil.searchElementWithUpperBoundWildcard(animals, new Animal());
		GenericsWildcardUtil.searchElementWithUpperBoundWildcard(dogs, new Animal());
		
		// lower bound example
		GenericsWildcardUtil.searchElementWithLowerBoundWildcard(animals, new Dog());
		GenericsWildcardUtil.searchElementWithLowerBoundWildcard(dogs, new Dog());
		//GenericsWildcardUtil.searchElementWithLowerBoundWildcard(dogs, new Animal());
		
	}
	
	
}
