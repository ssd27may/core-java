public class JavaPassByReferece {

    public static void main(String[] args) {
        String str = "sidhesh";
        System.out.println("before: " + str);
        System.out.println("after: " + str);

    }

    public static String changeValue(String str) {
        str = "rohan";
        return str;
    }

}
