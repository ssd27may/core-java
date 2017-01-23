import java.util.HashMap;
import java.util.Map;


public class HashCodeDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "sidhesh");
		Employee e5 = new Employee(1, "sidhesh");
		Employee e2 = new Employee(2, "ajit");
		Employee e3 = new Employee(3, "roy");
		Employee e4 = new Employee(4, "rohan");
		
		Map<Employee, String> map = new HashMap<>();
		map.put(e1, "PSL");
		map.put(e2, "TCS");
		map.put(e3, "Zensar");
		map.put(e4, "Cogni");
		map.put(e5, "PSL");
		
		System.out.println(map.size());
		System.out.println(map.get(new Employee(1, "sidhesh")));
		
		String str = "test";
		String str2 = "test";
		System.out.println(str.equals(str2));
		System.out.println(str == str2);
	}
}

