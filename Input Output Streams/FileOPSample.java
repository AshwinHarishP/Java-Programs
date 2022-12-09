import java.io.*;

class FileOPSample{
    public static void main(String arg[]) throws IOException{
        int ch;
        FileInputStream fis = new FileInputStream("StreamSample.java");
        FileOutputStream fop = new FileOutputStream("output.txt");
        while((ch = fis.read()) != -1){
            fop.write((char)ch);
        }
        fis.close();
        fop.close();
    }
}