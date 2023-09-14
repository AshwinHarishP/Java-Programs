import java.util.*;
class Electronic_items{
    public static void main(String[] args) {
        ArrayList<String> electronicItems = new ArrayList<>();
        electronicItems.add("Keyboard");
        electronicItems.add("Laptop");
        electronicItems.add("Mouse");
        electronicItems.add("PC");
        electronicItems.add("Headset");

        for(String items: electronicItems ){
            System.out.println(items);
        }

    }
}
