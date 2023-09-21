// Input = abc12Abc2
import java.util.*;

public class Encrypt_and_decrypt {

    // Method for encodeing
    public static String encode(String string){

        StringBuilder digits = new StringBuilder();

        StringBuilder new_string = new StringBuilder();

        // Extracting all digits   
            // -> digits = [1,2,2]
            // -> new_string = abc00Abc0
        for (int i = 0; i < string.length(); i++){
            if(Character.isDigit(string.charAt(i))){
                digits.append(String.valueOf(string.charAt(i)));

                new_string.append("0");
            }
            else{
                new_string.append(string.charAt(i));
            }
        }

        // Appending digits to the string
            // new_string = 221abc00Abc0
        digits.reverse();
        new_string = digits.append(new_string);
        
        // Swapping elements
            // 221abc00bAc0
        
        StringBuilder encoded_string = new StringBuilder();
        int i = 0;

        while(i < new_string.length()){
            if(Character.isUpperCase(new_string.charAt(i))){
                encoded_string.append(new_string.charAt(i+1));
                encoded_string.append((new_string.charAt(i)));
                encoded_string.append("*");
                i += 2;
            }
            else{
                encoded_string.append(new_string.charAt(i));
                i += 1;
            }
        }
        return encoded_string.toString();
    }

    //Method for decoding

    public static String decode(String string) {
        StringBuilder new_string = new StringBuilder();
    
        // Removing * and swapping upper and lower case
        int i = string.length() - 1;
        while (i >= 0) {
            if (Character.isUpperCase(string.charAt(i))) {
                new_string.append(string.charAt(i - 1));
                new_string.append(string.charAt(i));
                i -= 2;
            } else if (string.charAt(i) == '*') {
                i -= 1;
            } else {
                new_string.append(string.charAt(i));
                i -= 1;
            }
        }
        new_string.reverse();
    
        // Extracting Digits
        StringBuilder digits = new StringBuilder();
    
        for (int j = 0; j < new_string.length(); j++) {
            if (Character.isDigit(new_string.charAt(j))) {
                digits.append(new_string.charAt(j));
            } else {
                break;
            }
        }
        digits.reverse();
    
        // Decoding string
        int k = 0; // index for the first element of digit list
        StringBuilder decoded_string = new StringBuilder();
    
        for (int j = digits.length(); j < new_string.length(); j++){
            if (new_string.charAt(j) == '0'){
                decoded_string.append(digits.charAt(k));
                k += 1;
            }
            else{
                decoded_string.append(new_string.charAt(j));
            }
        }
        System.out.println(decoded_string);
        return " ";
    }
    
    



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String string = input.nextLine();

        System.out.print("1.Encode\n2.Decode\n");
        int choice = input.nextInt();

        if (choice == 1){
            String encode_value = encode(string);
            System.out.println(encode_value);
        }
        
        else{
        String decode_value = decode(string);
        System.out.println(decode_value);
        }
        input.close();
    }
}
