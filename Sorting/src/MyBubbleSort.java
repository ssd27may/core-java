
public class MyBubbleSort {
 // logic to sort the elements
    public static void bubble_srt(int array[]) {
        int count = 0;
        int n = array.length;
        int k;
        printNumbers(array);
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < m - 1; i++) {
                count = count+1;
                k = i + 1;
                
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
                printNumbers(array);
               
            }
//            printNumbers(array);
            
        }
        System.out.println(count);
    }
  
    private static void swapNumbers(int i, int j, int[] array) {
  
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
  
    private static void printNumbers(int[] input) {
          
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
  
    public static void main(String[] args) {
        int[] input = { 4, 2, 1};
        bubble_srt(input);
    }
}
