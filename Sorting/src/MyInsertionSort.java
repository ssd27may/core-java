
public class MyInsertionSort {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        
        for(int i=1;i<arr.length;i++) {
            for(int j=i; j>0;j--) {
                if(arr[j] < arr[j-1]) {
                    swapNumbers(j, j-1, arr);
                }
                printNumbers(arr);
            }
        }
        
    }
    
    private static void swapNumbers(int i, int j, int[] arr) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
       
    }
    
    private static void printNumbers(int[] input) {
        
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
}
