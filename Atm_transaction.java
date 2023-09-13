import java.util.Scanner;

class Reserve_Bank_of_India{
    public static int Balance = 400000;
    public static int Fixed_deposit_amt = 20000;


    void user_details(long Acc_no, int Balance, int Fixed_deposit_amt){
        System.out.println("Your Account Number: " + Acc_no);
        System.out.println("Your Balance: " + Balance);
        System.out.println("Your Fixed deposit amount: " + Fixed_deposit_amt);
    }
}
class Sub_Branch extends Reserve_Bank_of_India{
    void deposit(long Acc_no, long amount){
        System.out.println("\nYour Account No: "+Acc_no);
        System.out.println("Enter Amount: "+amount);
        Reserve_Bank_of_India.Balance += amount;
        System.out.println("\nAmount deposited successfully");
        System.out.println("Your Balance: "+ Balance);

    }

    void Withdraw(long Acc_no, long amount){
        System.out.println("Enter Account No: "+Acc_no);
        System.out.println("Enter Amount: "+amount);
        Reserve_Bank_of_India.Balance -= amount;
        System.out.println("\nAmount Withdraw successfull");
        System.out.println("Your Balance: "+ Balance);

    }
}


public class Atm_transaction {
    public static void main(String[] args) {
        Sub_Branch obj = new Sub_Branch();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Acc No: ");
        int Acc_no = input.nextInt();

        System.out.println("Choose Operations \n1.Deposit\n2.Withdraw\n3.Details");
        int choice = input.nextInt();
        
        if (choice == 1){
            System.out.print("Enter Amount: ");
            long amount = input.nextLong();

            obj.deposit(Acc_no, amount);
        }

        else if (choice == 2){
            System.out.println("Enter Amount: ");
            long amount = input.nextLong();

            obj.Withdraw(Acc_no, amount);
        }

        else if (choice == 3){
            obj.user_details(Acc_no, Reserve_Bank_of_India.Balance, Reserve_Bank_of_India.Fixed_deposit_amt);
        }
        else{
            System.out.println("Invalid Choice");
        }

        input.close();

    }
}
