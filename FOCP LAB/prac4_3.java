import java.util.Scanner;

public class prac4_3{
    public static void main(String[] args) {
        System.out.println("Enter length and breadth ");
        Scanner inp = new Scanner(System.in);
        int l,b;
        l = inp.nextInt();
        b = inp.nextInt();
        Area case1 = new Area(l,b);
        System.out.print("The area is :");
        System.out.println(case1.returnArea());
        inp.close();
    }
}

class Area {
    int len;
    int width;
    int returnArea(){
        return (this.len) * (this.width);
    }
    Area (int len, int width) {
        this.len = len;
        this.width = width;
    }

}