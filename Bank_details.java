import java.util.Scanner;
class Bank_details{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float Account_balance = 200000f;
        
        System.out.println("1. Check Balance \n2. Fund Transfer \n3. Check Interest \n4. Deposit \n5. Withdraw ");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        if (choice == 1){
            System.out.println("Your Accout Balance: "+ Account_balance);
        }
    
        else if (choice == 2){

            System.out.print("Enter fund transfer Ammount: ");
            float fund_transfer = input.nextFloat();
            
            System.out.println("Enter Back Account Number: ");
            long acc_no = input.nextLong();

            Account_balance -= fund_transfer;
            System.out.println("\nFund transfer successful!");
        }

        else if (choice == 3){
            System.out.print("Enter Loan Ammount: ");
            float loan_amount = input.nextFloat();

            System.out.print("Enter Interset: ");
            float interset = input.nextFloat();

            System.out.println("Enter the duration: ");
            float months = input.nextFloat();


            float Simple_interest = (loan_amount * (interset/10) * months)/ 12;
            System.out.println(String.format("Your Interset amount: %.2f", Simple_interest));
        }
        
        else if (choice == 4){
            System.out.print("Enter amount to deposit: ");
            float deposit = input.nextFloat();
            
            Account_balance +=deposit ;
            System.out.println("\nFund deposit successful!");

        }
        
        else if (choice == 5){
            System.out.println("Enter amount to withdraw: ");
            float withdraw = input.nextFloat();
            
            Account_balance -=withdraw ;
            System.out.println("\nFund withdraw successful!");
        }

    input.close();
    }
}