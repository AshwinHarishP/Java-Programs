import java.util.*;
public class Minimum_and_maximum_difference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int [] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = input.nextInt();
        }

        // Maximum element
        
        Arrays.sort(arr);
        int maximum = abs(arr[N-1] - arr[0]); 

        // Minimum element
        
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < N-1 ; i++){
            minimum = Math.min(minimum ,(arr[i] - arr[i+1]));
        }

        System.out.println("Minimum value: "+minimum);
        System.out.println("Maximum value: "+maximum);
    }
}
