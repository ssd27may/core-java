public class AnimalDemo {

	public static void main(String[] args) {

		// below are the good examples

		// below example will compile fine but result into run time error
		// Animal animal = new Animal();
		// Cat cat = (Cat) animal;
		// cat.run();

		Animal animal2 = new Animal();
		Cat cat2 = (Cat) animal2;
		cat2.run();

	}

}
