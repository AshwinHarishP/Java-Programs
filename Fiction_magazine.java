// Code for capturing the detais of a fiction magazine 
// Properties: name, date, price, Author
// Methods: Buy & Sell, Customer details
import java.util.Scanner;
class Details{
    String name;
    String date;
    int price;
    String Author;

    void Buy(){
        System.out.println("The book purhased Successfully");
    }

    void Sell(){
        System.out.println("The Selled Successfully");
    }

    void Author_details(){
        System.out.println("Author name: Shakesphere");
        System.out.println("No of books published: 128");
        System.out.println("Other editions: 36 new editions");
    }

}
public class Fiction_magazine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        Details obj = new Details();
        obj.name = "Shakesphere";
        obj.price = 100;
        obj.date = "13-09-2023";
        obj.Author = "Shakesphere";

        System.out.println("Enter your choice: \n 1.Sell\n 2.Buy \n 3.Author Details: ");
        int choice = input.nextInt();

        

        System.out.println(obj.name);
        System.out.println(obj.price);
        System.out.println(obj.date);
        System.out.println(obj.Author);

        

        if (choice == 1) {
            obj.Buy();
        }
        else if (choice == 2){
            obj.Sell();
        }
        else if (choice == 3){
        obj.Author_details();
        }
        else{
            System.out.println("Enter valid choice");
        }
    }
}