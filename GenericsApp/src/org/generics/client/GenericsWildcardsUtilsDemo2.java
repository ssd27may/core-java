package org.generics.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.generics.model.Animal;
import org.generics.model.Cat;
import org.generics.model.Dog;
import org.generics.util.GenericsWildcardUtil;

class A { }
class B extends A { }
class C extends B { }

public class GenericsWildcardsUtilsDemo2 {

	public static void main(String[] args) {
		
		List<? super A> list1 = new ArrayList<A>();
        list1.add(new A());//valid. ok
        list1.add(new B());//valid, why? it is not super to A?
        list1.add(new C());//valid, why? it is not super to A?

        List<? super B> list2 = new ArrayList<A>();
        //list2.add(new A());//not valid. why? it is also super to B!!!
        list2.add(new B());
        list2.add(new C());

        List<? super C> list3 = new ArrayList<C>();
//        list3.add(new A());//not valid, why? It is super to A so should be valid!!!
//        list3.add(new B());//not valid, why? It is super to A so should be valid!!!
        list3.add(new C());
						
        // =-----------------------------------------------------------------
        // Answer : -


//"? super T" means any class you can add that must be an instance of T or its sub class.
//So List<? super C> list3 = new ArrayList<C>(); in the list3 either you can add instance of class C 
//or its sub class instances (SomeClass extends C).
//A parent object list can have its own, child and child of child but a List that has created for a child class 
//can not have its parent object. Hope you are clear now.

	}
	
	
}
