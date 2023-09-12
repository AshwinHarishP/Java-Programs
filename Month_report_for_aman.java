import java.util.Scanner;
public class Month_report_for_aman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Royality amount: ");
        int Royality = input.nextInt();

        System.out.print("Enter Machineary maintenance amount: ");
        int Machineary_maintenance = input.nextInt();
        
        System.out.print("Enter Sales commission amount: ");
        int Sales_commission = input.nextInt();
        
        System.out.print("Enter Fixed deposit amount: ");
        int Fixed_deposit = input.nextInt();
        
        System.out.print("Enter Maintenance amount: ");
        int Maintenance = input.nextInt();
        
        System.out.print("Enter Property tax amount: ");
        int Property_tax = input.nextInt();
        
        System.out.print("Enter Bonus amount: ");
        int Bonus = input.nextInt();
        
        System.out.print("Enter Gratuity amount: ");
        int Gratuity = input.nextInt();

        float profit  = Royality + Sales_commission + Fixed_deposit + Bonus + Gratuity;
        float expenses = Machineary_maintenance + Maintenance + Property_tax;
        
        float money_he_had = profit - expenses;

        if (money_he_had < 0){
            System.out.println("He is going through an loss: " + money_he_had);
        }
        else{
            System.out.println("He is going through an profit: " + money_he_had);
        }
        input.close();
    }
}
