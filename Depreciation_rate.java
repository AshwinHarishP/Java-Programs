import java.util.Scanner;
public class Depreciation_rate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        int purchase_amt = input.nextInt();
        System.out.print("Enter No.Of.Years: ");
        int years = input.nextInt();
        System.out.print("Enter scarp value: ");
        int scrap_value = input.nextInt();

        int depreciatable_amount = purchase_amt - scrap_value;
        int depreciatable_rate = depreciatable_amount/years;
        
        System.out.println(depreciatable_rate);
        input.close();
    }
}
