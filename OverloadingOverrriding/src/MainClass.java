public class MainClass {

	public static void main(String[] args) {
		Animal obj1 = new Cat();

		// As per overriding rules this should call to class Derive's static
		// overridden method. Since static method can not be overridden, it
		// calls Base's display()
		obj1.display();

		Cat cat = new Cat();
		cat.display();

		// Here overriding works and Derive's print() is called
		obj1.print();
		
		
//		obj1.printNum(null);
	}
}
