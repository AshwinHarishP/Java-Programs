import java.util.Scanner;
public class Phone_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // For Mobile Number
        System.out.println("Enter a mobile number");
        Long Mobile_number = input.nextLong();
        System.out.println(String.format("Your mobile number: %d", Mobile_number));

        // For Aadhar Number
        System.out.println("Enter adhar number");
        Long Aadhar_number = input.nextLong();
        System.out.println(String.format("Your Aadhar Number: %d",Aadhar_number));

        input.close();
    }    
}
