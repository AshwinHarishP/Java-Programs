/* Program using recursion to check prime numbers


import java.util.*;
public class Prime_number {
    static boolean isPrime(int n, int i){
        if (n <= 2){
            return (n == 2) ? true : false;
        }

        if (n % i == 0) return false;

        if (i * i > n){
            return true;
        }

        return isPrime(n, i+1);


    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

    int n = input.nextInt();

    if(isPrime(n, 2)) System.out.println(n + " is a prime number");
    else System.out.println(n + " is not a prime number");

    input.close();
    }
}
*/

/*Program to check prime numbers using loop 

import java.util.*;

import javax.swing.InputMap;

class Prime_number{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        boolean flag = true;

        for (int i = 2; i <= n/2; i++){
            if (n % i == 0){
                flag = false;
                break;

            }
        }

        if (flag){
            System.out.println(n + " is a prime number");
        }
        else{
            System.out.println(n + " is not a prime number");
        }
        input.close();
    }
}
*/