import java.util.*;

public class Power_array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,8,9};

        for (int i = 0; i < arr.length; i++){
           arr[i] = arr[i] * arr[i];
          
        }
        

        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
}
