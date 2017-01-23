import java.util.Scanner;

/*
 * Remove any character from a string
 */
public class RemoveCharFromString {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString = read.nextLine();
        
        System.out.println("Enter a character to be removed");
        char charToRemove =  read.next().charAt(0);
        
        String resultString = "";
        for(int i = 0; i < inputString.length(); i++) {
            if(inputString.charAt(i) != charToRemove) {
                resultString = resultString + inputString.charAt(i);
            }
        }
        System.out.println("Final String is : " + resultString);
        read.close();
        
    }
}
