import java.util.Scanner;
public class Signed_and_unsigned {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String digits = input.next();
            if (digits.charAt(0) == '-'){
                System.out.println("Signed Integer");
            }
            else if(digits.charAt(0) == '0'){
                System.out.println("Neutral");
            }
            else{
                System.out.println("Unsigned Integer");
            }
            input.close();

        }
}
