import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializeOutputDemo {

	public static void main(String[] args) {
		// deserialize the object
		try {
			ObjectInputStream input = new ObjectInputStream(
					new FileInputStream("tmp/Animal.ser"));
			//Animal animalOutput = (Animal) input.readObject();
			Person out = (Person) input.readObject();
			input.close();
			System.out.println(out.getName());
			System.out.println(out.getAge());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
