import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int state = input.nextInt();
        if (state == 0){
            System.out.println("Circuit is off");
        } 
        else if (state == 1){
            System.out.println("Circuit is ON");
        }
        else{
            System.out.println("Circuit is neutral");
     
     input.close();   }
    }
}
