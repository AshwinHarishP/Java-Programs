import java.util.Scanner;

public class Jack_and_Jill {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenny = 0;
        int jack = 0;
        String sentence = input.nextLine();
        sentence = sentence.replace(" ", "");
        char[] elements = {'a','e','i','o','u','A','E','I','O','U'};


        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            
            boolean value = false;
            for (char j:elements){
                if (ch == j){
                    value = true;
                    break;
                }
            }

            if (value) jenny += 1;
            else jack += 1;
    }
    System.out.println(String.format("Jenny has %d vowels", jenny));
    System.out.println(String.format("Jack has %d vowels", jack));
    input.close();
}
}