import java.util.*;

import javax.naming.spi.DirStateFactory;

public class Number_exponential {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        ArrayList<Integer> divisible_array = new ArrayList<>();  
        int base_value = 0 ;      

        // checking if the number is prime or not

        boolean flag = false;
        for (int i = 2; i <= number / 2; i++) {
            // condition for nonprime number
            if (number % i == 0) {
                flag = true;
                break;
            }
        }

        // Check if it's a prime number and print accordingly
        if (!flag && number > 1) {
            System.out.println("(" + number + ", 1)");
        } 
        
        
        
        else {
            for (int i = 2; i < 11; i++){
                if (number % i == 0){
                    divisible_array.add(i);
                }
            }

            for (int i = 0; i < divisible_array.size(); i ++){
                for (int j = 0; j < 10; j++){
                    if (Math.pow(divisible_array.get(i),j) > number){
                        base_value = j-1;
                        System.out.println(base_value);
                    }
                }
            }
        }

    }
}
