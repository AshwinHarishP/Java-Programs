/*

Create a class called voting , done
create 2 data members - voter’s name and voter’s Id . done
Create 2 methods – castvote() or withdraw casting() , done
create main class containing main function. done
Create object v1 for class Voting   done
call castvote method and withdraw method. 
Get person name and person id 
Print the values 
Capture two or three voters*/

import java.util.*;
import java.util.jar.Attributes.Name;

class Voting{
    String Name;
    int Id;

    Voting(String Name, int Id){
        this.Name = Name;
        this.Id = Id;
    }
    
    void castvote(){
        System.out.println(Name + " Voted Successfull");
    }

    void withdraw(){
        System.out.println(Name + " Withdraw Successfull");
    }

}





class Vote{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String Name = input.nextLine();
        System.out.print("Enter Your Voter Id: ");

        int Id = input.nextInt();
        Voting v1 = new Voting(Name,Id);
        System.out.print("Enter Your choic\n1.Vote\n2.Withdraw\n");
        int option = input.nextInt();

        if (option == 1){
            v1.castvote();
        }
        
        if (option == 2){
            v1.withdraw();
        }
        

    }
}