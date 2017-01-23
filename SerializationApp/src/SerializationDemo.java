import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		//Animal animal = new Animal("Cat", "10");
		Person person = new Person();
		person.setName("Sidhesh");

		// serialize the object
		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream("tmp/Animal.ser"));
			out.writeObject(person);
			out.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
