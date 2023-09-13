// 12.2 13.7 15.3 17.2 18.1 it wants to implement a java program using an array to calculate the mean and median values of the resolution of the data.  
import java.util.*;
public class Mean_and_median {
    public static void main(String[] args) {
        double [] arr = {12.2, 13.7, 15.3, 17.2, 18.1};
        int Total = arr.length-1;
        double sum = 0;
        double median = 0;

        
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            
        }
        double Mean = Total / sum;

        System.out.println(String.format("Mean value: %.2f", Mean));

        Arrays.sort(arr);

        if (Total % 2 == 0 ){
            median = arr[Total/2];
        }
        else{
            median = (arr[Total / 2]) - (arr[Total-1 / 2]);
        }

        System.out.println("Median: "+ median);

    }
}
