import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class prac9_2 {
   public static void main(String args[]) throws IOException {      
      File file = new File("prac9_2.txt");
      System.out.println("File created.........");
      FileWriter writer = new FileWriter(file);
      String data = "This is sparta";
      writer.write(data);
      System.out.println("String written");
      file.setReadable(true);
      file.setWritable(true);
      file.setExecutable(true);
      System.out.println("Read, Write and Execute permissions set");
   }
}