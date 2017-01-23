import java.util.Scanner;

/**
 * Program to check if a number if power of a number like power of 2 is 2, 4, 6,
 * 16
 * 
 * @author Sidhesh
 *
 */
public class PowerOfNumber {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter a nuber");
        int inputNumber = read.nextInt();

        int power = 2;
        boolean isPower = false;

        while (inputNumber > power) {
            power = power * 2;
            if (power == inputNumber) {
                System.out.println("The input number " + inputNumber + " is power of 2");
                isPower = true;
            }
        }
        if (!isPower) {
            System.out.println("The input number " + inputNumber + " is not power of 2");
        }
        read.close();

    }

}
