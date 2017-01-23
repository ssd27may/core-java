import java.util.Collections;
import java.util.HashSet;


public class CollectionExamples2 {

    public static void main(String[] args) {

        // ***********************************************   find out the duplicate number in an array
        //without collection
        int[] num = {1,2,45,2,4,5,7,88,4,2,4,4,5};
        long startTime = System.nanoTime();
        for(int i=0;i<num.length;i++) {

            for(int j=i+1;j<num.length;j++){
                if(num[i] == num[j]){
                    System.out.println("Duplicate elem " +num[i]);
                    break;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("time taken without collection " +(endTime-startTime));
        
        
        //with collection
        startTime = System.nanoTime();
        HashSet<Integer> uniqueNums = new HashSet<>();
        for(int i=0;i<num.length;i++) {
            if(!uniqueNums.add(num[i])) {
                System.out.println("Duplitcate elem " +num[i]);
                continue;
            }
        }
        endTime = System.nanoTime();
        System.out.println("time taken with collection " +(endTime-startTime));
    }

}
