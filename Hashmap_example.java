import java.util.*;
public class Hashmap_example {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA","Washington");
        capitals.put("UK","London");
        capitals.put("INDIA","Tamil Nadu");
        capitals.put("Arabia","Dubai");
        capitals.put("Korea","Shitachi");

        for (String country: capitals.keySet()){
            String captial = capitals.get(country);
            System.out.println("Capital of "+country+": "+captial);
        }
    }
}
