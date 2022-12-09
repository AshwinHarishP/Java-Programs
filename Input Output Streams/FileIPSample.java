import java.io.*;
class FileIPSample{
    public static void main(String arg[]) throws IOException{
         int ch;
         FileInputStream fis = new FileInputStream("IOSample.java");
         System.out.println("Available Bytes: "+ fis.available());
         while((ch = fis.read()) != -1){
         System.out.print((char)ch);
         }
         fis.close();


        int n, size;
        FileInputStream fis = new FileInputStream("IOSample.java");
        System.out.println("Available Bytes: "+ (size = fis.available()));
        n = size/2;
        for(int i = 0; i < n; i++){
            System.out.print((char)fis.read());
        }
        System.out.println("Available Bytes: "+ fis.available());
        fis.skip(20);
        System.out.println("After skip Available Bytes: "+ fis.available());
        fis.close();
    }
}