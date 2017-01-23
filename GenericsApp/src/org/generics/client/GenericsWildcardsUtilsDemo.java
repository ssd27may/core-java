package org.generics.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.generics.model.Animal;
import org.generics.model.Cat;
import org.generics.model.Dog;
import org.generics.util.GenericsWildcardUtil;

public class GenericsWildcardsUtilsDemo {

	public static void main(String[] args) {
		
		List<Animal> animals  = new ArrayList<>();
		List<Dog> dogs = new ArrayList<>();
		animals.add(new Dog());
		
//		List<? extends Animal> animal = new ArrayList<Dog>();
//		animal.add(new Object());
		
		// not possible inheritance not allowed in generics.
		//animals = dogs;
				
//		List<? extends A> list means to this list you can assign any list which is of type A or subtype of A
//		But when u add elements element should be of type A or supertype of A
//		Simmillary for <? super of A>

		//-------------------- VERY IMPORTANT -------------------------------
//		 "? super T" means any class you can add that must be an instance of T or its sub class.
//		 So List<? super C> list3 = new ArrayList<C>(); in the list3 either you can add instance of class C 
//		 or its sub class instances (SomeClass extends C).
//		 A parent object list can have its own, child and child of child but
//		 a List that has created for a child class can not have its parent object. Hope you are clear now.
		//http://stackoverflow.com/questions/14116650/generics-lower-bound-super-issue
		 
		// ------------------------------------------------------------------
		// UPPER BOUNDED WILDCARDS
		// upper wildcard means u can add a list to this ref only of its subtype
		// i.e. list of animal or it subtype list of dog or cat
		// since u can have list of dog u cannot add even animal object here as below
		// becoz extends means it can be cat or dog list so u are not sure which one
		// hence u cannot even add animal object to it
		List<? extends Animal> animals2 = dogs;
		animals2 = animals;
		animals2 = dogs; 
		//animals2.add(new Animal());
		//animals2.add(new Dog());
		//animals2.add(new Object());
		Animal animal6 = animals2.get(0);
		// below code will not work as everything stored in animals2 is considered as animal
		//Dog dog6 = animals2.get(0);
			
		// ------------------------------------------------------------------
		// LOWER BOUNDED WILDCARDS
		// lower bound means u can assign a list which is super of Animal
		// so in this case for animal reference you can gurantee that u can assign
		// only animal list to the animal3 reference, like below. Assign in dog list will give error
		// animal3 = new ArrayList<Animal>();
		// animal3 = new ArrayList<Dog>();
		// So since you can only assign animal list you can add dog and cat objects to it since
		// dog and cat are subclasses of animal
		List<? super Animal> animal3 = new ArrayList<>();
		animal3 = new ArrayList<Animal>();
		animal3 = animals;
		//cannot add dog since only super of animal is required.
		//animal3 = dogs;
		animal3.add(new Animal());
		animal3.add(new Dog());
	    // i dont knw y below code is not working ideally it shd work
		//animal3.add(new Object());
		// below code vl fails as u cant guarantee object vl be of animal type.
		//Animal animal8 = animal3.get(0);
		
		// get the data
		Object obj7 = animal3.get(0);
		//below code will not work... reason similar
		//Animal animal7 = animal3.get(0);
		
		
		List<?> animals4 = new ArrayList<String>();
		// cannot add anything into list of unknown type
		//animals4.add("test");
		
		List<? super Dog> animals5 = new ArrayList<Animal>();
		animals5.add(new Dog());
		// so animal5 list can assing to list of animal or list of dog
		// however we cannot add a animal object to it becoz this animal object can essentially be a cat
		//animals5.add(new Animal());
		
		List<? extends Animal> animals6 = new ArrayList<>();
		// cannot add dog here even though its anything extends animal
		//animals6.add(new Dog());
		animals6 = dogs;
		
		GenericsWildcardUtil.addToCollections(animals,new Dog());
						
	}
	
	
}
