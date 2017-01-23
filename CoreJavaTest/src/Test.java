import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        printVarargs(1);
        printVarargs(1, 2);
        print("tRuE");
        print("false");
        Boolean booleanObj1 = new Boolean(true);
        Boolean booleanObj2 = new Boolean(false);
        Boolean booleanObj3 = new Boolean("false");
        Boolean booleanObj4 = new Boolean(booleanObj1);
        System.out.println(booleanObj1.equals(booleanObj4));
        System.out.println(booleanObj2 == booleanObj3);
        System.out.println(booleanObj1 == booleanObj4);
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(new Integer(1));
        ArrayList b = a;
        b.add(new Float(2));
        ArrayList<Float> c = (ArrayList<Float>)b;
        c.add(new Float(1.1));
        for (Object obj : b)
            System.out.println(obj);
    }

    static void printVarargs(Integer... integers) {
        System.out.println(integers.length);
    }

    public static void print(String str) {
        System.out.println(Boolean.valueOf(str) ? "true" : "false");
        }
    
}
