import java.util.Scanner;
public class Opposite_lanes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Mr.B Door No: ");
        int Mr_B = input.nextInt();

        System.out.print("Enter Mr.U Door No: ");
        int Mr_U = input.nextInt();

        if (Mr_B == 10){
            System.out.println("You are at correct door");
        }
        else{
            System.out.println("You are at opposite door");
        }
        input.close();
    }
}
