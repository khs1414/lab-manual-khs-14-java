import java.io.File;

public class prac9_1 {
   public static void main(String[] args) {
      File file = new File("prac9_1.txt");
      if(file.exists()){
        System.out.println("File exists");
      }
      else{
        System.out.println("File doesn't exist");
      }
   }
}