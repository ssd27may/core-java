import java.util.Scanner;

/**
 * Check if a number is palindrome or not
 * 
 * @author Sidhesh
 *
 */
public class NumberPalindrome {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a nuber");
        int inputNumber = read.nextInt();

        int reverse = 0;

        while (inputNumber != 0) {
            reverse = reverse * 10 + inputNumber % 10;
            inputNumber = inputNumber / 10;

        }

        if (reverse == inputNumber) {
            System.out.println("the number is palindrom");
        } else {
            System.out.println("the number is not palindrom");
        }

        read.close();
    }
}
