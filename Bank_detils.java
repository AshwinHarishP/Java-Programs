import java.io.CharConversionException;
import java.util.Scanner;
class RBI{
    int Acc_balance = 20000;
    int Loan_amt = 1000 ;
    void Balance(){
        System.out.println("Your Account Balance: "+ Acc_balance);

    }

    void Loans_amt(){
        System.out.println("Your Loan amt: " + Loan_amt);
    }

}

class Sub_branch extends RBI{
    void branch_name(){
        System.out.println("Your branch name: UBI");
    }

    void Withdraw(){
        System.out.println("Withdraw Successfull");

    }

    void Deposit(){
        System.out.println("Deposi Successfull");
    }

}

public class Bank_detils {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    Sub_branch obj = new Sub_branch();

    System.out.println("Enter your choice \n1.Bank Details: \n2.Check Loan Amount \n3.Withdraw \n4.Deposit");

    int choice = input.nextInt();

    if (choice == 1){
        obj.branch_name();
    }
    
    else if (choice == 2){
        obj.Balance();
    }

    else if (choice == 3){
        obj.Withdraw();
    }   
} 
}
