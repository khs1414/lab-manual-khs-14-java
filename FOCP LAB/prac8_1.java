import java.util.Scanner;

class InvalidArgumentException  extends Exception  
{  
    public InvalidArgumentException(String str)  
    {   
        super(str);  
    }  
}  
    
public class prac8_1 
{  
  
    static void args_check (int args) throws InvalidArgumentException{    
       if(args < 5){   
        throw new InvalidArgumentException("Arguments less than 5");    
    }  
       else {   
        System.out.println("Enter the terms");   
        }   
     }    
  
    public static void main(String args[])  
    {  
        try  
        {
            int sum = 0;
            Scanner inp = new Scanner(System.in);
            System.out.println("Enter number of arguments");
            int arguments = inp.nextInt();
            args_check(arguments);
            int x;
            for(int i = 0; i<arguments;i++){
                x = inp.nextInt();
                sum = sum + x;
            }
            System.out.println(sum);

        }  
        catch (InvalidArgumentException exception)  
        {  
            System.out.println("Caught the exception");  
            System.out.println("Exception occured: " + exception);  
        }  
    
    }  
}  