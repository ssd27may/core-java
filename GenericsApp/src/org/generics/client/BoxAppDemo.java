package org.generics.client;

import org.generics.model.Box;
import org.generics.model.BoxGeneric;

public class BoxAppDemo {

	public static void main(String[] args) {
		
		Box box = new Box();
		box.setObject("StringObject");
		
		// u need to typecast it always
		String returnObj = (String) box.getObject();
		System.out.println(returnObj);
		
		// generic box example
		BoxGeneric<Integer> genericBox = new BoxGeneric<>();
		genericBox.setT(12);
		
		int returnIntValue = genericBox.getT();
		System.out.println(returnIntValue);
		
		BoxGeneric<String> genericBox2 = new BoxGeneric<>();
		genericBox2.setT("StringObject");
		
		System.out.println(genericBox2.getT());
		
	}

}
