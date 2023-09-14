import java.util.*;
public class Second_maximum_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Total elments to be added: ");
        int limit = input.nextInt();
        LinkedList<Integer> elements = new LinkedList<>();
        for (int i = 0; i < limit; i++){
            System.out.print("Enter Elements: ");
            int number = input.nextInt();
            elements.add(number);
        }
        Collections.sort(elements);
        System.out.println(elements.get(limit-2));
    }
}
