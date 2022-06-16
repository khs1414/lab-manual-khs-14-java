import java.io.*;
import java.util.Scanner;  
public class prac9_4 {  
public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("prac9_4.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);
    String Serial_No;
    String First_name;
    String CGPA;
    char Grade;
    System.out.println("Enter number of entry ");
    Scanner inp = new Scanner(System.in);
    int range = inp.nextInt();
    for(int i = 1; i<=range;i++){
        System.out.println("Enter data of student "+ i);
        System.out.print("Enter name: ");
        First_name = inp.next();
        System.out.print("Enter Serial_No : ");
        Serial_No = inp.next();
        System.out.print("Enter CGPA : ");
        CGPA = inp.next();
        System.out.print("Enter Grade : ");
        Grade = inp.next().trim().charAt(0);
        String line = String.format("%s,%s,%s,%s", Serial_No,First_name,CGPA,Grade);
        buffer.write(line);
        buffer.write("\n");
    }
    System.out.println("Data added"); 
    buffer.close();
    FileReader fileReader = new FileReader("prac9_4.txt");
    BufferedReader buffReader = new BufferedReader(fileReader);
    System.out.println("The contents of the file are: ");
    while (buffReader.ready()) {
        System.out.println(buffReader.readLine());
        }  
    }  
}