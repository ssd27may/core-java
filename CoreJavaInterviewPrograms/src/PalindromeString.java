import java.util.Scanner;

/**
 * Write code to check a String is palindrome or not? Reverse and get it same.
 * 
 * @author Sidhesh
 *
 */
public class PalindromeString {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        boolean isContinue;
        do {
            System.out.println("enter a string");
            String inputString = read.next();
            
//            // 1st ways using string buffer
//            StringBuffer inputStringBuffer = new StringBuffer(inputString);
//            String resultString = inputStringBuffer.reverse().toString();
//            if (inputString.equals(resultString)) {
//                System.out.println("The entered string is palindrome");
//            } else {
//                System.out.println("The entered string is not palindrome");
//            }
//            System.out.println("Do you want to continue? (Y/N)");
            
            String outputStr = "";
            // 2nd way
            for(int i = inputString.length()-1; i>=0; i--) {
                outputStr = outputStr+inputString.charAt(i);
            }
            if (inputString.equals(outputStr)) {
                System.out.println("The entered string is palindrome");
            } else {
                System.out.println("The entered string is not palindrome");
            }
            System.out.println("Do you want to continue? (Y/N)");
            
            isContinue = read.next().equals("Y") ? true : false;
        } while (isContinue);
        read.close();

    }
}
