import java.io.*;
class StreamSample{
    public static void main(String arg[]) throws IOException{
        int ch = System.in.read();
        System.out.println("ch = "+ ch);
        System.out.println("ch = "+ (char)ch);
        System.err.println("Any error message");
    }
}