public class ArrayExamples2 {

    public static void main(String[] args) {

        // largest and smallest number in the array
        int[] array = { 7, 6, 13, 23, 8, 99, -6 };
        int smallestElement = array[0];
        int lagestElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallestElement > array[i]) {
                smallestElement = array[i];
            }
            if (lagestElement < array[i]) {
                lagestElement = array[i];
            }
        }
        System.out.println("Smallest element" + smallestElement);
        System.out.println("Largest element" + lagestElement);
        
        // find top two max element
        int[] intArray = {4,88,1,3,109};
        int max1 = intArray[0];
        int max2 = intArray[0];
        

    }
}
