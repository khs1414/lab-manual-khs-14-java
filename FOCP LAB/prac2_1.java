import java.util.Scanner;

import java.lang.Math;
public class prac2_1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter ax^2 + bx + c");
        System.out.print("Enter a = ");
        double a = inp.nextDouble();
        System.out.print("Enter b = ");
        double b = inp.nextDouble();
        System.out.print("Enter c = ");
        double c = inp.nextDouble();
        double d= b * b - 4.0 * a * c;   
        double d1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
        double d2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
        System.out.println(d1);
        System.out.println(d2);
        if(d1<0.0 || d2<0.0){
            System.out.println("Roots are complex");
            System.out.println(d1+"i");
            System.out.println(d2+"i");
        }
        if(d1>0.0 || d2>0.0){
            if(d1==0){
                System.out.println("Roots are Equal - ");
                System.out.println(d1);
            }
            else{
                System.out.println("Roots are not equal");
                System.out.print(d1);
                System.out.print(d2);
            }
        }
        inp.close();
    }    
}
