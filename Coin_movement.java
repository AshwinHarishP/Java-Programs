import java.util.Scanner;
class Coin_movement{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String coin = input.nextLine();
        if (coin.equals("King")){
            System.out.println("King is in the left to Queen");
        } 
        else if (coin.equals("Queen")){
            System.out.println("Queen is in the right to king");
        }
        else if (coin.equals("Pond")){
            System.out.println("Pond is in the top");
        }
        else if (coin.equals("Bishop")){
            System.out.println("Bishop is next to the king");
        }    
        else if (coin.equals("Elephant")){
            System.out.println("Elephant is at the end");
     
     input.close();   }
    }
}
