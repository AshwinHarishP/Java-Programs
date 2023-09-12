import java.util.Scanner;
class Traffic_signal{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String state = input.nextLine();
        if (state.equalsIgnoreCase("Red")){
            System.out.println("Stop");
        } 
        else if (state.equalsIgnoreCase("Green")){
            System.out.println("Go");
        }
        else if (state.equalsIgnoreCase("Yellow")){
            System.out.println("Wait");

        }
        else{
            System.out.println("Wrong Inpuy !!!");
        }
     
     input.close();   }
    }
