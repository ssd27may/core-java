import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringExamples {

    public static void main(String[] args) {

        // How to find first non repeated character of a given String?
        // How to count occurrence of a given character in a String

        Scanner read = new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString = read.next();
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        char[] inputChar = inputString.toCharArray();
        for (int i = 0; i < inputString.length(); i++) {
            if (charCount.get(inputString.charAt(i)) == null) {
                charCount.put(inputString.charAt(i), 1);
            } else {
                int count = charCount.get(inputString.charAt(i));
                charCount.put(inputString.charAt(i), count + 1);
            }
        }

        Set<Character> mapKeys = charCount.keySet();
        for (Character key : mapKeys) {
            if (charCount.get(key) == 1) {
                System.out.println("First non repeated character is : " + key);
                break;
            }
        }

        read.close();
    }
}
