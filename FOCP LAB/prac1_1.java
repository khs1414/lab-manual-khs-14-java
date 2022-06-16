import java.util.Scanner;
public class prac1_1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double add = a+b;
        double sub = a-b;
        double div  = a/b;
        double multi = a*b;
        double modulus = a%b;
        System.out.println(String.format("%f + %f = %f", a,b,add));
        System.out.println(String.format("%f - %f = %f", a,b,sub));
        System.out.println(String.format("%f * %f = %f", a,b,multi));
        System.out.println(String.format("%f / %f = %f", a,b,div));
        System.out.println(String.format("%f % %f = %f", a,b,modulus));
        
        inp.close();
    }
    
}
