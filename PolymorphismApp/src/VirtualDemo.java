
public class VirtualDemo {

	public static void main(String [] args)
	   {
	      Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
	      Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
	      System.out.println("Call mailCheck using Salary reference --");
	      s.mailCheck();
	      System.out.println("\n Call mailCheck using Employee reference--");
	      e.mailCheck();
	      
	      // testing type casting
	      // it throws class cast exception
	      Employee e1 = new Employee("John Adams", "Boston, MA", 2);
	      Salary s1 = (Salary) e1;
	      s1.displayName();
	      Object o = new Object();
	      // this is upcasting no need to explicit casting
	      o = e;
	      // this is downcasting need explicit casting
	      e = (Employee) o;
	      
	      int a = 9;
	      byte b = 3;
	      
	      // upcasting
	      a = b;
	      
	      //downcasting so need explicit casting
	      b = (byte)a;
	      
//	      String str2 = "testing casting";
//	      char cha2 = 'd';
//	      cha2 = (char) str2;
	      
//	      a = str2;
	      
	      
	    }
}
