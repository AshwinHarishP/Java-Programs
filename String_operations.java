import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        System.out.println("\nReplacing first letter as a capital");
        System.out.println(string.substring(0, 1).toUpperCase() + string.substring(1));
        String new_string = "";

        for (int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            Pattern pattern = Pattern.compile("[aeiouAEIOU]");
            Matcher matcher = pattern.matcher(String.valueOf(ch));
            if (!matcher.matches()){
                new_string += ch;
            }
        }
        System.out.println("\nRemoving vowels in a string");
        System.out.println(new_string);

        System.out.println("\nReversing alternate character in a string ");

        String reversed_string = "";
        int i = string.length()-1;

        while (i >= 0){
            reversed_string += string.charAt(i);
            i -= 2;
        }

        System.out.println(reversed_string);
        System.out.println("\nReplacing all special characters instead of vowels");

        String special_character = "";
        for (int j = 0; j < string.length(); j++){
            char ch = string.charAt(j);
            Pattern pattern = Pattern.compile("[aeiouAEIOU]");
            Matcher matcher = pattern.matcher(String.valueOf(ch));
            if (matcher.matches()){
                special_character += "~";
            }
            else{
                special_character += ch;
            }
        }
        System.out.println(special_character);

        }

    }   
