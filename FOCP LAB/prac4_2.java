import java.util.Scanner;
import java.lang.Math;
public class prac4_2{
    public static void main(String[] args) {
        Triangle case1 = new Triangle();
    }
}

class Triangle {
    int s ,s1 ,s2;
    Triangle(){
        s = 3;
        s1 = 4;
        s2= 5;
        int para = s + s1 +s2;
        double sp = para/2;
        double u_r = sp*(sp-s)*(sp-s2)*(sp-s1);
        double area = Math.pow(u_r, 0.5);
        System.out.println("Parameter is : "+para);
        System.out.println("Area is : "+ area);
    }

}