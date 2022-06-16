import java.util.Scanner;
class Vehicle{
    void print1(){
        System.out.println("This is a Vehicle ");
    }   
}
class Bike extends Vehicle{
    @Override
    void print1(){
        System.out.println("This is a Bike");
    }
}
class Car extends Vehicle{
    @Override
    void print1(){
        System.out.println("This is a Car");
    }
}
public class prac5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of wheels : ");
        System.out.println("Enter 2 for Bike ");
        System.out.println("Enter 4 for Cars ");
        int n = sc.nextInt();
        switch(n){
            case 2:
            Bike b = new Bike();
            b.print1();
            break;
            case 4:
            Car c = new Car();
            c.print1();
            break;
            default:
            System.out.println("Enter 2 or 4");


        }
        sc.close();
    }
    
}
