/* Scanner can be used to read imput from console, file, string or
any  source that implements Readable interface or ReadableByteChannel
*/
import java.util.Scanner;
import java.io.*;
class ScannerSample{
    public static void main(String arg[]){
        int sum = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            sum += sc.nextInt();
            count++;
        }
        System.out.println("Sum = "+ sum);
        System.out.println("Avg = "+ (sum/count));
        sc.close();
    }

         public static void main(String arg[]) throws IOException{
         FileWriter fw = new FileWriter("data.txt");
         fw.write("101 Anoop True 94.5");
         fw.close();
         FileReader fr = new FileReader("data.txt");
         Scanner sc = new Scanner(fr);
         while(sc.hasNext()){
             if(sc.hasNextInt()){
                 System.out.println("Integer: "+ sc.nextInt());
             }
             else if(sc.hasNextDouble()){
                 System.out.println("Double: "+ sc.nextDouble());
             }
             else if(sc.hasNextBoolean()){
                 System.out.println("Boolean: "+ sc.nextBoolean());
             }
             else if(sc.hasNext()){
                 System.out.println("String: "+ sc.next());
             }
         }   
         sc.close();
     }
}