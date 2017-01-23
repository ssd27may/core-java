import java.io.Serializable;

public class Animal implements Serializable {

	// this UID is used to identify the serialised object class
	private static final long serialVersionUID = -2550197490762925042L;

	private String name;
	private String age;
	private int dateOfBirth;

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public Animal(String name, String age) {
		this.name = name;
		this.age = age;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
