import java.util.Date;

/**
 * Overloading/overriding example Overload - can overload any method including
 * static 
 * Overload means you can name another method with some existing method
 * name in the same class. Need to change the params 
 * Overrride means you provide or change implementation of the method with same name and arguments in the
 * superclass.
 * Override - no of params and it datatypes should not change.
 * Override - modifier should not be more restrictive.
 * 
 * @author Sidhesh
 *
 */
public class Animal {

	// overloading static method.
	// Static method in base class which will be hidden in subclass
	public static void display() {
		System.out.println("Static or class method from Base");
	}

	// Static method in base class which will be hidden in subclass
	public static void display(int i) {
		System.out.println("Static or class method from Base");
	}

	// Non-static method which will be overridden in derived class
	public void print() {
		System.out.println("Non-static or Instance method from Base");
	}

	public static final void run() {
		System.out.println("Class Animal is running");
	}

	public void run(int i) {
		System.out.println("Animal is running at speed" + i);
	}
	
	public void printNum(String num) {
	    
	}

	public void printNum(Date date) {
	    
	}
}
