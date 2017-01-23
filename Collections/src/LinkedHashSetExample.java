import java.util.LinkedHashSet;


public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<String> empNames = new LinkedHashSet<>();
		empNames.add("Sidhesh");
		empNames.remove("xyz");
		
		System.out.println(empNames);
	}
}
