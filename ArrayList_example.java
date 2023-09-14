import java.util.*;
public class ArrayList_example {
    public static void main(String[] args) {
        ArrayList<String>fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Bannana");
        fruits.add("Mango");
        fruits.add("Grapes");

        System.out.println("Fruits in the list: ");
        for (String fruit: fruits){
            System.out.println(fruit);
        }

    }
}
