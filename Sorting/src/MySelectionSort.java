
public class MySelectionSort {

    public static void main(String[] args) {
        int[] input = { 4, 2, 1};
        sort(input);
        printNumbers(input);
    }
    
    private static void sort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            
            for(int j=i+1; j<arr.length; j++){
                
                if(arr[i] > arr[j]) {
                    swapNumbers(i, j, arr);
                }
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
