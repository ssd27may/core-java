import java.util.Scanner;

/**
 * Find all permutation of a string iterative and recursive way Eg. dog - dog,
 * dgo,god,gdo,
 * 
 * @author Sidhesh
 *
 */
public class StringPermutations {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString = read.next();

//        // 1st iterative way
//        String resultString = "";
//        char[] inputCharArray = inputString.toCharArray();
//        for (int i = 0; i < inputCharArray.length; i++) {
//            resultString = "";
//            for (int j = 0; j < inputCharArray.length; j++) {
//                resultString = resultString + inputCharArray[j];
//            }
//            System.out.println(resultString);
//        }
        
        // 2nd permutation
        permutation("",inputString);       
        
        read.close();

    }
    
    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
}
