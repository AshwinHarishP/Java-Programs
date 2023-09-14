import java.util.*;
public class Linked_hashset_example {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("fiction");
        set.add("fantasy");
        set.add("spiritual");
        set.add("arts");

        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }    
}
